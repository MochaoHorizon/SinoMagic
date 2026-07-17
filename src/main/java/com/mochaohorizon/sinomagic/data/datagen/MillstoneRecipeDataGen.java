package com.mochaohorizon.sinomagic.data.datagen;

import com.mochaohorizon.sinomagic.common.crafting.recipeclass.Millstone;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRequirements;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.state.BlockState;

public class MillstoneRecipeDataGen extends StandardRecipeDataGen {
    private final BlockState inputState;
    private final Ingredient inputItem;
    public MillstoneRecipeDataGen(ItemStack result, BlockState inputState, Ingredient inputItem) {
            super(result);
            this.inputState = inputState;
            this.inputItem = inputItem;
        }

        @Override
        public void save(RecipeOutput output, ResourceLocation id) {
            Advancement.Builder advancement = output.advancement()
                    .addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(id))
                    .rewards(AdvancementRewards.Builder.recipe(id))
                    .requirements(AdvancementRequirements.Strategy.OR);
            this.criteria.forEach(advancement::addCriterion);
            Millstone recipe = new Millstone(this.inputState, this.inputItem, this.result);
            output.accept(id, recipe, advancement.build(id.withPrefix("recipes/")));
        }
}
