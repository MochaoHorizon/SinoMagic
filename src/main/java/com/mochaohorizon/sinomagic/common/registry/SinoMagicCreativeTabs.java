package com.mochaohorizon.sinomagic.common.registry;

import com.mochaohorizon.sinomagic.SinoMagic;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class SinoMagicCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SinoMagic.MOD_ID);

    public static final Supplier<CreativeModeTab> SINOMAGIC_TAB = CREATIVE_MOD_TABS.register(SinoMagic.MOD_ID,
            ()-> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(SinoMagicItems.DADOU.get()))
                    .title(Component.translatable("creative_tabs.sinomagic"))
                    .displayItems((parameters, output) -> {
                        output.accept(SinoMagicItems.DADOU.get());
                        output.accept(SinoMagicItems.MAODOU.get());
                        output.accept(SinoMagicItems.DOUJIA.get());
                        output.accept(SinoMagicItems.DRIED_DOUJIA.get());
                        output.accept(SinoMagicItems.DADOU_POWDER.get());
                        output.accept(SinoMagicItems.TOFU.get());
                        output.accept(SinoMagicItems.SALTY_TOFU_CURD.get());
                        output.accept(SinoMagicItems.SWEET_TOFU_CURD.get());
                        output.accept(SinoMagicItems.FROZEN_TOFU.get());
                        output.accept(SinoMagicItems.MOULD_TOFU.get());
                        output.accept(SinoMagicItems.STINKY_TOFU.get());
                        output.accept(SinoMagicItems.BAKED_TOFU.get());
                        output.accept(SinoMagicItems.FURU.get());
                        output.accept(SinoMagicItems.DOUPI.get());
                        output.accept(SinoMagicItems.QIANZHANG_TOFU.get());
                        output.accept(SinoMagicItems.DREGS_DADOU.get());
                        output.accept(SinoMagicItems.DRIED_TOFU.get());
                        output.accept(SinoMagicItems.SPICY_GLUTEN.get());
                        output.accept(SinoMagicItems.BLACKBEAN.get());
                        output.accept(SinoMagicItems.REDBEANSHRUB.get());
                        output.accept(SinoMagicItems.REDBEANSHRUB_POWDER.get());
                        output.accept(SinoMagicItems.REDBEAN.get());
                        output.accept(SinoMagicItems.GREENBEAN.get());
                        output.accept(SinoMagicItems.GREENBEAN_POWDER.get());
                        output.accept(SinoMagicItems.SALT.get());
                        output.accept(SinoMagicItems.SOYAMILK_BOTTLE.get());
                        output.accept(SinoMagicItems.DADOU_OIL_BOTTLE.get());
                        output.accept(SinoMagicItems.SOY_BOTTLE.get());
                        output.accept(SinoMagicItems.LUZHI_BOTTLE.get());
                        output.accept(SinoMagicItems.DRIED_SHIT.get());
                        output.accept(SinoMagicItems.SHIT_BUCKET.get());
                        output.accept(SinoMagicItems.YEAST.get());
                        output.accept(SinoMagicItems.CHILI.get());
                        output.accept(SinoMagicItems.FIRE_CHILI.get());
                        output.accept(SinoMagicItems.CHILI_SEED.get());


                        output.accept(SinoMagicBlocks.SALT_BLOCK.get());
                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
