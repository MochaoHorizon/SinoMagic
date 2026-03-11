package com.agnoeufcc.chmagic.common.registry;

import com.agnoeufcc.chmagic.ChineseMagic;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(ChineseMagic.MOD_ID);

    //Helper Methods
    public static Item.Properties foodItem(FoodProperties food) {
        return new Item.Properties().food(food);
    }

    public static Item.Properties bowlFoodItem(FoodProperties food) {
        return new Item.Properties().food(food).craftRemainder(Items.BOWL).stacksTo(16);
    }

    public static Item.Properties drinkItem() {
        return new Item.Properties().craftRemainder(Items.GLASS_BOTTLE).stacksTo(16);
    }


    //Beans
    public static final DeferredItem<Item> SOYBEAN =
            ITEMS.register("soybean", ()-> new Item(foodItem(FoodValues.SOYBEAN)));
    public static final DeferredItem<Item> GREEN_SOYBEAN =
            ITEMS.register("green_soybean", ()-> new Item(foodItem(FoodValues.GREEN_SOYBEAN)));
    public static final DeferredItem<Item> POD =
            ITEMS.register("pod", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DRIED_POD =
            ITEMS.register("dried_pod", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SOYBEAN_POWDER =
            ITEMS.register("soybean_powder", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TOFU =
            ITEMS.register("tofu", ()-> new Item(foodItem(FoodValues.TOFU)));
    public static final DeferredItem<Item> FROZEN_TOFU =
            ITEMS.register("frozen_tofu", ()-> new Item(foodItem(FoodValues.FROZEN_TOFU)));
    public static final DeferredItem<Item> HAIRY_TOFU =
            ITEMS.register("hairy_tofu", ()-> new Item(foodItem(FoodValues.HAIRY_TOFU)));
    public static final DeferredItem<Item> STINKY_TOFU =
            ITEMS.register("stinky_tofu", ()-> new Item(foodItem(FoodValues.STINKY_TOFU)));
    public static final DeferredItem<Item> SALTY_TOFU_CURD =
            ITEMS.register("salty_tofu_curd", ()-> new Item(bowlFoodItem(FoodValues.SALTY_TOFU_CURD)));
    public static final DeferredItem<Item> SWEET_TOFU_CURD =
            ITEMS.register("sweet_tofu_curd", ()-> new Item(bowlFoodItem(FoodValues.SWEET_TOFU_CURD)));
    public static final DeferredItem<Item> BAKED_TOFU =
            ITEMS.register("baked_tofu", ()-> new Item(foodItem(FoodValues.BAKED_TOFU)));
    public static final DeferredItem<Item> FERMENTED_TOFU =
            ITEMS.register("fermented_tofu", ()-> new Item(foodItem(FoodValues.FERMENTED_TOFU)));
    public static final DeferredItem<Item> TOFU_SKIN =
            ITEMS.register("tofu_skin", ()-> new Item(foodItem(FoodValues.TOFU_SKIN)));
    public static final DeferredItem<Item> QIANZHANG_TOFU =
            ITEMS.register("qianzhang_tofu", ()-> new Item(foodItem(FoodValues.QIANZHANG_TOFU)));
    public static final DeferredItem<Item> SOYBEAN_MEAL =
            ITEMS.register("soybean_meal", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TOFU_JERKY =
            ITEMS.register("tofu_jerky", ()-> new Item(foodItem(FoodValues.TOFU_JERKY)));
    public static final DeferredItem<Item> LATIAO =
            ITEMS.register("latiao", ()-> new Item(foodItem(FoodValues.LATIAO)));

    public static final DeferredItem<Item> BLACKBEAN =
            ITEMS.register("blackbean", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> REDBEAN =
            ITEMS.register("redbean", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> REDBEAN_PASTE =
            ITEMS.register("redbean_paste", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GREENBEAN =
            ITEMS.register("greenbean", ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GREENBEAN_PASTE =
            ITEMS.register("greenbean_paste", ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SALT =
            ITEMS.register("salt", ()-> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
