package com.agnoeufcc.chmagic.data;

import com.agnoeufcc.chmagic.ChineseMagic;
import com.agnoeufcc.chmagic.common.registry.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ItemModels extends ItemModelProvider {
    public ItemModels(PackOutput output, ExistingFileHelper existingFileHelper){
        super (output, ChineseMagic.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels (){
        basicItem(ModItems.SOYBEAN.get());
        basicItem(ModItems.GREEN_SOYBEAN.get());
        basicItem(ModItems.POD.get());
        basicItem(ModItems.DRIED_POD.get());
        basicItem(ModItems.SOYBEAN_POWDER.get());
        basicItem(ModItems.TOFU.get());
        basicItem(ModItems.SALTY_TOFU_CURD.get());
        basicItem(ModItems.SWEET_TOFU_CURD.get());
        basicItem(ModItems.FROZEN_TOFU.get());
        basicItem(ModItems.HAIRY_TOFU.get());
        basicItem(ModItems.STINKY_TOFU.get());
        basicItem(ModItems.BAKED_TOFU.get());
        basicItem(ModItems.FERMENTED_TOFU.get());
        basicItem(ModItems.TOFU_SKIN.get());
        basicItem(ModItems.QIANZHANG_TOFU.get());
        basicItem(ModItems.SOYBEAN_MEAL.get());
        basicItem(ModItems.TOFU_JERKY.get());
        basicItem(ModItems.LATIAO.get());
        basicItem(ModItems.BLACKBEAN.get());
        basicItem(ModItems.REDBEAN.get());
        basicItem(ModItems.REDBEAN_PASTE.get());
        basicItem(ModItems.GREENBEAN.get());
        basicItem(ModItems.GREENBEAN_PASTE.get());
        basicItem(ModItems.SALT.get());

    }
}
