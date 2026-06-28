package com.mochaohorizon.sinomagic.data;

import com.mochaohorizon.sinomagic.SinoMagic;
import com.mochaohorizon.sinomagic.common.registry.SinoMagicItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ItemModels extends ItemModelProvider {
    public ItemModels(PackOutput output, ExistingFileHelper existingFileHelper){
        super (output, SinoMagic.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels (){
        basicItem(SinoMagicItems.DADOU.get());
        basicItem(SinoMagicItems.MAODOU.get());
        basicItem(SinoMagicItems.DOUJIA.get());
        basicItem(SinoMagicItems.DRIED_DOUJIA.get());
        basicItem(SinoMagicItems.DADOU_POWDER.get());
        basicItem(SinoMagicItems.TOFU.get());
        basicItem(SinoMagicItems.SALTY_TOFU_CURD.get());
        basicItem(SinoMagicItems.SWEET_TOFU_CURD.get());
        basicItem(SinoMagicItems.FROZEN_TOFU.get());
        basicItem(SinoMagicItems.MOULD_TOFU.get());
        basicItem(SinoMagicItems.STINKY_TOFU.get());
        basicItem(SinoMagicItems.BAKED_TOFU.get());
        basicItem(SinoMagicItems.FURU.get());
        basicItem(SinoMagicItems.DOUPI.get());
        basicItem(SinoMagicItems.QIANZHANG_TOFU.get());
        basicItem(SinoMagicItems.DREGS_DADOU.get());
        basicItem(SinoMagicItems.DRIED_TOFU.get());
        basicItem(SinoMagicItems.SPICY_GLUTEN.get());
        basicItem(SinoMagicItems.BLACKBEAN.get());
        basicItem(SinoMagicItems.REDBEANSHRUB.get());
        basicItem(SinoMagicItems.REDBEANSHRUB_POWDER.get());
        basicItem(SinoMagicItems.REDBEAN.get());
        basicItem(SinoMagicItems.GREENBEAN.get());
        basicItem(SinoMagicItems.GREENBEAN_POWDER.get());
        basicItem(SinoMagicItems.SOYAMILK_BOTTLE.get());
        basicItem(SinoMagicItems.DADOU_OIL_BOTTLE.get());
        basicItem(SinoMagicItems.SOY_BOTTLE.get());
        basicItem(SinoMagicItems.LUZHI_BOTTLE.get());
        basicItem(SinoMagicItems.DRIED_SHIT.get());
        basicItem(SinoMagicItems.SHIT_BUCKET.get());
        basicItem(SinoMagicItems.SALT.get());
        basicItem(SinoMagicItems.YEAST.get());

    }
}
