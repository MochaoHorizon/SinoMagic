package com.mochaohorizon.sinomagic.common.registry;

import com.mochaohorizon.sinomagic.SinoMagic;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class SinoMagicBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(SinoMagic.MOD_ID);

    //add in v0.1.0
    public static final DeferredBlock<Block> SALT_BLOCK = registerBlocks(
            "salt_block", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(1.5f)
                    .explosionResistance(1.0f)
                    .sound(SoundType.STONE)
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
