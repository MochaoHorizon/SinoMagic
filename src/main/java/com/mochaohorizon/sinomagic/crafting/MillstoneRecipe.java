package com.mochaohorizon.sinomagic.crafting;

import com.mochaohorizon.sinomagic.registry.ModRecipeTypes;
import com.mochaohorizon.sinomagic.registry.ModSerializers;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;

public class MillstoneRecipe implements Recipe<SingleRecipeInput> {
    //配方类
    private final Ingredient ingredient;
    private final int ingredientCount;
    private final int processTime;
    private final ItemStack result;

    public MillstoneRecipe(Ingredient ingredient, int ingredientCount, int processTime, ItemStack result) {
        this.ingredient = ingredient;
        this.ingredientCount =ingredientCount;
        this.processTime = processTime;
        this.result = result;
    }

    @Override
    public NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> list = NonNullList.create();
        list.add(this.ingredient);
        return list;
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return width * height >= 1;
    }

    @Override
    public boolean matches(SingleRecipeInput input, Level level) {
        return ingredient.test(input.item());
    }

    @Override
    public ItemStack getResultItem(HolderLookup.Provider registries) {
        return this.result;
    }

    @Override
    public ItemStack assemble(SingleRecipeInput input, HolderLookup.Provider registries) {
        return this.result.copy();
    }

    public RecipeType<?> getType() {
        return ModRecipeTypes.MILLSTONERECIPE.get();
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModSerializers.MILLSTONESERIALIZER.get();
    }

    //自定义.get()
    public Ingredient getIngredient() {
        return ingredient;
    }
    public int getIngredientCount() {
        return ingredientCount;
    }
    public int getProcessTime() {
        return processTime;
    }
    public ItemStack getResult() {
        return result;
    }
}
