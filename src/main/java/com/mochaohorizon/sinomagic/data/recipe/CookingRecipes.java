package com.mochaohorizon.sinomagic.data.recipe;

import com.mochaohorizon.sinomagic.registry.ModItems;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Items;
import vectorwing.farmersdelight.client.recipebook.CookingPotRecipeBookTab;
import vectorwing.farmersdelight.data.builder.CookingPotRecipeBuilder;

public class CookingRecipes
{
	public static final int FAST_COOKING = 100;      // 5 seconds
	public static final int NORMAL_COOKING = 200;    // 10 seconds
	public static final int SLOW_COOKING = 400;      // 20 seconds

	public static final float SMALL_EXP = 0.35F;
	public static final float MEDIUM_EXP = 1.0F;
	public static final float LARGE_EXP = 2.0F;

	public static void register(RecipeOutput output) {
		cookMiscellaneous(output);
		//cookMinecraftSoups(output);
		//cookMeals(output);
	}

	private static void cookMiscellaneous(RecipeOutput output) {
	    CookingPotRecipeBuilder.cookingPotRecipe(ModItems.SOY_MILK_BOTTLE.get(), 1, NORMAL_COOKING, SMALL_EXP, Items.GLASS_BOTTLE)
				.addIngredient(ModItems.SOYBEAN_POWDER.get())
				.addIngredient(Items.WATER_BUCKET)
				.unlockedByAnyIngredient(ModItems.SOYBEAN_POWDER.get())
				.setRecipeBookTab(CookingPotRecipeBookTab.DRINKS)
				.save(output);
		CookingPotRecipeBuilder.cookingPotRecipe(ModItems.TOFU.get(), 2, NORMAL_COOKING, SMALL_EXP)
				.addIngredient(ModItems.SOY_MILK_BOTTLE.get())
				.addIngredient(ModItems.MARINADE_BOTTLE.get())
				.unlockedByAnyIngredient(ModItems.SOY_MILK_BOTTLE.get(), ModItems.MARINADE_BOTTLE.get())
				.setRecipeBookTab(CookingPotRecipeBookTab.MISC)
				.save(output);
		CookingPotRecipeBuilder.cookingPotRecipe(ModItems.MARINADE_BOTTLE.get(), 1, FAST_COOKING, MEDIUM_EXP, Items.GLASS_BOTTLE)
				.addIngredient(Items.WATER_BUCKET)
				.unlockedByAnyIngredient(Items.WATER_BUCKET)
				.setRecipeBookTab(CookingPotRecipeBookTab.MISC)
				.save(output);
		CookingPotRecipeBuilder.cookingPotRecipe(ModItems.HAIRY_TOFU.get(), 1, NORMAL_COOKING, SMALL_EXP)
				.addIngredient(ModItems.YEAST.get())
				.addIngredient(ModItems.TOFU.get())
				.unlockedByAnyIngredient(ModItems.TOFU.get(), ModItems.YEAST.get())
				.setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
				.save(output);
	    CookingPotRecipeBuilder.cookingPotRecipe(ModItems.FERMENTED_BEAN_CURD.get(), 2, NORMAL_COOKING, MEDIUM_EXP)
				.addIngredient(ModItems.HAIRY_TOFU.get())
				.addIngredient(ModItems.SALT.get())
				.unlockedByAnyIngredient(ModItems.HAIRY_TOFU.get())
				.setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
				.save(output);
	    CookingPotRecipeBuilder.cookingPotRecipe(ModItems.TOFU_SKIN.get(), 2, NORMAL_COOKING, MEDIUM_EXP)
				.addIngredient(ModItems.SOY_MILK_BOTTLE.get())
				.unlockedByAnyIngredient(ModItems.SOY_MILK_BOTTLE.get(), ModItems.TOFU.get())
				.setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
				.save(output);
	    CookingPotRecipeBuilder.cookingPotRecipe(ModItems.LATIAO.get(), 2, SLOW_COOKING, LARGE_EXP)
				.addIngredient(ModItems.TOFU_SKIN.get())
				.addIngredient(ModItems.CHILI.get())
				.addIngredient(ModItems.SOYBEAN_OIL_BOTTLE.get())
				.unlockedByAnyIngredient(ModItems.TOFU_SKIN.get())
				.setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
				.save(output);
	    CookingPotRecipeBuilder.cookingPotRecipe(ModItems.DRIED_TOFU.get(), 2, SLOW_COOKING, LARGE_EXP)
				.addIngredient(ModItems.SOY_MILK_BOTTLE.get())
				.addIngredient(ModItems.SOYBEAN_OIL_BOTTLE.get())
				.addIngredient(ModItems.MARINADE_BOTTLE.get())
				.unlockedByAnyIngredient(ModItems.SOY_MILK_BOTTLE.get(), ModItems.LATIAO.get())
				.setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
				.save(output);
   }
}