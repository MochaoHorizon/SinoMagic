package com.mochaohorizon.sinomagic.common.crafting.recipeserializer;

import com.mochaohorizon.sinomagic.common.crafting.recipeclass.Millstone;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class MillstoneSerializer implements RecipeSerializer<Millstone> {
    public static final MapCodec<Millstone> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
            BlockState.CODEC.fieldOf("state").forGetter(Millstone::getInputState),
            Ingredient.CODEC.fieldOf("ingredient").forGetter(Millstone::getInputItem),
            ItemStack.CODEC.fieldOf("result").forGetter(Millstone::getResult)
    ).apply(inst, Millstone::new));
    public static final StreamCodec<RegistryFriendlyByteBuf, Millstone> STREAM_CODEC =
            StreamCodec.composite(
                    ByteBufCodecs.idMapper(Block.BLOCK_STATE_REGISTRY), Millstone::getInputState,
                    Ingredient.CONTENTS_STREAM_CODEC, Millstone::getInputItem,
                    ItemStack.STREAM_CODEC, Millstone::getResult,
                    Millstone::new
            );

    @Override
    public MapCodec<Millstone> codec() {
        return CODEC;
    }

    @Override
    public StreamCodec<RegistryFriendlyByteBuf, Millstone> streamCodec() {
        return STREAM_CODEC;
    }
}