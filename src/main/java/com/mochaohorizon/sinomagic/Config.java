package com.mochaohorizon.sinomagic;

import java.util.List;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.common.ModConfigSpec;

public class Config {
    public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.BooleanValue LOG_DIRT_BLOCK = BUILDER
            .comment("Whether to log the dirt block on common setup")
            .define("logDirtBlock", true);

    public static final ModConfigSpec.IntValue MAGIC_NUMBER = BUILDER
            .comment("A magic number")
            .defineInRange("magicNumber", 42, 0, Integer.MAX_VALUE);

    public static final ModConfigSpec.ConfigValue<String> MAGIC_NUMBER_INTRODUCTION = BUILDER
            .comment("What you want the introduction message to be for the magic number")
            .define("magicNumberIntroduction", "The magic number is... ");

    public static final ModConfigSpec.ConfigValue<List<? extends String>> ITEM_STRINGS = BUILDER
            .comment("A list of items to log on common setup.")
            .defineListAllowEmpty("items", List.of("minecraft:iron_ingot"), () -> "", Config::validateItemName);

    // ---------- 饥饿 / 中毒时的「史」掉落（见 event/DriedShitDropHandler） ----------

    static {
        BUILDER.comment("饥饿或中毒状态下掉落「史」的机制").push("driedShit");
    }

    public static final ModConfigSpec.BooleanValue SHIT_ENABLED = BUILDER
            .comment("是否启用「史」掉落。关掉后完全不掉落，身上残留的计时也会被清除")
            .define("enabled", true);

    public static final ModConfigSpec.IntValue SHIT_BASE_INTERVAL = BUILDER
            .comment("基础间隔（游戏刻，20 刻 = 1 秒）")
            .defineInRange("baseInterval", 80, 1, 72000);

    public static final ModConfigSpec.DoubleValue SHIT_POISON_SPEED_FACTOR = BUILDER
            .comment("中毒时的速度倍率")
            .defineInRange("poisonSpeedFactor", 1.0D, 0.01D, 100.0D);

    public static final ModConfigSpec.DoubleValue SHIT_HUNGER_SPEED_FACTOR = BUILDER
            .comment("饥饿时的速度倍率（倍率越低掉得越慢，与中毒的倍率共同决定两者快慢关系）")
            .defineInRange("hungerSpeedFactor", 0.5D, 0.01D, 100.0D);

    public static final ModConfigSpec.DoubleValue SHIT_LEVEL_SPEED_PER_AMP = BUILDER
            .comment("效果每提升一级所增加的速度倍率（1.0 表示每级速度翻倍）")
            .defineInRange("levelSpeedPerAmp", 1.0D, 0.0D, 100.0D);

    public static final ModConfigSpec.DoubleValue SHIT_JITTER = BUILDER
            .comment("每次掉落间隔的随机抖动幅度（0.5 表示 ±50%）")
            .defineInRange("jitter", 0.5D, 0.0D, 1.0D);

    public static final ModConfigSpec.DoubleValue SHIT_FIRST_DELAY_RATIO = BUILDER
            .comment("首次掉落相对基础间隔的延迟比例（0.1 表示延后 10%，不会一获得效果就立刻掉落）")
            .defineInRange("firstDelayRatio", 0.1D, 0.0D, 1.0D);

    static {
        BUILDER.pop();
    }

    static final ModConfigSpec SPEC = BUILDER.build();

    private static boolean validateItemName(final Object obj) {
        return obj instanceof String itemName && BuiltInRegistries.ITEM.containsKey(ResourceLocation.parse(itemName));
    }
}
