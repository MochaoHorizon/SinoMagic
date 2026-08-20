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
    protected void registerModels () {
        //Model of simple items add to v1.0.0-人食五谷开发版
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
        basicItem(SinoMagicItems.CHILI.get());
        basicItem(SinoMagicItems.FIRE_CHILI.get());
        basicItem(SinoMagicItems.CHILI_SEED.get());
        /*basicItem(SinoMagicItems.JIANBING.get());
        basicItem(SinoMagicItems.HUAJUAN.get());
        basicItem(SinoMagicItems.MANTOU.get());
        basicItem(SinoMagicItems.MANTOU_REDBEAN.get());
        basicItem(SinoMagicItems.XIAOMI.get());
        basicItem(SinoMagicItems.MEIZI.get());*/

        //Model of music disc add to v1.0.0-人食五谷开发版
        basicItem(SinoMagicItems.BAINIAOCHAOFENG_DISC.get());
        basicItem(SinoMagicItems.BAOWEIHUANGHE_DISC.get());
        basicItem(SinoMagicItems.BEIJINGJINSHANSHANG_DISC.get());
        basicItem(SinoMagicItems.BUBUGAO_DISC.get());
        basicItem(SinoMagicItems.CHINFENGWUYI_DISC.get());
        basicItem(SinoMagicItems.DADAO_DISC.get());
        basicItem(SinoMagicItems.DADONGBEI_DISC.get());
        basicItem(SinoMagicItems.DAHAIHANGXING_DISC.get());
        basicItem(SinoMagicItems.HAOHANGE_DISC.get());
        basicItem(SinoMagicItems.HAOYUNLAI_DISC.get());
        basicItem(SinoMagicItems.JINSHEKUANGWU_DISC.get());
        basicItem(SinoMagicItems.LANLINGWANG_DISC.get());
        basicItem(SinoMagicItems.MINGTIANHUIGENGHAO_DISC.get());
        basicItem(SinoMagicItems.OURWORKERHAVEPOWER_DISC.get());
        basicItem(SinoMagicItems.SAIMA_DISC.get());
        basicItem(SinoMagicItems.SHEHUIZHUYIHAO_DISC.get());
        basicItem(SinoMagicItems.TONGTIANDADAO_DISC.get());
        basicItem(SinoMagicItems.YOUJIDUI_DISC.get());
        basicItem(SinoMagicItems.YUANFANGKEREN_DISC.get());
        basicItem(SinoMagicItems.ZIJINGHUA_DISC.get());

        //Model of blockitem add to v1.0.0-人食五谷开发版
        basicItem(SinoMagicItems.SALT_BLOCK.get());
        basicItem(SinoMagicItems.SALT_ORE.get());
        basicItem(SinoMagicItems.TOFU_BLOCK.get());
        basicItem(SinoMagicItems.DAGANG.get());
        basicItem(SinoMagicItems.MILLSTONE.get());
        basicItem(SinoMagicItems.DRIED_SHIT_BLOCK.get());
    }
}
