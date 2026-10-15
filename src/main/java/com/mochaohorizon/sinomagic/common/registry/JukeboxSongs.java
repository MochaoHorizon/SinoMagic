package com.mochaohorizon.sinomagic.common.registry;

import com.mochaohorizon.sinomagic.SinoMagic;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.JukeboxSong;

/**
 * JukeboxSong 是数据包注册表（datapack registry），不属于 BuiltInRegistries，
 * 无法通过 DeferredRegister 注册 —— 歌曲本体定义在 data/sinomagic/jukebox_song/<name>.json。
 * 这里只提供唱片物品 jukeboxPlayable 组件所需的注册键。
 */
public class JukeboxSongs {
    public static final ResourceKey<JukeboxSong> BAINIAOCHAOFENG_SONG     = key("bainiaochaofeng_song");
    public static final ResourceKey<JukeboxSong> BAOWEIHUANGHE_SONG       = key("baoweihuanghe_song");
    public static final ResourceKey<JukeboxSong> BEIJINGJINSHANSHANG_SONG = key("beijingjinshanshang_song");
    public static final ResourceKey<JukeboxSong> BUBUGAO_SONG             = key("bubugao_song");
    public static final ResourceKey<JukeboxSong> CHINFENGWUYI_SONG        = key("chinfengwuyi_song");
    public static final ResourceKey<JukeboxSong> DADAO_SONG               = key("dadao_song");
    public static final ResourceKey<JukeboxSong> DADONGBEI_SONG           = key("dadongbei_song");
    public static final ResourceKey<JukeboxSong> DAHAIHANGXING_SONG       = key("dahaihangxing_song");
    public static final ResourceKey<JukeboxSong> HAOHANGE_SONG            = key("haohange_song");
    public static final ResourceKey<JukeboxSong> HAOYUNLAI_SONG           = key("haoyunlai_song");
    public static final ResourceKey<JukeboxSong> JINSHEKUANGWU_SONG       = key("jinshekuangwu_song");
    public static final ResourceKey<JukeboxSong> LANLINGWANG_SONG         = key("lanlingwang_song");
    public static final ResourceKey<JukeboxSong> MINGTIANHUIGENGHAO_SONG  = key("mingtianhuigenghao_song");
    public static final ResourceKey<JukeboxSong> OURWORKERHAVEPOWER_SONG  = key("ourworkerhavepower_song");
    public static final ResourceKey<JukeboxSong> SAIMA_SONG               = key("saima_song");
    public static final ResourceKey<JukeboxSong> SHEHUIZHUYIHAO_SONG      = key("shehuizhuyihao_song");
    public static final ResourceKey<JukeboxSong> TONGTIANDADAO_SONG       = key("tongtiandadao_song");
    public static final ResourceKey<JukeboxSong> YOUJIDUI_SONG            = key("youjidui_song");
    public static final ResourceKey<JukeboxSong> YUANFANGKEREN_SONG       = key("yuanfangkeren_song");
    public static final ResourceKey<JukeboxSong> ZIJINGHUA_SONG           = key("zijinghua_song");

    private static ResourceKey<JukeboxSong> key(String name) {
        return ResourceKey.create(Registries.JUKEBOX_SONG,
                ResourceLocation.fromNamespaceAndPath(SinoMagic.MOD_ID, name));
    }
}
