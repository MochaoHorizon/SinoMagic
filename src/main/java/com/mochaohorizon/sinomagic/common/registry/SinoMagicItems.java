package com.mochaohorizon.sinomagic.common.registry;

import com.mochaohorizon.sinomagic.SinoMagic;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class SinoMagicItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(SinoMagic.MOD_ID);

    //From Farmersdelight
    public static Item.Properties foodItem(FoodProperties food) {
        return new Item.Properties().food(food);
    }

    public static Item.Properties bowlFoodItem(FoodProperties food) {
        return new Item.Properties().food(food).craftRemainder(Items.BOWL).stacksTo(16);
    }

    public static Item.Properties drinkItem() {
        return new Item.Properties().craftRemainder(Items.GLASS_BOTTLE).stacksTo(16);
    }

    //Simple items added to v1.0.0-人食五谷开发版
    public static final Supplier<Item> DADOU = ITEMS.registerItem(
            "dadou",
            props -> new Item(props.food(SinoMagicFoodValues.DADOU)),
            new Item.Properties()
    );
    public static final Supplier<Item> MAODOU = ITEMS.registerItem(
            "maodou",
            props -> new Item(props.food(SinoMagicFoodValues.MAODOU)),
            new Item.Properties()
    );
    public static final Supplier<Item> DOUJIA = ITEMS.registerItem(
            "doujia",
            Item::new,
            new Item.Properties()
    );
    public static final Supplier<Item> DRIED_DOUJIA = ITEMS.registerItem(
            "dried_doujia",
            Item::new,
            new Item.Properties()
    );
    public static final Supplier<Item> DADOU_OIL_BOTTLE = ITEMS.registerItem(
            "dadou_oil_bottle",
            Item::new,
            new Item.Properties()
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(16)
    );
    public static final Supplier<Item> DADOU_POWDER = ITEMS.registerItem(
            "dadou_powder",
            Item::new,
            new Item.Properties()
    );
    public static final Supplier<Item> SOYAMILK_BOTTLE = ITEMS.registerItem(
            "soyamilk_bottle",
            props -> new Item(props.food(SinoMagicFoodValues.SOYAMILK_BOTTLE)),
            new Item.Properties()
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(16)
    );
    public static final Supplier<Item> SALTY_TOFU_CURD = ITEMS.registerItem(
            "salty_tofu_curd",
            props -> new Item(props.food(SinoMagicFoodValues.SALTY_TOFU_CURD)),
            new Item.Properties()
                .craftRemainder(Items.BOWL)
                .stacksTo(16)
    );
    public static final Supplier<Item> SWEET_TOFU_CURD = ITEMS.registerItem(
            "sweet_tofu_curd",
            props -> new Item(props.food(SinoMagicFoodValues.SWEET_TOFU_CURD)),
            new Item.Properties()
                .craftRemainder(Items.BOWL)
                .stacksTo(16)
    );
    public static final Supplier<Item> TOFU = ITEMS.registerItem(
            "tofu",
            props -> new Item(props.food(SinoMagicFoodValues.TOFU)),
            new Item.Properties()
    );
    public static final Supplier<Item> FROZEN_TOFU = ITEMS.registerItem(
            "frozen_tofu",
            props -> new Item(props.food(SinoMagicFoodValues.FROZEN_TOFU)),
            new Item.Properties()
    );
    public static final Supplier<Item> MOULD_TOFU = ITEMS.registerItem(
            "mould_tofu",
            props -> new Item(props.food(SinoMagicFoodValues.MOULD_TOFU)),
            new Item.Properties()
    );
    public static final Supplier<Item> STINKY_TOFU = ITEMS.registerItem(
            "stinky_tofu",
            props -> new Item(props.food(SinoMagicFoodValues.STINKY_TOFU)),
            new Item.Properties()
    );
    public static final Supplier<Item> BAKED_TOFU = ITEMS.registerItem(
            "baked_tofu",
            props -> new Item(props.food(SinoMagicFoodValues.BAKED_TOFU)),
            new Item.Properties()
    );
    public static final Supplier<Item> FURU = ITEMS.registerItem(
            "furu",
            props -> new Item(props.food(SinoMagicFoodValues.FURU)),
            new Item.Properties()
    );
    public static final Supplier<Item> DOUPI = ITEMS.registerItem(
            "doupi",
            props -> new Item(props.food(SinoMagicFoodValues.DOUPI)),
            new Item.Properties()
    );
    public static final Supplier<Item> QIANZHANG_TOFU = ITEMS.registerItem(
            "qianzhang_tofu",
            props -> new Item(props.food(SinoMagicFoodValues.QIANZHANG_TOFU)),
            new Item.Properties()
    );
    public static final Supplier<Item> SALT = ITEMS.registerItem(
            "salt",
            Item::new,
            new Item.Properties()
    );
    public static final Supplier<Item> SOY_BOTTLE = ITEMS.registerItem(
            "soy_bottle",
            Item::new,
            new Item.Properties()
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(16)
    );
    public static final Supplier<Item> LUZHI_BOTTLE = ITEMS.registerItem(
            "luzhi_bottle",
            Item::new,
            new Item.Properties()
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(16)
    );
    public static final Supplier<Item> DREGS_DADOU = ITEMS.registerItem(
            "dregs_dadou",
            Item::new,
            new Item.Properties()
    );
    public static final Supplier<Item> SPICY_GLUTEN = ITEMS.registerItem(
            "spicy_gluten",
            props -> new Item(props.food(SinoMagicFoodValues.SPICY_GLUTEN)),
            new Item.Properties()
    );
    public static final Supplier<Item> DRIED_TOFU = ITEMS.registerItem(
            "dried_tofu",
            props -> new Item(props.food(SinoMagicFoodValues.DRIED_TOFU)),
            new Item.Properties()
    );
    public static final Supplier<Item> BLACKBEAN = ITEMS.registerItem(
            "blackbean",
            props -> new Item(props.food(SinoMagicFoodValues.BLACKBEAN)),
            new Item.Properties()
    );
    public static final Supplier<Item> REDBEANSHRUB = ITEMS.registerItem(
            "redbeanshrub",
            props -> new Item(props.food(SinoMagicFoodValues.REDBEANSHRUB)),
            new Item.Properties()
    );
    public static final Supplier<Item> REDBEANSHRUB_POWDER = ITEMS.registerItem(
            "redbeanshrub_powder",
            Item::new,
            new Item.Properties()
    );
    public static final Supplier<Item> REDBEAN = ITEMS.registerItem(
            "redbean",
            props -> new Item(props.food(SinoMagicFoodValues.REDBEAN)),
            new Item.Properties()
    );
    public static final Supplier<Item> GREENBEAN = ITEMS.registerItem(
            "greenbean",
            props -> new Item(props.food(SinoMagicFoodValues.GREENBEAN)),
            new Item.Properties()
    );
    public static final Supplier<Item> GREENBEAN_POWDER = ITEMS.registerItem(
            "greenbean_powder",
            Item::new,
            new Item.Properties()
    );
    public static final Supplier<Item> DRIED_SHIT = ITEMS.registerItem(
            "dried_shit",
            Item::new,
            new Item.Properties()
    );
    public static final Supplier<Item> SHIT_BUCKET = ITEMS.registerItem(
            "shit_bucket",
            Item::new,
            new Item.Properties()
                .craftRemainder(Items.BUCKET)
                .stacksTo(16)
    );
    public static final Supplier<Item> YEAST = ITEMS.registerItem(
            "yeast",
            Item::new,
            new Item.Properties()
    );
    public static final Supplier<Item> CHILI = ITEMS.registerItem(
            "chili",
            Item::new,
            new Item.Properties()
    );
    public static final Supplier<Item> FIRE_CHILI = ITEMS.registerItem(
            "fire_chili",
            Item::new,
            new Item.Properties()
    );
    public static final Supplier<Item> CHILI_SEED = ITEMS.registerItem(
            "chili_seed",
            Item::new,
            new Item.Properties()
    );

    //Block items added to v1.0.0-人食五谷开发版
    public static final Supplier<BlockItem> SALT_BLOCK = ITEMS.registerSimpleBlockItem(
            "salt_block",
            SinoMagicBlocks.SALT_BLOCK,
            new Item.Properties()
    );
    public static final Supplier<BlockItem> SALT_ORE = ITEMS.registerSimpleBlockItem(
            "salt_ore",
            SinoMagicBlocks.SALT_ORE,
            new Item.Properties()
    );
    public static final Supplier<BlockItem> TOFU_BLOCK = ITEMS.registerSimpleBlockItem(
            "tofu_block",
            SinoMagicBlocks.TOFU_BLOCK,
            new Item.Properties()
    );
    public static final Supplier<BlockItem> PLANTED_DADOU = ITEMS.registerSimpleBlockItem(
            "planted_dadou",
            SinoMagicBlocks.PLANTED_DADOU,
            new Item.Properties()
    );
    public static final Supplier<BlockItem> WILD_DADOU = ITEMS.registerSimpleBlockItem(
            "wild_dadou",
            SinoMagicBlocks.WILD_DADOU,
            new Item.Properties()
    );
    public static final Supplier<BlockItem> PLANTED_CHILI = ITEMS.registerSimpleBlockItem(
            "planted_chili",
            SinoMagicBlocks.PLANTED_CHILI,
            new Item.Properties()
    );
    public static final Supplier<BlockItem> WILD_CHILI = ITEMS.registerSimpleBlockItem(
            "wild_chili",
            SinoMagicBlocks.WILD_CHILI,
            new Item.Properties()
    );
    public static final Supplier<BlockItem> MILLSTONE = ITEMS.registerSimpleBlockItem(
            "millstone",
            SinoMagicBlocks.MILLSTONE,
            new Item.Properties()
    );
    public static final Supplier<BlockItem> DRIED_SHIT_BLOCK = ITEMS.registerSimpleBlockItem(
            "dried_shit_block",
            SinoMagicBlocks.DRIED_SHIT_BLOCK,
            new Item.Properties()
    );

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
