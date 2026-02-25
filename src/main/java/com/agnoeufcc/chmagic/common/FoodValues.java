package com.agnoeufcc.chmagic.common;

import com.google.common.collect.ImmutableMap;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import com.agnoeufcc.chmagic.registry.ModEffects;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class FoodValues
{
    // basic foods
    public static final FoodProperties DADOU = (new FoodProperties.Builder())
            .nutrition(2)
            .saturationModifier(0.5f)
            .fast(true)
            .build();
    public static final FoodProperties MAODOU = (new FoodProperties.Builder())
            .nutrition(3)
            .saturationModifier(0.5f)
            .fast(true)
            .build();
    public static final FoodProperties SOYAMILK_BOTTLE = (new FoodProperties.Builder())
            .nutrition(5)
            .saturationModifier(0.5f)
            .fast(false)
            .build();
    public static final FoodProperties SALTY_TOFU_CURD= (new FoodProperties.Builder())
            .nutrition(10)
            .saturationModifier(1.0f)
            .fast(false)
            .usingConvertsTo(minecraft:bowl)
            .build();
    public static final FoodProperties SWEET_TOFU_CURD= (new FoodProperties.Builder())
            .nutrition(10)
            .saturationModifier(1.0f)
            .fast(false)
            .usingConvertsTo(minecraft:bowl)
            .build();
    public static final FoodProperties TOFU= (new FoodProperties.Builder())
            .nutrition(4)
            .saturationModifier(0.5f)
            .fast(true)
            .build();
    public static final FoodProperties FROZEN_TOFU = (new FoodProperties.Builder())
            .nutrition(4)
            .saturationModifier(0.5f)
            .fast(true)
            .build();
    public static final FoodProperties MOULD_TOFU = (new FoodProperties.Builder())
            .nutrition(5)
            .saturationModifier(0.5f)
            .fast(true)
            .build();
    public static final FoodProperties STINKY_TOFU= (new FoodProperties.Builder())
            .nutrition(8)
            .saturationModifier(0.625f)
            .fast(false)
            .build();
    public static final FoodProperties BAKED_TOFU= (new FoodProperties.Builder())
            .nutrition(8)
            .saturationModifier(1.0f)
            .fast(false)
            .build();
    public static final FoodProperties FURU= (new FoodProperties.Builder())
            .nutrition(5)
            .saturationModifier(0.5f)
            .fast(false)
            .build();
    public static final FoodProperties DOUPI= (new FoodProperties.Builder())
            .nutrition(6)
            .saturationModifier(0.5f)
            .fast(true)
            .build();
    public static final FoodProperties QIANZHANG_TOFU= (new FoodProperties.Builder())
            .nutrition(5)
            .saturationModifier(0.5f)
            .fast(true)
            .build();
}
