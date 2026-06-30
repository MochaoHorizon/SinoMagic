package com.mochaohorizon.sinomagic.data.recipe;

import com.mochaohorizon.sinomagic.SinoMagic;
import com.mochaohorizon.sinomagic.common.registry.SinoMagicBlocks;
import com.mochaohorizon.sinomagic.common.registry.SinoMagicItems;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.ShapedRecipe;
import vectorwing.farmersdelight.common.registry.ModItems;

public class CraftingRecipes {
    private static void register(RecipeOutput output){
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, SinoMagicBlocks.SALT_BLOCK, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', SinoMagicItems.SALT.get())
                .unlockedBy("has_salt", InventoryChangeTrigger.TriggerInstance.hasItems(SinoMagicItems.SALT.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath("SinoMagic","salt_block"));
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, SinoMagicBlocks.TOFU_BLOCK, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', SinoMagicItems.TOFU.get())
                .unlockedBy("has_tofu", InventoryChangeTrigger.TriggerInstance.hasItems(SinoMagicItems.TOFU.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath("SinoMagic","tofu_block"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SinoMagicBlocks.DAGANG, 1)
                .pattern("# #")
                .pattern("# #")
                .pattern("###")
                .define('#', Items.BRICK)
                .unlockedBy("has_brick", InventoryChangeTrigger.TriggerInstance.hasItems(Items.BRICK))
                .save(output, ResourceLocation.fromNamespaceAndPath("SinoMagic", "dagang"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, SinoMagicItems.CHILI_SEED.get(), 2)
                .requires(SinoMagicItems.CHILI.get())
                .unlockedBy("has_chili", InventoryChangeTrigger.TriggerInstance.hasItems(SinoMagicItems.CHILI.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath("SinoMagic", "chili_seed"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, SinoMagicItems.FROZEN_TOFU.get(), 2)
                .requires(SinoMagicItems.TOFU.get())
                .requires(Items.ICE)
                .unlockedBy("has_tofu", InventoryChangeTrigger.TriggerInstance.hasItems(SinoMagicItems.TOFU.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath("SinoMagic", "frozen_tofu"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, SinoMagicItems.YEAST.get(), 2)
                .requires(SinoMagicItems.YEAST.get())
                .requires(ModItems.WHEAT_DOUGH.get())
                .requires(Items.WATER_BUCKET)
                .unlockedBy("has_chili", InventoryChangeTrigger.TriggerInstance.hasItems(SinoMagicItems.YEAST.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath("SinoMagic", "yeast"));
    }
}
