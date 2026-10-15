package com.mochaohorizon.sinomagic.data.recipe;

import com.mochaohorizon.sinomagic.registry.ModBlocks;
import com.mochaohorizon.sinomagic.registry.ModItems;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;

public class CraftingRecipes {
    private static void register(RecipeOutput output){
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SALT_BLOCK, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.SALT.get())
                .unlockedBy("has_salt", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.SALT.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath("sinomagic","salt_block"));
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TOFU_BLOCK, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.TOFU.get())
                .unlockedBy("has_tofu", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TOFU.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath("sinomagic","tofu_block"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.VAT, 1)
                .pattern("# #")
                .pattern("# #")
                .pattern("###")
                .define('#', Items.BRICK)
                .unlockedBy("has_brick", InventoryChangeTrigger.TriggerInstance.hasItems(Items.BRICK))
                .save(output, ResourceLocation.fromNamespaceAndPath("sinomagic", "vat"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CHILI_SEED.get(), 2)
                .requires(ModItems.CHILI.get())
                .unlockedBy("has_chili", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.CHILI.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath("sinomagic", "chili_seed"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FROZEN_TOFU.get(), 2)
                .requires(ModItems.TOFU.get())
                .requires(Items.ICE)
                .unlockedBy("has_tofu", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.TOFU.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath("sinomagic", "frozen_tofu"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.YEAST.get(), 2)
                .requires(ModItems.YEAST.get())
                .requires(vectorwing.farmersdelight.common.registry.ModItems.WHEAT_DOUGH.get())
                .requires(Items.WATER_BUCKET)
                .unlockedBy("has_chili", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.YEAST.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath("sinomagic", "yeast"));
    }
}
