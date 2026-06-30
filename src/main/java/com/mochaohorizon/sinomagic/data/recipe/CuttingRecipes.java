package com.mochaohorizon.sinomagic.data.recipe;

import net.minecraft.data.recipes.RecipeOutput;
//import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.ItemAbilities;
import vectorwing.farmersdelight.common.crafting.ingredient.ItemAbilityIngredient;
import vectorwing.farmersdelight.common.tag.CommonTags;
import vectorwing.farmersdelight.data.builder.CuttingBoardRecipeBuilder;
import com.mochaohorizon.sinomagic.common.registry.SinoMagicItems;

public class CuttingRecipes
{
	private static void register(RecipeOutput output) {
		// Knife菜刀
		//cuttingAnimalItems(output);
		cuttingVegetables(output);
		//cuttingFoods(output);
		//cuttingFlowers(output);

		// Pickaxe镐子
		salvagingMinerals(output);

		// Axe斧子
		//strippingWood(output);
		//salvagingWoodenFurniture(output);

		// Shovel铲子
		//diggingSediments(output);

		// Shears剪子
		//salvagingUsingShears(output);
	}

	private static void salvagingMinerals(RecipeOutput output) {
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(SinoMagicItems.DADOU.get()),
				new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG).toVanilla(), SinoMagicItems.DADOU_POWDER.get(), 4)
				.build(output);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(SinoMagicItems.REDBEANSHRUB.get()),
				new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG).toVanilla(), SinoMagicItems.REDBEANSHRUB_POWDER.get(), 2)
				.build(output);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(SinoMagicItems.GREENBEAN.get()),
				new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG).toVanilla(), SinoMagicItems.GREENBEAN_POWDER.get(), 2)
				.build(output);
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
	}
}
