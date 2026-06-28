package com.mochaohorizon.sinomagic.data.recipe;

import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Items;
import vectorwing.farmersdelight.client.recipebook.CookingPotRecipeBookTab;
import vectorwing.farmersdelight.data.builder.CookingPotRecipeBuilder;
import com.mochaohorizon.sinomagic.common.registry.SinoMagicItems;

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
	    CookingPotRecipeBuilder.cookingPotRecipe(SinoMagicItems.SOYAMILK_BOTTLE.get(), 1, NORMAL_COOKING, SMALL_EXP, Items.GLASS_BOTTLE)
				.addIngredient(SinoMagicItems.DADOU_POWDER.get())
				.addIngredient(Items.WATER_BUCKET)
				.unlockedByAnyIngredient(SinoMagicItems.DADOU_POWDER.get())
				.setRecipeBookTab(CookingPotRecipeBookTab.DRINKS)
				.build(output);
		CookingPotRecipeBuilder.cookingPotRecipe(SinoMagicItems.DADOU_OIL_BOTTLE.get(), 1, NORMAL_COOKING, SMALL_EXP, Items.GLASS_BOTTLE)
				.addIngredient(SinoMagicItems.DADOU.get())
				.unlockedByAnyIngredient(SinoMagicItems.DADOU.get())
				.setRecipeBookTab(CookingPotRecipeBookTab.MISC)
				.build(output);
	    CookingPotRecipeBuilder.cookingPotRecipe(SinoMagicItems.DREGS_DADOU.get(), 1, NORMAL_COOKING, SMALL_EXP)
				.addIngredient(SinoMagicItems.DADOU.get())
				.unlockedByAnyIngredient(SinoMagicItems.DADOU.get())
				.setRecipeBookTab(CookingPotRecipeBookTab.MISC)
				.build(output);
		CookingPotRecipeBuilder.cookingPotRecipe(SinoMagicItems.TOFU.get(), 2, NORMAL_COOKING, SMALL_EXP)
				.addIngredient(SinoMagicItems.SOYAMILK_BOTTLE.get())
				.addIngredient(SinoMagicItems.LUZHI_BOTTLE.get())
				.unlockedByAnyIngredient(SinoMagicItems.SOYAMILK_BOTTLE.get(), SinoMagicItems.LUZHI_BOTTLE.get())
				.setRecipeBookTab(CookingPotRecipeBookTab.MISC)
				.build(output);
		CookingPotRecipeBuilder.cookingPotRecipe(SinoMagicItems.LUZHI_BOTTLE.get(), 1, FAST_COOKING, MEDIUM_EXP, Items.GLASS_BOTTLE)
				.addIngredient(Items.WATER_BUCKET)
				.unlockedByAnyIngredient(SinoMagicItems.SALT.get())
				.setRecipeBookTab(CookingPotRecipeBookTab.MISC)
				.build(output);
		CookingPotRecipeBuilder.cookingPotRecipe(SinoMagicItems.SALT.get(), 2, FAST_COOKING, MEDIUM_EXP)
				.addIngredient(Items.WATER_BUCKET)
				.unlockedByAnyIngredient(Items.WATER_BUCKET)
				.setRecipeBookTab(CookingPotRecipeBookTab.MISC)
				.build(output);
		CookingPotRecipeBuilder.cookingPotRecipe(SinoMagicItems.MOULD_TOFU.get(), 1, NORMAL_COOKING, SMALL_EXP)
				.addIngredient(SinoMagicItems.YEAST.get())
				.addIngredient(SinoMagicItems.TOFU.get())
				.unlockedByAnyIngredient(SinoMagicItems.TOFU.get(), SinoMagicItems.YEAST.get())
				.setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
				.build(output);
	    CookingPotRecipeBuilder.cookingPotRecipe(SinoMagicItems.FURU.get(), 2, NORMAL_COOKING, MEDIUM_EXP)
				.addIngredient(SinoMagicItems.MOULD_TOFU.get())
				.addIngredient(SinoMagicItems.SALT.get())
				.unlockedByAnyIngredient(SinoMagicItems.MOULD_TOFU.get())
				.setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
				.build(output);
	    CookingPotRecipeBuilder.cookingPotRecipe(SinoMagicItems.DOUPI.get(), 1, NORMAL_COOKING, MEDIUM_EXP)
				.addIngredient(SinoMagicItems.SOYAMILK_BOTTLE.get())
				.unlockedByAnyIngredient(SinoMagicItems.SOYAMILK_BOTTLE.get(), SinoMagicItems.TOFU.get())
				.setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
				.build(output);
	    CookingPotRecipeBuilder.cookingPotRecipe(SinoMagicItems.SPICY_GLUTEN.get(), 2, SLOW_COOKING, LARGE_EXP)
				.addIngredient(SinoMagicItems.DOUPI.get())
				.addIngredient(SinoMagicItems.CHILI.get())
				.addIngredient(SinoMagicItems.DADOU_OIL_BOTTLE.get())
				.unlockedByAnyIngredient(SinoMagicItems.DOUPI.get())
				.setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
				.build(output);
	    CookingPotRecipeBuilder.cookingPotRecipe(SinoMagicItems.DRIED_TOFU.get(), 2, SLOW_COOKING, LARGE_EXP)
				.addIngredient(SinoMagicItems.SOYAMILK_BOTTLE.get())
				.addIngredient(SinoMagicItems.DADOU_OIL_BOTTLE.get())
				.addIngredient(SinoMagicItems.LUZHI_BOTTLE.get())
				.unlockedByAnyIngredient(SinoMagicItems.SOYAMILK_BOTTLE.get(), SinoMagicItems.SPICY_GLUTEN.get())
				.setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
				.build(output);
   }
}