package com.mochaohorizon.sinomagic.registry;

import com.mochaohorizon.sinomagic.SinoMagic;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

/**
 * 5 种流体的 FluidType 注册。
 *
 * <p>几个数值的含义：密度 density 以水（1000）为基准，大于水会下沉、小于水会上浮；粘度 viscosity 越大流得越慢。
 * 这些流体都不是水，所以一律不可游泳、不会溺水、不支持行船，也不会像水那样形成无限源。</p>
 *
 * <p>语言的 key 走 NeoForge 默认的 {@code fluid_type.sinomagic.<id>}，四条语言文件里已有对应条目。</p>
 */
public class ModFluidTypes {
    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(NeoForgeRegistries.Keys.FLUID_TYPES, SinoMagic.MOD_ID);

    //密度 900：比水轻，倒进水里会浮在上层。油遇火只会烧得更旺，所以不灭火
    public static final DeferredHolder<FluidType, FluidType> SOYBEAN_OIL =
            register("soybean_oil", 900, 1800, false);
    //密度 1150：比水重，倒进水里会沉底
    public static final DeferredHolder<FluidType, FluidType> SOY_SAUCE =
            register("soy_sauce", 1150, 1200, true);
    public static final DeferredHolder<FluidType, FluidType> SOY_MILK =
            register("soy_milk", 1030, 1400, true);
    public static final DeferredHolder<FluidType, FluidType> MARINADE =
            register("marinade", 1100, 2000, true);
    //密度与粘度都是最高的一档：名副其实的一坨
    public static final DeferredHolder<FluidType, FluidType> SHIT =
            register("shit", 1250, 3000, true);

    private static DeferredHolder<FluidType, FluidType> register(
            String name, int density, int viscosity, boolean canExtinguish) {
        return FLUID_TYPES.register(name, () -> new FluidType(
                FluidType.Properties.create()
                        .density(density)
                        .viscosity(viscosity)
                        .canConvertToSource(false)
                        .canSwim(false)
                        .canDrown(false)
                        .canPushEntity(true)
                        .supportsBoating(false)
                        .canExtinguish(canExtinguish)
        ));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
