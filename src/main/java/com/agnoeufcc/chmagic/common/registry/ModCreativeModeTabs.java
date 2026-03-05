package com.agnoeufcc.chmagic.common.registry;

import com.agnoeufcc.chmagic.ChineseMagic;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ChineseMagic.MOD_ID);

    public static final Supplier<CreativeModeTab> CHMAGIC_TAB =
            CREATIVE_MOD_TABS.register("chmagic_tab",()-> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(ModItems.DADOU.get()))
                    .title(Component.translatable("itemGroup.chmagic_tab"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.DADOU);
                        output.accept(ModItems.MAODOU);

                        output.accept(ModBlocks.SALT_BLOCK);
                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
