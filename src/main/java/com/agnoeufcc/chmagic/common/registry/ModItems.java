package com.agnoeufcc.chmagic.common.registry.item;

import com.agnoeufcc.chmagic.ChineseMagic;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(ChineseMagic.MOD_ID);

    public static final DeferredItem<Item> DADOU =
            ITEMS.register("dadou", ()-> new Item(foodItem(FoodValues.DADOU)));
    public static final DeferredItem<Item> MAODOU =
            ITEMS.register("maodou", ()-> new Item(foodItem(FoodValues.MAODOU)));
    public static final DeferredItem<Item> DOUJIA =
            ITEMS.register("doujia", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DRIED_DOUJIA =
            ITEMS.register("planted_dadou)", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DADOU_OIL_BOTTLE =
            ITEMS.register("dadou_oil_bottle", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DADOU_POWDER =
            ITEMS.register("dadou_powder", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SOYAMILK_BOTTLE =
            ITEMS.register("soyamilk_bottle", ()-> new Item(foodItem(FoodValues.SOYAMILK_BOTTLE)));
    public static final DeferredItem<Item> SALTY_TOFU_CURD =
            ITEMS.register("salty_tofu_curd", ()-> new Item(foodItem(SAITY_TOFU_CURD)));
    public static final DeferredItem<Item> SWEET_TOFU_CURD =
            ITEMS.register("sweet_tofu_curd", ()-> new Item(foodItem(SWEET_TOFU_CURD)));
    public static final DeferredItem<Item> TOFU =
            ITEMS.register("tofu", ()-> new Item(foodItem(TOFU)));
    public static final DeferredItem<Item> FROZEN_TOFU =
            ITEMS.register("frozen_tofu", ()-> new Item(foodItem(FROZEN_TOFU)));
    public static final DeferredItem<Item> MOULD_TOFU =
            ITEMS.register("mould_tofu", ()-> new Item(foodItem(MOULD_TOFU)));
    public static final DeferredItem<Item> STINKY_TOFU =
            ITEMS.register("stinky_tofu", ()-> new Item(foodItem(STINKY_TOFU)))
    public static final DeferredItem<Item> BAKED_TOFU =
            ITEMS.register("baked_tofu", ()-> new Item(foodItem(BAKED_TOFU)));
    public static final DeferredItem<Item> FURU =
            ITEMS.register("furu", ()-> new Item(foodItem(FURU)));
    public static final DeferredItem<Item> DOUPI =
            ITEMS.register("doupi", ()-> new Item(foodItem(DOUPI)));
    public static final DeferredItem<Item> QIANZHANG_TOFU =
            ITEMS.register("qianzhang_tofu", ()-> new Item(foodItem(QIANZHANG_TOFU)));
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
    public static final DeferredItem<Item> DRIED_TOFU=
            ITEMS.register("dried_tofu", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BLACKBEAN =
            ITEMS.register("blackbean", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> REDBEANSHRUB =
            ITEMS.register("redbeanshrub", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> REDBEANSHRUB_POWDER =
            ITEMS.register("redbeanshrub_powder", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> REDBEAN =
            ITEMS.register("redbean", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GREENBEAN =
            ITEMS.register("greenbean", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GREENBEAN_POWDER =
            ITEMS.register("greenbean_powder", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DRIED_SHIT =
            ITEMS.register("dried_shit", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SHIT_BUCKET =
            ITEMS.register("shit_bucket", ()-> new Item(new Item.Properties()));
    
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
