package com.mochaohorizon.sinomagic.common.block.entity;

import com.mochaohorizon.sinomagic.common.crafting.MillstoneRecipe;
import com.mochaohorizon.sinomagic.common.registry.SinoMagicRecipeTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.crafting.SingleRecipeInput;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import software.bernie.geckolib.animatable.GeoBlockEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.RawAnimation;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.Optional;

import static com.mochaohorizon.sinomagic.common.registry.SinoMagicBlockEntity.Millstone_BlockEntity;

public class MillstoneBlockEntity extends BlockEntity implements GeoBlockEntity {

    //gecko缓存
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
   //NBT
    private ResourceLocation nowRecipeId = null;
    private int processTime = 0;
    //运行缓存
    private MillstoneRecipe nowRecipe = null;

    //方块实体基本代码
    public MillstoneBlockEntity(BlockPos pos, BlockState state) {
        super(Millstone_BlockEntity.get(), pos, state);
    }

    //NBT读写
    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider provider) {
        super.saveAdditional(tag, provider);
        if (nowRecipeId != null) {
            tag.putString("RecipeId", nowRecipeId.toString());
        }
        tag.putInt("ProcessTime", processTime);
    }

    @Override
    public void loadAdditional(CompoundTag tag, HolderLookup.Provider provider) {
        super.loadAdditional(tag, provider);
        processTime = tag.getInt("ProcessTime");
        if (tag.contains("RecipeId")) {
            nowRecipeId = ResourceLocation.tryParse(tag.getString("RecipeId"));
        } else {
            nowRecipeId = null;
        }
    }

    //尝试进原料
    public boolean setIngredient(ItemStack stack, Level level) {
        if (nowRecipe != null || processTime > 0) return false;
        if (stack.isEmpty()) return false;

        RecipeManager manager = level.getRecipeManager();
        SingleRecipeInput input = new SingleRecipeInput(stack);
        Optional<RecipeHolder<MillstoneRecipe>> optional = manager.getRecipeFor(SinoMagicRecipeTypes.MILLSTONERECIPE.get(), input, level);
        if (optional.isPresent()) {
            this.nowRecipe = optional.get().value();
            this.nowRecipeId = this.nowRecipe.getId();
            this.processTime = 0;
            setChanged();
            level.sendBlockUpdated(worldPosition, getBlockState(), getBlockState(), 3);
            return true;
        }
        return false;
    }

    public MillstoneRecipe getNowRecipe() {
        return nowRecipe;
    }

    public int getProcessTime() {
        return processTime;
    }

    public float getProgress() {
        if (nowRecipe == null) return 0f;
        return (float) processTime / getNowRecipe().getProcessTime();
    }

    public boolean isProcessing() {
        return nowRecipe != null;
    }

    //服务器Tick
    public static void tick(Level level, BlockPos pos, BlockState state, MillstoneBlockEntity be) {
        if (level.isClientSide) return;

        //如果 currentRecipe 为 null 但存在 recipeId，尝试重新加载
        if (be.getNowRecipe() == null && be.nowRecipeId != null) {
            be.nowRecipe = level.getRecipeManager()
                    .byKey(be.nowRecipeId)
                    .filter(holder -> holder.value() instanceof MillstoneRecipe)
                    .map(holder -> (MillstoneRecipe) holder.value())
                    .orElse(null);
            if (be.nowRecipe == null) {
                be.nowRecipeId = null;
                be.processTime = 0;
                be.setChanged();
            }
        }

        if (be.nowRecipe != null) {
            be.processTime++;
            be.setChanged();

            if (be.processTime >= be.getNowRecipe().getProcessTime()) {
                //完成研磨，喷掉落物
                ItemStack result = be.getNowRecipe().getResult().copy();
                ItemEntity itemEntity = new ItemEntity(
                        level,
                        pos.getX() + 0.5,
                        pos.getY() + 1.5,
                        pos.getZ() + 0.5,
                        result
                );
                itemEntity.setDefaultPickUpDelay();
                level.addFreshEntity(itemEntity);

                //重置
                be.nowRecipe = null;
                be.nowRecipeId = null;
                be.processTime = 0;
                be.setChanged();
                level.sendBlockUpdated(pos, state, state, 3);
            }
        } else {
            if (be.processTime != 0) {
                be.processTime = 0;
                be.setChanged();
            }
        }
    }

    //GeckoLib动画
    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, "rotation_controller", 0, state -> {
            if (this.isProcessing()) {
                return state.setAndContinue(RawAnimation.begin().thenLoop("rotation_animation"));
            } else {
                //停止并回到初始状态
                return PlayState.STOP;
            }
        }));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

    //网络同步
    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider provider) {
        CompoundTag tag = super.getUpdateTag(provider);
        saveAdditional(tag, provider);
        return tag;
    }

    @Override
    public void handleUpdateTag(CompoundTag tag, HolderLookup.Provider provider) {
        loadAdditional(tag, provider);
    }

    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }
}
