package com.mochaohorizon.sinomagic.common.registry;

import com.mochaohorizon.sinomagic.SinoMagic;
import com.mochaohorizon.sinomagic.common.block.Millstone;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class SinoMagicBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(SinoMagic.MOD_ID);

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
    public static final DeferredBlock<Block> PLANTED_DADOU = registerBlocks(
            "planted_dadou", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)
            ));
    public static final DeferredBlock<Block> WILD_DADOU = registerBlocks(
            "wild_dadou", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS)
            ));
    public static final DeferredBlock<Block> PLANTED_CHILI = registerBlocks(
            "planted_chili", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)
            ));
    public static final DeferredBlock<Block> WILD_CHILI = registerBlocks(
            "wild_chili", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS)
            ));
    public static final DeferredBlock<Block> MILLSTONE = registerBlocks(
            "millstone", () -> new Millstone(BlockBehaviour.Properties.of()
                    .destroyTime(1.5f)
                    .explosionResistance(6.0f)
            ));

//Register blocks and blockitems
    private static <T extends Block> void registerBlockItems(String name, DeferredBlock<T> block) {
        SinoMagicItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> DeferredBlock<T> registerBlocks(String name, Supplier<T> block){
        DeferredBlock<T> blocks = BLOCKS.register(name, block);
        registerBlockItems(name, blocks);
        return blocks;
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
