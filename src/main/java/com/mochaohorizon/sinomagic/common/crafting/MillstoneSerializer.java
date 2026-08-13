package com.mochaohorizon.sinomagic.common.crafting;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;

public class MillstoneSerializer implements RecipeSerializer<MillstoneRecipe> {
    public static final MapCodec<MillstoneRecipe> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group(
            ResourceLocation.CODEC.fieldOf("id").forGetter(MillstoneRecipe::getId),
            Ingredient.CODEC_NONEMPTY.fieldOf("ingredient").forGetter(MillstoneRecipe::getIngredient),
            Codec.INT.fieldOf("ingredientCount").forGetter(MillstoneRecipe::getIngredientCount),
            net.minecraft.util.ExtraCodecs.POSITIVE_INT.fieldOf("processTime").forGetter(MillstoneRecipe::getProcessTime),
            ItemStack.SINGLE_ITEM_CODEC.fieldOf("result").forGetter(MillstoneRecipe::getResult)
        ).apply(instance, (id, ingredient, ingredientCount, processTime, result) ->
            new MillstoneRecipe(id, ingredient, ingredientCount, processTime, result))
    );

    public static final StreamCodec<RegistryFriendlyByteBuf, MillstoneRecipe> STREAM_CODEC =
        StreamCodec.composite(
            Ingredient.CONTENTS_STREAM_CODEC, MillstoneRecipe::getIngredient,
            ByteBufCodecs.INT, MillstoneRecipe::getIngredientCount,
            ByteBufCodecs.INT, MillstoneRecipe::getProcessTime,
            ItemStack.STREAM_CODEC, MillstoneRecipe::getResult,
            (ingredient, count, time, result) ->
                new MillstoneRecipe(null, ingredient, count, time, result)
        );

        @Override
        public MapCodec<MillstoneRecipe> codec() {
            return CODEC;
        }

        @Override
        public StreamCodec<RegistryFriendlyByteBuf, MillstoneRecipe> streamCodec() {
            return STREAM_CODEC;
        }
}
