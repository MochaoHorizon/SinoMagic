package com.mochaohorizon.sinomagic.registry;

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
                        // ---------- 豆类作物 ----------
                        output.accept(ModItems.SOYBEAN.get());
                        output.accept(ModItems.EDAMAME.get());
                        output.accept(ModItems.SOYBEAN_POD.get());
                        output.accept(ModItems.DRIED_SOYBEAN_POD.get());
                        output.accept(ModItems.BLACK_BEAN.get());
                        output.accept(ModItems.RED_BEAN.get());
                        output.accept(ModItems.MUNG_BEAN.get());

                        // ---------- 辣椒 ----------
                        output.accept(ModItems.CHILI.get());
                        output.accept(ModItems.FIRE_CHILI.get());
                        output.accept(ModItems.CHILI_SEED.get());

                        // ---------- 豆制品 ----------
                        output.accept(ModItems.SOYBEAN_POWDER.get());
                        output.accept(ModItems.SOYBEAN_MEAL.get());
                        output.accept(ModItems.TOFU.get());
                        output.accept(ModItems.DRIED_TOFU.get());
                        output.accept(ModItems.FROZEN_TOFU.get());
                        output.accept(ModItems.HAIRY_TOFU.get());
                        output.accept(ModItems.STINKY_TOFU.get());
                        output.accept(ModItems.BAKED_TOFU.get());
                        output.accept(ModItems.FERMENTED_BEAN_CURD.get());
                        output.accept(ModItems.TOFU_SKIN.get());
                        output.accept(ModItems.QIANZHANG_TOFU.get());
                        output.accept(ModItems.SOY_MILK_BOTTLE.get());
                        output.accept(ModItems.SALTY_TOFU_PUDDING.get());
                        output.accept(ModItems.SWEET_TOFU_PUDDING.get());

                        // ---------- 豆沙与酱料 ----------
                        output.accept(ModItems.RED_BEAN_PASTE.get());
                        output.accept(ModItems.MUNG_BEAN_PASTE.get());
                        output.accept(ModItems.SOY_SAUCE_BOTTLE.get());
                        output.accept(ModItems.MARINADE_BOTTLE.get());

                        // ---------- 基础材料 ----------
                        output.accept(ModItems.SALT.get());
                        output.accept(ModItems.YEAST.get());
                        output.accept(ModItems.SOYBEAN_OIL_BOTTLE.get());
                        output.accept(ModItems.DRIED_SHIT.get());
                        output.accept(ModItems.SHIT_BUCKET.get());

                        // ---------- 零食 ----------
                        output.accept(ModItems.LATIAO.get());

                        // ---------- 方块物品 ----------
                        output.accept(ModItems.SALT_BLOCK.get());
                        output.accept(ModItems.SALT_ORE.get());
                        output.accept(ModItems.TOFU_BLOCK.get());
                        output.accept(ModItems.SHIT_BLOCK.get());
                        output.accept(ModItems.MILLSTONE.get());
                        output.accept(ModItems.VAT.get());
                        output.accept(ModItems.WILD_SOYBEAN_PLANT.get());
                        output.accept(ModItems.WILD_CHILI_PLANT.get());

                        // ---------- 音乐唱片 ----------
                        output.accept(ModItems.MUSIC_DISC_BAINIAOCHAOFENG.get());
                        output.accept(ModItems.MUSIC_DISC_BAOWEIHUANGHE.get());
                        output.accept(ModItems.MUSIC_DISC_BEIJINGJINSHANSHANG.get());
                        output.accept(ModItems.MUSIC_DISC_BUBUGAO.get());
                        output.accept(ModItems.MUSIC_DISC_CHINFENGWUYI.get());
                        output.accept(ModItems.MUSIC_DISC_DADAO.get());
                        output.accept(ModItems.MUSIC_DISC_DADONGBEI.get());
                        output.accept(ModItems.MUSIC_DISC_DAHAIHANGXING.get());
                        output.accept(ModItems.MUSIC_DISC_HAOHANGE.get());
                        output.accept(ModItems.MUSIC_DISC_HAOYUNLAI.get());
                        output.accept(ModItems.MUSIC_DISC_JINSHEKUANGWU.get());
                        output.accept(ModItems.MUSIC_DISC_LANLINGWANG.get());
                        output.accept(ModItems.MUSIC_DISC_MINGTIANHUIGENGHAO.get());
                        output.accept(ModItems.MUSIC_DISC_OURWORKERHAVEPOWER.get());
                        output.accept(ModItems.MUSIC_DISC_SAIMA.get());
                        output.accept(ModItems.MUSIC_DISC_SHEHUIZHUYIHAO.get());
                        output.accept(ModItems.MUSIC_DISC_TONGTIANDADAO.get());
                        output.accept(ModItems.MUSIC_DISC_YOUJIDUI.get());
                        output.accept(ModItems.MUSIC_DISC_YUANFANGKEREN.get());
                        output.accept(ModItems.MUSIC_DISC_ZIJINGHUA.get());
                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
