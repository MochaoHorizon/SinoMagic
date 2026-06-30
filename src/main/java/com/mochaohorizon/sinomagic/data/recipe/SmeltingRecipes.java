package com.mochaohorizon.sinomagic.data.recipe;

import com.mochaohorizon.sinomagic.common.registry.SinoMagicItems;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public class SmeltingRecipes {
    private static void register(RecipeOutput output) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.WATER_BUCKET), RecipeCategory.FOOD, SinoMagicItems.SALT.get(), 0.35F, 150)
                .unlockedBy("has_water_bucket", InventoryChangeTrigger.TriggerInstance.hasItems(Items.WATER_BUCKET))
                .save(output, ResourceLocation.fromNamespaceAndPath("SinoMagic","salt_block"));
    }
}
