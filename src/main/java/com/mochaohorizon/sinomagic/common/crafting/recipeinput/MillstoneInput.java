package com.mochaohorizon.sinomagic.common.crafting.recipeinput;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeInput;
import net.minecraft.world.level.block.state.BlockState;

public record MillstoneInput(BlockState block, ItemStack slot) implements RecipeInput {

    /*public Blocks getBlock(String name) {
        if (name != sinomagic:millstone);
        return this.block();
    }*/

    public ItemStack getItem(int slot) {
        if (slot != 0)
            throw new IllegalArgumentException("索引无项目" + slot);
        return this.slot();
    }

    @Override
    public int size() {
        return 1;
    }
}
