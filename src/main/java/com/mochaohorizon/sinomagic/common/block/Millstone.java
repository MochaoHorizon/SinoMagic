package com.mochaohorizon.sinomagic.common.block;

import com.mochaohorizon.sinomagic.common.block.entity.MillstoneBlockEntity;
import com.mochaohorizon.sinomagic.common.crafting.MillstoneRecipe;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

import javax.annotation.Nullable;

public class Millstone extends Block implements EntityBlock {
    public Millstone(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new MillstoneBlockEntity(pos, state);
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }

    @Override
    @Nullable
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
        //只在服务端Tick
        return level.isClientSide ? null : (lvl, pos, st, be) -> {
            if (be instanceof MillstoneBlockEntity mill) {
                MillstoneBlockEntity.tick(lvl, pos, st, mill);
            }
        };
    }

    public InteractionResult use(BlockState state, Level level, BlockPos pos,
                                 Player player, InteractionHand hand, BlockHitResult hit) {
        if (level.isClientSide) return InteractionResult.SUCCESS;

        BlockEntity be = level.getBlockEntity(pos);
        if (!(be instanceof MillstoneBlockEntity mill)) {
            return InteractionResult.PASS;
        }

        //潜行右键丢入原料
        if (player.isShiftKeyDown()) {
            ItemStack held = player.getItemInHand(hand);
            if (held.isEmpty()) {
                return InteractionResult.FAIL;
            }

            // 尝试匹配配方
            if (mill.setIngredient(held, level)) {
                MillstoneRecipe recipe = mill.getNowRecipe();
                if (recipe != null) {
                    // 消耗指定数量的物品
                    int required = recipe.getIngredientCount();
                    int removed = 0;
                    for (int i = 0; i < player.getInventory().getContainerSize(); i++) {
                        ItemStack stack = player.getInventory().getItem(i);
                        if (ItemStack.isSameItemSameComponents(stack, held)) {
                            int toRemove = Math.min(required - removed, stack.getCount());
                            stack.shrink(toRemove);
                            removed += toRemove;
                            if (removed >= required) break;
                        }
                    }
                    return InteractionResult.SUCCESS;
                }
            } else {
                player.sendSystemMessage(Component.literal("这个物品磨不了"));
                return InteractionResult.FAIL;
            }
        }

        //普通右键消耗饥饿值
        player.getFoodData().addExhaustion(4.0F);
        return InteractionResult.SUCCESS;
    }
}
