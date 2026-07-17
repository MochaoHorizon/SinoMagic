package com.mochaohorizon.sinomagic.common.crafting.recipeclass;

import com.mochaohorizon.sinomagic.common.crafting.recipeinput.MillstoneInput;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import static com.mochaohorizon.sinomagic.common.registry.SinoMagicRecipeTypes.MILLSTONE;
import static com.mochaohorizon.sinomagic.common.registry.SinoMagicSerializer.MILLSTONE_SERIALIZER;

public class Millstone implements Recipe<MillstoneInput> {
        private final BlockState inputState;
        private final Ingredient inputItem;
        private final ItemStack result;

        public Millstone(BlockState inputState, Ingredient inputItem, ItemStack result) {
            this.inputState = inputState;
            this.inputItem = inputItem;
            this.result = result;
        }

        @Override
        public NonNullList<Ingredient> getIngredients() {
            NonNullList<Ingredient> list = NonNullList.create();
            list.add(this.inputItem);
            return list;
        }

        @Override
        public boolean canCraftInDimensions(int width, int height) {
            return width * height >= 1;
        }

        public boolean matches(MillstoneInput input, Level level) {
            return this.inputState == input.block() && this.inputItem.test(input.slot());
        }

        @Override
        public ItemStack getResultItem(HolderLookup.Provider registries) {
            return this.result;
        }

        public ItemStack assemble(MillstoneInput input, HolderLookup.Provider registries) {
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
}