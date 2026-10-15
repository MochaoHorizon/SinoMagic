package com.mochaohorizon.sinomagic.registry;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;

public class FoodValues
{
    //Food items added in v1.0.0-人食五谷开发版
    public static final FoodProperties SOYBEAN = (new FoodProperties.Builder())
            .nutrition(2)
            .saturationModifier(0.5f)
            .fast()
            .build();
    public static final FoodProperties EDAMAME = (new FoodProperties.Builder())
            .nutrition(3)
            .saturationModifier(0.5f)
            .fast()
            .build();
    public static final FoodProperties SOY_MILK_BOTTLE = (new FoodProperties.Builder())
            .nutrition(5)
            .saturationModifier(0.5f)
            .build();
    public static final FoodProperties SALTY_TOFU_PUDDING = (new FoodProperties.Builder())
            .nutrition(10)
            .saturationModifier(1.0f)
            .usingConvertsTo(Items.BOWL)
            .build();
    public static final FoodProperties SWEET_TOFU_PUDDING = (new FoodProperties.Builder())
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
    public static final FoodProperties HAIRY_TOFU = (new FoodProperties.Builder())
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
    public static final FoodProperties FERMENTED_BEAN_CURD = (new FoodProperties.Builder())
            .nutrition(5)
            .saturationModifier(0.5f)
            .build();
    public static final FoodProperties TOFU_SKIN = (new FoodProperties.Builder())
            .nutrition(6)
            .saturationModifier(0.5f)
            .fast()
            .build();
    public static final FoodProperties QIANZHANG_TOFU = (new FoodProperties.Builder())
            .nutrition(5)
            .saturationModifier(0.5f)
            .fast()
            .build();
    public static final FoodProperties LATIAO = (new FoodProperties.Builder())
            .nutrition(8)
            .saturationModifier(1.0f)
            .build();
    public static final FoodProperties DRIED_TOFU = (new FoodProperties.Builder())
            .nutrition(8)
            .saturationModifier(1.0f)
            .build();
    public static final FoodProperties BLACK_BEAN = (new FoodProperties.Builder())
            .nutrition(2)
            .saturationModifier(0.5f)
            .fast()
            .build();
    public static final FoodProperties RED_BEAN = (new FoodProperties.Builder())
            .nutrition(2)
            .saturationModifier(0.5f)
            .fast()
            .build();
    public static final FoodProperties MUNG_BEAN = (new FoodProperties.Builder())
            .nutrition(2)
            .saturationModifier(0.5f)
            .fast()
            .build();
}
