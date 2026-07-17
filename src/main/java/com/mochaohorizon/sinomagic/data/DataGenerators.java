package com.mochaohorizon.sinomagic.data;

import com.mochaohorizon.sinomagic.SinoMagic;
import com.mochaohorizon.sinomagic.common.crafting.recipeinput.MillstoneInput;
import com.mochaohorizon.sinomagic.data.recipe.MillstoneRecipes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.crafting.CraftingInput;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.event.entity.player.UseItemOnBlockEvent;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

import static com.mochaohorizon.sinomagic.common.registry.SinoMagicRecipeTypes.MILLSTONE;

@EventBusSubscriber(modid = SinoMagic.MOD_ID)

public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(
                event.includeClient(),
                new ItemModels(packOutput, existingFileHelper)
        );

        //被com.~.data.recipe.MillstoneRecipes使用
        generator.addProvider(
                event.includeServer(),
                new MillstoneRecipes(output, lookupProvider)
        );
    }

    //石磨右键
    @SubscribeEvent
    public static void useMillstone(Event event) {
            if (event.getUsePhase() != UseItemOnBlockEvent.UsePhase.BLOCK) return;
            UseOnContext context = event.getUseOnContext();
            Level level = context.getLevel();
            BlockPos pos = context.getClickedPos();
            BlockState blockState = level.getBlockState(pos);
            ItemStack itemStack = context.getItemInHand();
            RecipeManager recipes = level.getRecipeManager();
            MillstoneInput input = new MillstoneInput(blockState, itemStack);
            Optional<RecipeHolder<? extends Recipe<CraftingInput>>> optional = recipes.getRecipeFor(
                     MILLSTONE,
input,
level
                );
            ItemStack result = optional
                   .map(RecipeHolder::value)
                   .map(e -> e.assemble(input, level.registryAccess()))
                   .orElse(ItemStack.EMPTY);
            if (!result.isEmpty()) {
                level.removeBlock(pos, false);
                if (!level.isClientSide()) {
                    ItemEntity entity = new ItemEntity(level,
                            pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5,
                            result);
                    level.addFreshEntity(entity);
                }
                event.cancelWithResult(ItemInteractionResult.sidedSuccess(level.isClientSide));
            }
    }
}
