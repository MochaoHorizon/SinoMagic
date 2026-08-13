package com.mochaohorizon.sinomagic.common.registry;

import com.mochaohorizon.sinomagic.SinoMagic;
import com.mochaohorizon.sinomagic.common.crafting.MillstoneSerializer;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class SinoMagicSerializer {
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS =
            DeferredRegister.create(Registries.RECIPE_SERIALIZER, SinoMagic.MOD_ID);

    public static final Supplier<RecipeSerializer<?>> MILLSTONESERIALIZER =
            RECIPE_SERIALIZERS.register("millstone_serializer", MillstoneSerializer::new);
}
