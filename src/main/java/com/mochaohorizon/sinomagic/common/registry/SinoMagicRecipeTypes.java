package com.mochaohorizon.sinomagic.common.registry;

import com.mochaohorizon.sinomagic.SinoMagic;
import com.mochaohorizon.sinomagic.common.crafting.recipeclass.Millstone;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeType;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class SinoMagicRecipeTypes {
    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES =
            DeferredRegister.create(Registries.RECIPE_TYPE, SinoMagic.MOD_ID);

    public static final Supplier<RecipeType<Millstone>> MILLSTONE =
            RECIPE_TYPES.register(
                    "millstone",
                    () -> RecipeType.<Millstone>simple(ResourceLocation.fromNamespaceAndPath(SinoMagic.MOD_ID, "millstone"))
            );
}
