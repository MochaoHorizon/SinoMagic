package com.mochaohorizon.sinomagic.common.crafting.recipeclass;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import static com.mochaohorizon.sinomagic.common.registry.SinoMagicRecipeTypes.MILLSTONE;
import static com.mochaohorizon.sinomagic.common.registry.SinoMagicSerializer.MILLSTONE_SERIALIZER;

public class Millstone implements Recipe<SingleRecipeInput> {
    private final ResourceLocation id;
    private final BlockState inputState;
    private final Ingredient ingredient;
    private final int ingredientCount;
    private final int processTime;
    private final ItemStack result;

    public Millstone(ResourceLocation id, BlockState inputState, Ingredient ingredient, int ingredientCount, int processTime, ItemStack result) {
        this.id = id;
        this.inputState = inputState;
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

    public ResourceLocation getId() {
        return id;
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

    @Override
    public RecipeType<?> getType() {
        return MILLSTONE.get();
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return MILLSTONE_SERIALIZER.get();
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