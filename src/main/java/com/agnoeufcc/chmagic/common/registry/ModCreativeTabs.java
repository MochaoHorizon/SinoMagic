package com.agnoeufcc.chmagic.common.registry;

import com.agnoeufcc.chmagic.ChineseMagic;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ChineseMagic.MOD_ID);

    public static final Supplier<CreativeModeTab> CHMAGIC_TAB =
            CREATIVE_MOD_TABS.register("chmagic_tab",()-> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(ModItems.SOYBEAN.get()))
                    .title(Component.translatable("itemGroup.chmagic_tab"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.SOYBEAN);
                        output.accept(ModItems.GREEN_SOYBEAN);
                        output.accept(ModItems.POD);
                        output.accept(ModItems.DRIED_POD);
                        output.accept(ModItems.SOYBEAN_POWDER);
                        output.accept(ModItems.TOFU);
                        output.accept(ModItems.SALTY_TOFU_CURD);
                        output.accept(ModItems.SWEET_TOFU_CURD);
                        output.accept(ModItems.FROZEN_TOFU);
                        output.accept(ModItems.HAIRY_TOFU);
                        output.accept(ModItems.STINKY_TOFU);
                        output.accept(ModItems.BAKED_TOFU);
                        output.accept(ModItems.FERMENTED_TOFU);
                        output.accept(ModItems.TOFU_SKIN);
                        output.accept(ModItems.QIANZHANG_TOFU);
                        output.accept(ModItems.SOYBEAN_MEAL);
                        output.accept(ModItems.TOFU_JERKY);
                        output.accept(ModItems.LATIAO);
                        output.accept(ModItems.BLACKBEAN);
                        output.accept(ModItems.REDBEAN);
                        output.accept(ModItems.REDBEAN_PASTE);
                        output.accept(ModItems.GREENBEAN);
                        output.accept(ModItems.GREENBEAN_PASTE);
                        output.accept(ModItems.SALT);


                        output.accept(ModBlocks.SALT_BLOCK);
                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
