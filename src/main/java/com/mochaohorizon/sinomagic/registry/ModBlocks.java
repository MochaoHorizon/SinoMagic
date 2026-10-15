package com.mochaohorizon.sinomagic.registry;

import com.mochaohorizon.sinomagic.SinoMagic;
import com.mochaohorizon.sinomagic.block.BeanBlock;
import com.mochaohorizon.sinomagic.block.ChiliBlock;
import com.mochaohorizon.sinomagic.block.NetherWildCropBlock;
import com.mochaohorizon.sinomagic.block.SoybeanBlock;
import com.mochaohorizon.sinomagic.block.Millstone;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import vectorwing.farmersdelight.common.block.WildCropBlock;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(SinoMagic.MOD_ID);

    // ---------- 作物方块 ----------
    public static final DeferredBlock<Block> SOYBEAN_PLANT = registerBlocks(
            "soybean_plant", () -> new SoybeanBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)
            ));
    public static final DeferredBlock<Block> CHILI_PLANT = registerBlocks(
            "chili_plant", () -> new ChiliBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)
            ));
    //黑豆、赤豆、绿豆共用 BeanBlock
    public static final DeferredBlock<Block> BLACK_BEAN_PLANT = registerBlocks(
            "black_bean_plant", () -> new BeanBlock(ModItems.BLACK_BEAN,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)
            ));
    public static final DeferredBlock<Block> RED_BEAN_PLANT = registerBlocks(
            "red_bean_plant", () -> new BeanBlock(ModItems.RED_BEAN,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)
            ));
    public static final DeferredBlock<Block> MUNG_BEAN_PLANT = registerBlocks(
            "mung_bean_plant", () -> new BeanBlock(ModItems.MUNG_BEAN,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)
            ));

    // ---------- 野生植株 ----------
    //野生植株沿用农夫乐事 WildCropBlock：泥土/沙限定，可骨粉繁殖，可燃
    public static final DeferredBlock<Block> WILD_SOYBEAN_PLANT = registerBlocks(
            "wild_soybean_plant", () -> new WildCropBlock(MobEffects.SATURATION, 8,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS)
            ));
    public static final DeferredBlock<Block> WILD_CHILI_PLANT = registerBlocks(
            "wild_chili_plant", () -> new NetherWildCropBlock(MobEffects.FIRE_RESISTANCE, 8,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS)
            ));

    // ---------- 普通方块 ----------
    public static final DeferredBlock<Block> SALT_BLOCK = registerBlocks(
            "salt_block", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(1.5f)
                    .explosionResistance(1.0f)
            ));
    public static final DeferredBlock<Block> SALT_ORE = registerBlocks(
            "salt_ore", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(1.5f)
                    .explosionResistance(1.0f)
            ));
    public static final DeferredBlock<Block> TOFU_BLOCK = registerBlocks(
            "tofu_block", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(0.5f)
                    .explosionResistance(0.5f)
                    .sound(SoundType.SLIME_BLOCK)
                    .friction(0.75f)
            ));
    public static final DeferredBlock<Block> SHIT_BLOCK = registerBlocks(
            "shit_block", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(1.0f)
                    .explosionResistance(4.0f)
                    .friction(0.75f)
            ));

    // ---------- 流体方块 ----------
    //5 种流体的世界形态，属性直接抄原版水。与原版水一样没有对应的 BlockItem，也不进创造栏
    public static final DeferredBlock<LiquidBlock> SOYBEAN_OIL_FLUID = registerBlocks(
            "soybean_oil", () -> new LiquidBlock(ModFluids.SOYBEAN_OIL.get(), fluidBlockProperties()));
    public static final DeferredBlock<LiquidBlock> SOY_SAUCE_FLUID = registerBlocks(
            "soy_sauce", () -> new LiquidBlock(ModFluids.SOY_SAUCE.get(), fluidBlockProperties()));
    public static final DeferredBlock<LiquidBlock> SOY_MILK_FLUID = registerBlocks(
            "soy_milk", () -> new LiquidBlock(ModFluids.SOY_MILK.get(), fluidBlockProperties()));
    public static final DeferredBlock<LiquidBlock> MARINADE_FLUID = registerBlocks(
            "marinade", () -> new LiquidBlock(ModFluids.MARINADE.get(), fluidBlockProperties()));
    public static final DeferredBlock<LiquidBlock> SHIT_FLUID = registerBlocks(
            "shit", () -> new LiquidBlock(ModFluids.SHIT.get(), fluidBlockProperties()));

    // ---------- 功能方块 ----------
    public static final DeferredBlock<Block> MILLSTONE = registerBlocks(
            "millstone", () -> new Millstone(BlockBehaviour.Properties.of()
                    .destroyTime(1.5f)
                    .explosionResistance(6.0f)
            ));
    public static final DeferredBlock<Block> VAT = registerBlocks(
            "vat", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                    .destroyTime(1.25f)
                    .explosionResistance(4.5f)
            ));

    private static BlockBehaviour.Properties fluidBlockProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.WATER);
    }

    private static <T extends Block> DeferredBlock<T> registerBlocks(String name, Supplier<T> block){
        DeferredBlock<T> blocks = BLOCKS.register(name, block);
        return blocks;
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
