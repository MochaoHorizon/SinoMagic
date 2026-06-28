package com.mochaohorizon.sinomagic.data.recipe;

import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
//import vectorwing.farmersdelight.common.crafting.ingredient.ItemAbilityIngredient;
import vectorwing.farmersdelight.common.registry.ModItems;
import vectorwing.farmersdelight.common.tag.CommonTags;
import vectorwing.farmersdelight.data.builder.CuttingBoardRecipeBuilder;
import com.mochaohorizon.sinomagic.common.registry.SinoMagicItems;

public class CuttingRecipes
{
	public static void register(RecipeOutput output) {
		// Knife
		//cuttingAnimalItems(output);
		cuttingVegetables(output);
		//cuttingFoods(output);
		//cuttingFlowers(output);

		// Pickaxe
		//alvagingMinerals(output);
	}

	private static void cuttingVegetables(RecipeOutput output) {
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(SinoMagicItems.DRIED_DOUJIA.get()),
		    Ingredient.of(CommonTags.TOOLS_KNIFE),
	    	SinoMagicItems.DADOU.get(), 8)
	        .build(output);
	    CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(SinoMagicItems.DOUJIA.get()),
		    Ingredient.of(CommonTags.TOOLS_KNIFE),
	    	SinoMagicItems.MAODOU.get(), 8)
	        .build(output);
	    CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(SinoMagicItems.DADOU.get()),
		    Ingredient.of(CommonTags.TOOLS_KNIFE),
	    	SinoMagicItems.DADOU_POWDER.get(), 4)
	        .build(output);
	    CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(SinoMagicItems.REDBEANSHRUB.get()),
		    Ingredient.of(CommonTags.TOOLS_KNIFE),
	    	SinoMagicItems.REDBEANSHRUB_POWDER.get(), 4)
	        .build(output);
	    CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(SinoMagicItems.GREENBEAN.get()),
		    Ingredient.of(CommonTags.TOOLS_KNIFE),
	    	SinoMagicItems.GREENBEAN_POWDER.get(), 4)
	        .build(output);
	}
}
