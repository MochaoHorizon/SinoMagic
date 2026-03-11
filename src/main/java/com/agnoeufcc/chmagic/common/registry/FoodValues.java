package com.agnoeufcc.chmagic.common.registry;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;
//import com.agnoeufcc.chmagic.common.registry.ModEffects;

public class FoodValues
{
    // basic foods
    public static final FoodProperties SOYBEAN = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.5f)
            .fast()
            .build();
    public static final FoodProperties GREEN_SOYBEAN = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.5f)
            .fast()
            .build();
    public static final FoodProperties SALTY_TOFU_CURD= new FoodProperties.Builder()
            .nutrition(10)
            .saturationModifier(1.0f)
            .usingConvertsTo(Items.BOWL)
            .build();
    public static final FoodProperties SWEET_TOFU_CURD= new FoodProperties.Builder()
            .nutrition(10)
            .saturationModifier(1.0f)
            .usingConvertsTo(Items.BOWL)
            .build();
    public static final FoodProperties TOFU= new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.5f)
            .fast()
            .build();
    public static final FoodProperties FROZEN_TOFU = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.5f)
            .build();
    public static final FoodProperties HAIRY_TOFU = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.5f)
            .build();
    public static final FoodProperties STINKY_TOFU= new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(0.625f)
            .build();
    public static final FoodProperties BAKED_TOFU= new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(1.0f)
            .build();
    public static final FoodProperties FERMENTED_TOFU= new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.5f)
            .build();
    public static final FoodProperties TOFU_SKIN= (new FoodProperties.Builder())
            .nutrition(6)
            .saturationModifier(0.5f)
            .fast()
            .build();
    public static final FoodProperties QIANZHANG_TOFU= (new FoodProperties.Builder())
            .nutrition(5)
            .saturationModifier(0.5f)
            .build();
    public static final FoodProperties TOFU_JERKY= (new FoodProperties.Builder())
            .nutrition(5)
            .saturationModifier(0.5f)
            .build();
    public static final FoodProperties LATIAO= (new FoodProperties.Builder())
            .nutrition(3)
            .saturationModifier(0.5f)
            .build();

/*
    public static final FoodProperties SOYAMILK_BOTTLE = (new FoodProperties.Builder())
            .nutrition(5)
            .saturationModifier(0.5f)
            .build();
 */

}
