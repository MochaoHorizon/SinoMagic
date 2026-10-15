package com.mochaohorizon.sinomagic.common.registry;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.mochaohorizon.sinomagic.SinoMagic.MOD_ID;
import static net.minecraft.world.item.Rarity.RARE;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(MOD_ID);

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
    public static final Supplier<Item> SOYBEAN = ITEMS.registerItem(
            "soybean",
            props -> new Item(props.food(FoodValues.SOYBEAN)),
            new Item.Properties()
    );
    public static final Supplier<Item> EDAMAME = ITEMS.registerItem(
            "edamame",
            props -> new Item(props.food(FoodValues.EDAMAME)),
            new Item.Properties()
    );
    public static final Supplier<Item> SOYBEAN_POD = ITEMS.registerItem(
            "soybean_pod",
            Item::new,
            new Item.Properties()
    );
    public static final Supplier<Item> DRIED_SOYBEAN_POD = ITEMS.registerItem(
            "dried_soybean_pod",
            Item::new,
            new Item.Properties()
    );
    public static final Supplier<Item> SOYBEAN_OIL_BOTTLE = ITEMS.registerItem(
            "soybean_oil_bottle",
            Item::new,
            new Item.Properties()
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(16)
    );
    public static final Supplier<Item> SOYBEAN_POWDER = ITEMS.registerItem(
            "soybean_powder",
            Item::new,
            new Item.Properties()
    );
    public static final Supplier<Item> SOY_MILK_BOTTLE = ITEMS.registerItem(
            "soy_milk_bottle",
            props -> new Item(props.food(FoodValues.SOY_MILK_BOTTLE)),
            new Item.Properties()
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(16)
    );
    public static final Supplier<Item> SALTY_TOFU_PUDDING = ITEMS.registerItem(
            "salty_tofu_pudding",
            props -> new Item(props.food(FoodValues.SALTY_TOFU_PUDDING)),
            new Item.Properties()
                .craftRemainder(Items.BOWL)
                .stacksTo(16)
    );
    public static final Supplier<Item> SWEET_TOFU_PUDDING = ITEMS.registerItem(
            "sweet_tofu_pudding",
            props -> new Item(props.food(FoodValues.SWEET_TOFU_PUDDING)),
            new Item.Properties()
                .craftRemainder(Items.BOWL)
                .stacksTo(16)
    );
    public static final Supplier<Item> TOFU = ITEMS.registerItem(
            "tofu",
            props -> new Item(props.food(FoodValues.TOFU)),
            new Item.Properties()
    );
    public static final Supplier<Item> FROZEN_TOFU = ITEMS.registerItem(
            "frozen_tofu",
            props -> new Item(props.food(FoodValues.FROZEN_TOFU)),
            new Item.Properties()
    );
    public static final Supplier<Item> HAIRY_TOFU = ITEMS.registerItem(
            "hairy_tofu",
            props -> new Item(props.food(FoodValues.HAIRY_TOFU)),
            new Item.Properties()
    );
    public static final Supplier<Item> STINKY_TOFU = ITEMS.registerItem(
            "stinky_tofu",
            props -> new Item(props.food(FoodValues.STINKY_TOFU)),
            new Item.Properties()
    );
    public static final Supplier<Item> BAKED_TOFU = ITEMS.registerItem(
            "baked_tofu",
            props -> new Item(props.food(FoodValues.BAKED_TOFU)),
            new Item.Properties()
    );
    public static final Supplier<Item> FERMENTED_BEAN_CURD = ITEMS.registerItem(
            "fermented_bean_curd",
            props -> new Item(props.food(FoodValues.FERMENTED_BEAN_CURD)),
            new Item.Properties()
    );
    public static final Supplier<Item> TOFU_SKIN = ITEMS.registerItem(
            "tofu_skin",
            props -> new Item(props.food(FoodValues.TOFU_SKIN)),
            new Item.Properties()
    );
    public static final Supplier<Item> QIANZHANG_TOFU = ITEMS.registerItem(
            "qianzhang_tofu",
            props -> new Item(props.food(FoodValues.QIANZHANG_TOFU)),
            new Item.Properties()
    );
    public static final Supplier<Item> SALT = ITEMS.registerItem(
            "salt",
            Item::new,
            new Item.Properties()
    );
    public static final Supplier<Item> SOY_SAUCE_BOTTLE = ITEMS.registerItem(
            "soy_sauce_bottle",
            Item::new,
            new Item.Properties()
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(16)
    );
    public static final Supplier<Item> MARINADE_BOTTLE = ITEMS.registerItem(
            "marinade_bottle",
            Item::new,
            new Item.Properties()
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(16)
    );
    public static final Supplier<Item> SOYBEAN_MEAL = ITEMS.registerItem(
            "soybean_meal",
            Item::new,
            new Item.Properties()
    );
    public static final Supplier<Item> LATIAO = ITEMS.registerItem(
            "latiao",
            props -> new Item(props.food(FoodValues.LATIAO)),
            new Item.Properties()
    );
    public static final Supplier<Item> DRIED_TOFU = ITEMS.registerItem(
            "dried_tofu",
            props -> new Item(props.food(FoodValues.DRIED_TOFU)),
            new Item.Properties()
    );
    public static final Supplier<Item> BLACK_BEAN = ITEMS.registerItem(
            "black_bean",
            props -> new Item(props.food(FoodValues.BLACK_BEAN)),
            new Item.Properties()
    );
    public static final Supplier<Item> RED_BEAN = ITEMS.registerItem(
            "red_bean",
            props -> new Item(props.food(FoodValues.RED_BEAN)),
            new Item.Properties()
    );
    public static final Supplier<Item> RED_BEAN_PASTE = ITEMS.registerItem(
            "red_bean_paste",
            Item::new,
            new Item.Properties()
    );
    public static final Supplier<Item> MUNG_BEAN = ITEMS.registerItem(
            "mung_bean",
            props -> new Item(props.food(FoodValues.MUNG_BEAN)),
            new Item.Properties()
    );
    public static final Supplier<Item> MUNG_BEAN_PASTE = ITEMS.registerItem(
            "mung_bean_paste",
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

    //music discs add to v1.0.0-食五谷开发版
    public static final DeferredItem<Item> BAINIAOCHAOFENG_DISC =
            ITEMS.register("bainiaochaofeng_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(JukeboxSongs.BAINIAOCHAOFENG_SONG)
            ));
    public static final DeferredItem<Item> BAOWEIHUANGHE_DISC =
            ITEMS.register("baoweihuanghe_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(JukeboxSongs.BAOWEIHUANGHE_SONG)
            ));
    public static final DeferredItem<Item> BEIJINGJINSHANSHANG_DISC =
            ITEMS.register("beijingjinshanshang_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(JukeboxSongs.BEIJINGJINSHANSHANG_SONG)
            ));
    public static final DeferredItem<Item> BUBUGAO_DISC =
            ITEMS.register("bubugao_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(JukeboxSongs.BUBUGAO_SONG)
            ));
    public static final DeferredItem<Item> CHINFENGWUYI_DISC =
            ITEMS.register("chinfengwuyi_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(JukeboxSongs.CHINFENGWUYI_SONG)
            ));
    public static final DeferredItem<Item> DADAO_DISC =
            ITEMS.register("dadao_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(JukeboxSongs.DADAO_SONG)
            ));
    public static final DeferredItem<Item> DADONGBEI_DISC =
            ITEMS.register("dadongbei_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(JukeboxSongs.DADONGBEI_SONG)
            ));
    public static final DeferredItem<Item> DAHAIHANGXING_DISC =
            ITEMS.register("dahaihangxing_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(JukeboxSongs.DAHAIHANGXING_SONG)
            ));
    public static final DeferredItem<Item> HAOHANGE_DISC =
            ITEMS.register("haohange_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(JukeboxSongs.HAOHANGE_SONG)
            ));
    public static final DeferredItem<Item> HAOYUNLAI_DISC =
            ITEMS.register("haoyunlai_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(JukeboxSongs.HAOYUNLAI_SONG)
            ));
    public static final DeferredItem<Item> JINSHEKUANGWU_DISC =
            ITEMS.register("jinshekuangwu_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(JukeboxSongs.JINSHEKUANGWU_SONG)
            ));
    public static final DeferredItem<Item> LANLINGWANG_DISC =
            ITEMS.register("lanlingwang_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(JukeboxSongs.LANLINGWANG_SONG)
            ));
    public static final DeferredItem<Item> MINGTIANHUIGENGHAO_DISC =
            ITEMS.register("mingtianhuigenghao_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(JukeboxSongs.MINGTIANHUIGENGHAO_SONG)
            ));
    public static final DeferredItem<Item> OURWORKERHAVEPOWER_DISC =
            ITEMS.register("ourworkerhavepower_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(JukeboxSongs.OURWORKERHAVEPOWER_SONG)
            ));
    public static final DeferredItem<Item> SAIMA_DISC =
            ITEMS.register("saima_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(JukeboxSongs.SAIMA_SONG)
            ));
    public static final DeferredItem<Item> SHEHUIZHUYIHAO_DISC =
            ITEMS.register("shehuizhuyihao_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(JukeboxSongs.SHEHUIZHUYIHAO_SONG)
            ));
    public static final DeferredItem<Item> TONGTIANDADAO_DISC =
            ITEMS.register("tongtiandadao_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(JukeboxSongs.TONGTIANDADAO_SONG)
            ));
    public static final DeferredItem<Item> YOUJIDUI_DISC =
            ITEMS.register("youjidui_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(JukeboxSongs.YOUJIDUI_SONG)
            ));
    public static final DeferredItem<Item> YUANFANGKEREN_DISC =
            ITEMS.register("yuanfangkeren_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(JukeboxSongs.YUANFANGKEREN_SONG)
            ));
    public static final DeferredItem<Item> ZIJINGHUA_DISC =
            ITEMS.register("zijinghua_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(JukeboxSongs.ZIJINGHUA_SONG)
            ));

    //Block items add to v1.0.0-人食五谷开发版
    public static final DeferredItem<Item> SALT_BLOCK =
            ITEMS.register("salt_block", () -> new BlockItem(ModBlocks.SALT_BLOCK.get(), new Item.Properties()
            ));
    public static final DeferredItem<Item> SALT_ORE =
            ITEMS.register("salt_ore", () -> new BlockItem(ModBlocks.SALT_ORE.get(), new Item.Properties()
            ));
    public static final DeferredItem<Item> TOFU_BLOCK =
            ITEMS.register("tofu_block", () -> new BlockItem(ModBlocks.TOFU_BLOCK.get(), new Item.Properties()
            ));
    public static final DeferredItem<Item> MILLSTONE =
            ITEMS.register("millstone", () -> new BlockItem(ModBlocks.MILLSTONE.get(), new Item.Properties()
            ));
    public static final DeferredItem<Item> VAT =
            ITEMS.register("vat", () -> new BlockItem(ModBlocks.VAT.get(), new Item.Properties()
            ));
    public static final DeferredItem<Item> SHIT_BLOCK =
            ITEMS.register("shit_block", () -> new BlockItem(ModBlocks.SHIT_BLOCK.get(), new Item.Properties()
            ));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
