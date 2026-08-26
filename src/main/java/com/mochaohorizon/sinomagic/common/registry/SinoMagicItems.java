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

public class SinoMagicItems {
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

    //music discs add to v1.0.0-食五谷开发版
    public static final DeferredItem<Item> BAINIAOCHAOFENG_DISC =
            ITEMS.register("bainiaochaofeng_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(SinoMagicJukeboxSongs.BAINIAOCHAOFENG_SONG.getKey())
            ));
    public static final DeferredItem<Item> BAOWEIHUANGHE_DISC =
            ITEMS.register("baoweihuanghe_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(SinoMagicJukeboxSongs.BAOWEIHUANGHE_SONG.getKey())
            ));
    public static final DeferredItem<Item> BEIJINGJINSHANSHANG_DISC =
            ITEMS.register("beijingjinshanshang_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(SinoMagicJukeboxSongs.BEIJINGJINSHANSHANG_SONG.getKey())
            ));
    public static final DeferredItem<Item> BUBUGAO_DISC =
            ITEMS.register("bubugao_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(SinoMagicJukeboxSongs.BUBUGAO_SONG.getKey())
            ));
    public static final DeferredItem<Item> CHINFENGWUYI_DISC =
            ITEMS.register("chinfengwuyi_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(SinoMagicJukeboxSongs.CHINFENGWUYI_SONG.getKey())
            ));
    public static final DeferredItem<Item> DADAO_DISC =
            ITEMS.register("dadao_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(SinoMagicJukeboxSongs.DADAO_SONG.getKey())
            ));
    public static final DeferredItem<Item> DADONGBEI_DISC =
            ITEMS.register("dadongbei_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(SinoMagicJukeboxSongs.DADONGBEI_SONG.getKey())
            ));
    public static final DeferredItem<Item> DAHAIHANGXING_DISC =
            ITEMS.register("dahaihangxing_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(SinoMagicJukeboxSongs.DAHAIHANGXING_SONG.getKey())
            ));
    public static final DeferredItem<Item> HAOHANGE_DISC =
            ITEMS.register("haohange_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(SinoMagicJukeboxSongs.HAOHANGE_SONG.getKey())
            ));
    public static final DeferredItem<Item> HAOYUNLAI_DISC =
            ITEMS.register("haoyunlai_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(SinoMagicJukeboxSongs.HAOYUNLAI_SONG.getKey())
            ));
    public static final DeferredItem<Item> JINSHEKUANGWU_DISC =
            ITEMS.register("jinshekuangwu_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(SinoMagicJukeboxSongs.JINSHEKUANGWU_SONG.getKey())
            ));
    public static final DeferredItem<Item> LANLINGWANG_DISC =
            ITEMS.register("lanlingwang_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(SinoMagicJukeboxSongs.LANLINGWANG_SONG.getKey())
            ));
    public static final DeferredItem<Item> MINGTIANHUIGENGHAO_DISC =
            ITEMS.register("mingtianhuigenghao_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(SinoMagicJukeboxSongs.MINGTIANHUIGENGHAO_SONG.getKey())
            ));
    public static final DeferredItem<Item> OURWORKERHAVEPOWER_DISC =
            ITEMS.register("ourworkerhavepower_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(SinoMagicJukeboxSongs.OURWORKERHAVEPOWER_SONG.getKey())
            ));
    public static final DeferredItem<Item> SAIMA_DISC =
            ITEMS.register("saima_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(SinoMagicJukeboxSongs.SAIMA_SONG.getKey())
            ));
    public static final DeferredItem<Item> SHEHUIZHUYIHAO_DISC =
            ITEMS.register("shehuizhuyihao_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(SinoMagicJukeboxSongs.SHEHUIZHUYIHAO_SONG.getKey())
            ));
    public static final DeferredItem<Item> TONGTIANDADAO_DISC =
            ITEMS.register("tongtiandadao_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(SinoMagicJukeboxSongs.TONGTIANDADAO_SONG.getKey())
            ));
    public static final DeferredItem<Item> YOUJIDUI_DISC =
            ITEMS.register("youjidui_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(SinoMagicJukeboxSongs.YOUJIDUI_SONG.getKey())
            ));
    public static final DeferredItem<Item> YUANFANGKEREN_DISC =
            ITEMS.register("yuanfangkeren_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(SinoMagicJukeboxSongs.YUANFANGKEREN_SONG.getKey())
            ));
    public static final DeferredItem<Item> ZIJINGHUA_DISC =
            ITEMS.register("zijinghua_disc", () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    .rarity(RARE)
                    .jukeboxPlayable(SinoMagicJukeboxSongs.ZIJINGHUA_SONG.getKey())
            ));

    //Block items add to v1.0.0-人食五谷开发版
    public static final DeferredItem<Item> SALT_BLOCK =
            ITEMS.register("salt_block", () -> new BlockItem(SinoMagicBlocks.SALT_BLOCK.get(), new Item.Properties()
            ));
    public static final DeferredItem<Item> SALT_ORE =
            ITEMS.register("salt_ore", () -> new BlockItem(SinoMagicBlocks.SALT_ORE.get(), new Item.Properties()
            ));
    public static final DeferredItem<Item> TOFU_BLOCK =
            ITEMS.register("tofu_block", () -> new BlockItem(SinoMagicBlocks.TOFU_BLOCK.get(), new Item.Properties()
            ));
    public static final DeferredItem<Item> MILLSTONE =
            ITEMS.register("millstone", () -> new BlockItem(SinoMagicBlocks.MILLSTONE.get(), new Item.Properties()
            ));
    public static final DeferredItem<Item> DAGANG =
            ITEMS.register("dagang", () -> new BlockItem(SinoMagicBlocks.DAGANG.get(), new Item.Properties()
            ));
    public static final DeferredItem<Item> DRIED_SHIT_BLOCK =
            ITEMS.register("dried_shit_block", () -> new BlockItem(SinoMagicBlocks.DRIED_SHIT_BLOCK.get(), new Item.Properties()
            ));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
