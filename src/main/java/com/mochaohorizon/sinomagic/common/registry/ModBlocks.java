package com.mochaohorizon.sinomagic.common.registry;

import com.mochaohorizon.sinomagic.SinoMagic;
import com.mochaohorizon.sinomagic.common.block.ChiliBlock;
import com.mochaohorizon.sinomagic.common.block.SoybeanBlock;
import com.mochaohorizon.sinomagic.common.block.Millstone;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(SinoMagic.MOD_ID);

    //Blocks added to v1.0.0-人食五谷开发版
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
    public static final DeferredBlock<Block> SOYBEAN_PLANT = registerBlocks(
            "soybean_plant", () -> new SoybeanBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)
            ));
    public static final DeferredBlock<Block> WILD_SOYBEAN_PLANT = registerBlocks(
            "wild_soybean_plant", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS)
            ));
    public static final DeferredBlock<Block> CHILI_PLANT = registerBlocks(
            "chili_plant", () -> new ChiliBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)
            ));
    public static final DeferredBlock<Block> WILD_CHILI_PLANT = registerBlocks(
            "wild_chili_plant", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS)
            ));
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
    public static final DeferredBlock<Block> SHIT_BLOCK = registerBlocks(
            "shit_block", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(1.0f)
                    .explosionResistance(4.0f)
                    .friction(0.75f)
            ));

    private static <T extends Block> DeferredBlock<T> registerBlocks(String name, Supplier<T> block){
        DeferredBlock<T> blocks = BLOCKS.register(name, block);
        return blocks;
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
