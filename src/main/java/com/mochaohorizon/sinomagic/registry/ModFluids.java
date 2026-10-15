package com.mochaohorizon.sinomagic.registry;

import com.mochaohorizon.sinomagic.SinoMagic;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

/**
 * 5 种流体的 Fluid 注册。
 *
 * <p>每种流体占两个注册项：源（{@code sinomagic:soy_sauce}）与流动（{@code sinomagic:flowing_soy}）。
 * 配方、成就与语言文件引用的都是**源**的 id。</p>
 *
 * <p>这里有两个必须留意的延迟求值点，都是为了避免类初始化期的循环依赖：</p>
 * <ul>
 *   <li>{@code BaseFlowingFluid.Properties} 的 block 参数用 lambda 包住 {@code ModBlocks} 的访问，
 *       否则 {@code ModBlocks} 与 {@code ModFluids} 会在各自的静态初始化里互相拉取；</li>
 *   <li>两个 {@code DeferredHolder} 在 lambda 内互相引用，而 lambda 要等注册事件触发时才执行，
 *       那时静态初始化早已结束。</li>
 * </ul>
 */
public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(Registries.FLUID, SinoMagic.MOD_ID);

    // ---------- 大豆油 ----------
    public static final DeferredHolder<Fluid, BaseFlowingFluid.Source> SOYBEAN_OIL =
            FLUIDS.register("soybean_oil", () -> new BaseFlowingFluid.Source(soybeanOil()));
    public static final DeferredHolder<Fluid, BaseFlowingFluid.Flowing> FLOWING_SOYBEAN_OIL =
            FLUIDS.register("flowing_soybean_oil", () -> new BaseFlowingFluid.Flowing(soybeanOil()));

    // ---------- 酱油 ----------
    public static final DeferredHolder<Fluid, BaseFlowingFluid.Source> SOY_SAUCE =
            FLUIDS.register("soy_sauce", () -> new BaseFlowingFluid.Source(soy_sauce()));
    public static final DeferredHolder<Fluid, BaseFlowingFluid.Flowing> FLOWING_SOY_SAUCE =
            FLUIDS.register("flowing_soy_sauce", () -> new BaseFlowingFluid.Flowing(soy_sauce()));

    // ---------- 豆浆 ----------
    public static final DeferredHolder<Fluid, BaseFlowingFluid.Source> SOY_MILK =
            FLUIDS.register("soy_milk", () -> new BaseFlowingFluid.Source(soy_milk()));
    public static final DeferredHolder<Fluid, BaseFlowingFluid.Flowing> FLOWING_SOY_MILK =
            FLUIDS.register("flowing_soy_milk", () -> new BaseFlowingFluid.Flowing(soy_milk()));

    // ---------- 卤汁 ----------
    public static final DeferredHolder<Fluid, BaseFlowingFluid.Source> MARINADE =
            FLUIDS.register("marinade", () -> new BaseFlowingFluid.Source(marinade()));
    public static final DeferredHolder<Fluid, BaseFlowingFluid.Flowing> FLOWING_MARINADE =
            FLUIDS.register("flowing_marinade", () -> new BaseFlowingFluid.Flowing(marinade()));

    // ---------- 屎 ----------
    public static final DeferredHolder<Fluid, BaseFlowingFluid.Source> SHIT =
            FLUIDS.register("shit", () -> new BaseFlowingFluid.Source(shit()));
    public static final DeferredHolder<Fluid, BaseFlowingFluid.Flowing> FLOWING_SHIT =
            FLUIDS.register("flowing_shit", () -> new BaseFlowingFluid.Flowing(shit()));

    private static BaseFlowingFluid.Properties soybeanOil() {
        return baseProperties(ModFluidTypes.SOYBEAN_OIL, SOYBEAN_OIL, FLOWING_SOYBEAN_OIL,
                () -> ModBlocks.SOYBEAN_OIL_FLUID.get(),
                () -> ModItems.SOYBEAN_OIL_BUCKET.get());
    }

    private static BaseFlowingFluid.Properties soy_sauce() {
        return baseProperties(ModFluidTypes.SOY_SAUCE, SOY_SAUCE, FLOWING_SOY_SAUCE,
                () -> ModBlocks.SOY_SAUCE_FLUID.get(),
                () -> ModItems.SOY_SAUCE_BUCKET.get());
    }

    private static BaseFlowingFluid.Properties soy_milk() {
        return baseProperties(ModFluidTypes.SOY_MILK, SOY_MILK, FLOWING_SOY_MILK,
                () -> ModBlocks.SOY_MILK_FLUID.get(),
                () -> ModItems.SOY_MILK_BUCKET.get());
    }

    private static BaseFlowingFluid.Properties marinade() {
        return baseProperties(ModFluidTypes.MARINADE, MARINADE, FLOWING_MARINADE,
                () -> ModBlocks.MARINADE_FLUID.get(),
                () -> ModItems.MARINADE_BUCKET.get());
    }

    private static BaseFlowingFluid.Properties shit() {
        return baseProperties(ModFluidTypes.SHIT, SHIT, FLOWING_SHIT,
                () -> ModBlocks.SHIT_FLUID.get(),
                () -> ModItems.SHIT_BUCKET.get());
    }

    //比水稠得多：每次向低处分摊 2 级（水是 1 级），每 10 tick 才走一步（水是 5），所以铺得近、流得慢
    //bucket 是延迟求值：Fluid.getBucket() 要等到运行期才取，此处不能直接 .get()
    private static BaseFlowingFluid.Properties baseProperties(
            Supplier<? extends FluidType> fluidType,
            Supplier<? extends Fluid> source,
            Supplier<? extends Fluid> flowing,
            Supplier<? extends LiquidBlock> block,
            Supplier<? extends Item> bucket) {
        return new BaseFlowingFluid.Properties(fluidType, source, flowing)
                .block(block)
                .bucket(bucket)
                .slopeFindDistance(4)
                .levelDecreasePerBlock(2)
                .tickRate(10)
                .explosionResistance(100.0F);
    }

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
