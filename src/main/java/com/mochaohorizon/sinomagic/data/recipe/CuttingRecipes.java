package com.mochaohorizon.sinomagic.data.recipe;

import com.mochaohorizon.sinomagic.common.registry.ModItems;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.ItemAbilities;
import vectorwing.farmersdelight.common.crafting.ingredient.ItemAbilityIngredient;
import vectorwing.farmersdelight.common.tag.CommonTags;
import vectorwing.farmersdelight.data.builder.CuttingBoardRecipeBuilder;

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
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(ModItems.SOYBEAN.get()),
				new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG).toVanilla(), ModItems.SOYBEAN_POWDER.get(), 4)
				.save(output);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(ModItems.RED_BEAN.get()),
				new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG).toVanilla(), ModItems.RED_BEAN_PASTE.get(), 2)
				.save(output);
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(ModItems.MUNG_BEAN.get()),
				new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG).toVanilla(), ModItems.MUNG_BEAN_PASTE.get(), 2)
				.save(output);
	}

	private static void cuttingVegetables(RecipeOutput output) {
		CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(ModItems.DRIED_SOYBEAN_POD.get()),
		    Ingredient.of(CommonTags.Items.TOOLS_KNIFE),
	    	ModItems.SOYBEAN.get(), 8)
	        .save(output);
	    CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(ModItems.SOYBEAN_POD.get()),
		    Ingredient.of(CommonTags.Items.TOOLS_KNIFE),
	    	ModItems.EDAMAME.get(), 8)
	        .save(output);
	}
}
