package com.agnoeufcc.chmagic.common.registry;

import com.agnoeufcc.chmagic.ChineseMagic;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(ChineseMagic.MOD_ID);

    public static final DeferredItem<Item> DADOU =
            ITEMS.register("dadou", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MAODOU =
            ITEMS.register("maodou", ()-> new Item(new Item.Properties()));

    /*
    public static final DeferredItem<Item> DOUJIA =
            ITEMS.register("doujia", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DRIED_DOUJIA =
            ITEMS.register("dried_doujia)", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DADOU_OIL_BOTTLE =
            ITEMS.register("dadou-oil_bottle", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DADOU_POWDER =
            ITEMS.register("dadou_powder", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TOFU =
            ITEMS.register("tofu", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FROZEN_TOFU =
            ITEMS.register("frozen_tofu", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MOULD_TOFU =
            ITEMS.register("mould_tofu", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STINKY_TOFU =
            ITEMS.register("stinky_tofu", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SALTY_TOFU_CURD =
            ITEMS.register("salty_tofu_curd", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SWEET_TOFU_CURD =
            ITEMS.register("sweet_tofu_curd", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DOUPI =
            ITEMS.register("doupi", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> QIANZHANG_TOFU =
            ITEMS.register("qianzhang_tofu", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SALT =
            ITEMS.register("salt", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SALT_ORE =
            ITEMS.register("salt_ore", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SOY_BOTTLE =
            ITEMS.register("soy_bottle", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LUZHI_BOTTLE =
            ITEMS.register("luzhi_bottle", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DREGS_DADOU =
            ITEMS.register("dregs_dadou", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPICY_GLUTEN =
            ITEMS.register("spicy_gluten", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DRIED_DADOU =
            ITEMS.register("dried_dadou", ()-> new Item(new Item.Properties()));

     */

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
