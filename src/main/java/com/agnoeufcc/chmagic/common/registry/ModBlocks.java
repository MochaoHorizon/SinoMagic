package com.agnoeufcc.chmagic.common.registry;

import com.agnoeufcc.chmagic.ChineseMagic;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import javax.swing.*;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(ChineseMagic.MOD_ID);

    public static final DeferredBlock<Block> SALT_BLOCK = registerBlocks(
            "salt_block", () -> new Block(BlockBehaviour.Properties.of()
                    .destroyTime(1.5f)
                    .explosionResistance(1.0f)
                    .sound(SoundType.STONE)
            ));


//Register blocks and blockitems
    private static <T extends Block> void registerBlockItems(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties()));
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
