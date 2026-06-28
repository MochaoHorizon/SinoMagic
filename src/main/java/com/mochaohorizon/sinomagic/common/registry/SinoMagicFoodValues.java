package com.mochaohorizon.sinomagic.common.registry;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;

public class SinoMagicFoodValues
{
    //add in v0.1.0
    public static final FoodProperties DADOU = (new FoodProperties.Builder())
            .nutrition(2)
            .saturationModifier(0.5f)
            .fast()
            .build();
    public static final FoodProperties MAODOU = (new FoodProperties.Builder())
            .nutrition(3)
            .saturationModifier(0.5f)
            .fast()
            .build();
    public static final FoodProperties SOYAMILK_BOTTLE = (new FoodProperties.Builder())
            .nutrition(5)
            .saturationModifier(0.5f)
            .build();
    public static final FoodProperties SALTY_TOFU_CURD = (new FoodProperties.Builder())
            .nutrition(10)
            .saturationModifier(1.0f)
            .usingConvertsTo(Items.BOWL)
            .build();
    public static final FoodProperties SWEET_TOFU_CURD = (new FoodProperties.Builder())
            .nutrition(10)
            .saturationModifier(1.0f)
            .usingConvertsTo(Items.BOWL)
            .build();
    public static final FoodProperties TOFU = (new FoodProperties.Builder())
            .nutrition(4)
            .saturationModifier(0.5f)
            .build();
    public static final FoodProperties FROZEN_TOFU = (new FoodProperties.Builder())
            .nutrition(4)
            .saturationModifier(0.5f)
            .fast()
            .build();
    public static final FoodProperties MOULD_TOFU = (new FoodProperties.Builder())
            .nutrition(5)
            .saturationModifier(0.5f)
            .build();
    public static final FoodProperties STINKY_TOFU = (new FoodProperties.Builder())
            .nutrition(8)
            .saturationModifier(0.625f)
            .build();
    public static final FoodProperties BAKED_TOFU = (new FoodProperties.Builder())
            .nutrition(8)
            .saturationModifier(1.0f)
            .build();
    public static final FoodProperties FURU = (new FoodProperties.Builder())
            .nutrition(5)
            .saturationModifier(0.5f)
            .build();
    public static final FoodProperties DOUPI = (new FoodProperties.Builder())
            .nutrition(6)
            .saturationModifier(0.5f)
            .fast()
            .build();
    public static final FoodProperties QIANZHANG_TOFU = (new FoodProperties.Builder())
            .nutrition(5)
            .saturationModifier(0.5f)
            .fast()
            .build();
    public static final FoodProperties SPICY_GLUTEN = (new FoodProperties.Builder())
            .nutrition(8)
            .saturationModifier(1.0f)
            .build();
    public static final FoodProperties DRIED_TOFU = (new FoodProperties.Builder())
            .nutrition(8)
            .saturationModifier(1.0f)
            .build();
}
