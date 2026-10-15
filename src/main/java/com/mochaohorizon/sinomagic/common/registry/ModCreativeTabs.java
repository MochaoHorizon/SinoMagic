package com.mochaohorizon.sinomagic.common.registry;

import com.mochaohorizon.sinomagic.SinoMagic;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SinoMagic.MOD_ID);

    public static final Supplier<CreativeModeTab> SINOMAGIC_TAB = CREATIVE_MOD_TABS.register(SinoMagic.MOD_ID,
            ()-> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(ModItems.SOYBEAN.get()))
                    .title(Component.translatable("creative_tabs.sinomagic"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.SOYBEAN.get());
                        output.accept(ModItems.EDAMAME.get());
                        output.accept(ModItems.SOYBEAN_POD.get());
                        output.accept(ModItems.DRIED_SOYBEAN_POD.get());
                        output.accept(ModItems.SOYBEAN_POWDER.get());
                        output.accept(ModItems.TOFU.get());
                        output.accept(ModItems.SALTY_TOFU_PUDDING.get());
                        output.accept(ModItems.SWEET_TOFU_PUDDING.get());
                        output.accept(ModItems.FROZEN_TOFU.get());
                        output.accept(ModItems.HAIRY_TOFU.get());
                        output.accept(ModItems.STINKY_TOFU.get());
                        output.accept(ModItems.BAKED_TOFU.get());
                        output.accept(ModItems.FERMENTED_BEAN_CURD.get());
                        output.accept(ModItems.TOFU_SKIN.get());
                        output.accept(ModItems.QIANZHANG_TOFU.get());
                        output.accept(ModItems.SOYBEAN_MEAL.get());
                        output.accept(ModItems.DRIED_TOFU.get());
                        output.accept(ModItems.LATIAO.get());
                        output.accept(ModItems.BLACK_BEAN.get());
                        output.accept(ModItems.RED_BEAN.get());
                        output.accept(ModItems.RED_BEAN_PASTE.get());
                        output.accept(ModItems.MUNG_BEAN.get());
                        output.accept(ModItems.MUNG_BEAN_PASTE.get());
                        output.accept(ModItems.SALT.get());
                        output.accept(ModItems.SOY_MILK_BOTTLE.get());
                        output.accept(ModItems.SOYBEAN_OIL_BOTTLE.get());
                        output.accept(ModItems.SOY_SAUCE_BOTTLE.get());
                        output.accept(ModItems.MARINADE_BOTTLE.get());
                        output.accept(ModItems.DRIED_SHIT.get());
                        output.accept(ModItems.SHIT_BUCKET.get());
                        output.accept(ModItems.YEAST.get());
                        output.accept(ModItems.CHILI.get());
                        output.accept(ModItems.FIRE_CHILI.get());
                        output.accept(ModItems.CHILI_SEED.get());


                        output.accept(ModBlocks.SALT_BLOCK.get());
                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
