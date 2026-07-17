package com.mochaohorizon.sinomagic.data.datagen;

import net.minecraft.advancements.Criterion;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class StandardRecipeDataGen implements RecipeBuilder {
        protected final ItemStack result;
        protected final Map<String, Criterion<?>> criteria = new LinkedHashMap<>();
        @Nullable
        protected String group;

        public StandardRecipeDataGen(ItemStack result) {
            this.result = result;
        }

        @Override
        public StandardRecipeDataGen unlockedBy(String name, Criterion<?> criterion) {
            this.criteria.put(name, criterion);
            return this;
        }

        @Override
        public StandardRecipeDataGen group(@Nullable String group) {
            this.group = group;
            return this;
        }

        @Override
        public Item getResult() {
            return this.result.getItem();
        }
}
