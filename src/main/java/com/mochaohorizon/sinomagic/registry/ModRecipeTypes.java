package com.mochaohorizon.sinomagic.registry;

import com.mochaohorizon.sinomagic.SinoMagic;
import com.mochaohorizon.sinomagic.crafting.MillstoneRecipe;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModRecipeTypes {
    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES =
            DeferredRegister.create(Registries.RECIPE_TYPE, SinoMagic.MOD_ID);

    public static final Supplier<RecipeType<MillstoneRecipe>> MILLSTONERECIPE =
            RECIPE_TYPES.register(
                    "millstonerecipe",
                    () -> RecipeType.simple(ResourceLocation.fromNamespaceAndPath(SinoMagic.MOD_ID, "millstonerecipe"))
            );

    public static void register(IEventBus eventBus) {
        RECIPE_TYPES.register(eventBus);
    }
}
