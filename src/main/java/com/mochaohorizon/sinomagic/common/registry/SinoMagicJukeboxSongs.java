package com.mochaohorizon.sinomagic.common.registry;

import com.mochaohorizon.sinomagic.SinoMagic;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.JukeboxSong;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class SinoMagicJukeboxSongs {
    public static final DeferredRegister<JukeboxSong> JUKEBOX_SONGS =
            DeferredRegister.create(Registries.JUKEBOX_SONG, SinoMagic.MOD_ID);

    public static final DeferredHolder<JukeboxSong, JukeboxSong> BAINIAOCHAOFENG_SONG =
            JUKEBOX_SONGS.register("bainiaochaofeng_song",
                    () -> new JukeboxSong(
                        SinoMagicSoundEvents.BAINIAOCHAOFENG,
                        Component.translatable("jukebox_song." + SinoMagic.MOD_ID + "bainiaochaofeng"),
                        214,
                        15
                    ));
    public static final DeferredHolder<JukeboxSong, JukeboxSong> BAOWEIHUANGHE_SONG =
            JUKEBOX_SONGS.register("baoweihuanghe_song",
                    () -> new JukeboxSong(
                            SinoMagicSoundEvents.BAOWEIHUANGHE,
                            Component.translatable("jukebox_song." + SinoMagic.MOD_ID + "baoweihuanghe"),
                            171,
                            15
                    ));
    public static final DeferredHolder<JukeboxSong, JukeboxSong> BEIJINGJINSHANSHANG_SONG =
            JUKEBOX_SONGS.register("beijingjinshanshang_song",
                    () -> new JukeboxSong(
                            SinoMagicSoundEvents.BEIJINGJINSHANSHANG,
                            Component.translatable("jukebox_song." + SinoMagic.MOD_ID + "beijingjinshanshang"),
                            164,
                            15
                    ));
    public static final DeferredHolder<JukeboxSong, JukeboxSong> BUBUGAO_SONG =
            JUKEBOX_SONGS.register("bubugao_song",
                    () -> new JukeboxSong(
                            SinoMagicSoundEvents.BUBUGAO,
                            Component.translatable("jukebox_song." + SinoMagic.MOD_ID + "bubugao"),
                            170,
                            15
                    ));
    public static final DeferredHolder<JukeboxSong, JukeboxSong> CHINFENGWUYI_SONG =
            JUKEBOX_SONGS.register("chinfengwuyi_song",
                    () -> new JukeboxSong(
                            SinoMagicSoundEvents.CHINFENGWUYI,
                            Component.translatable("jukebox_song." + SinoMagic.MOD_ID + "chinfengwuyi"),
                            253,
                            15
                    ));
    public static final DeferredHolder<JukeboxSong, JukeboxSong> DADAO_SONG =
            JUKEBOX_SONGS.register("dadao_song",
                    () -> new JukeboxSong(
                            SinoMagicSoundEvents.DADAO,
                            Component.translatable("jukebox_song." + SinoMagic.MOD_ID + "dadao"),
                            84,
                            15
                    ));
    public static final DeferredHolder<JukeboxSong, JukeboxSong> DADONGBEI_SONG =
            JUKEBOX_SONGS.register("dadongbei_song",
                    () -> new JukeboxSong(
                            SinoMagicSoundEvents.DADONGBEI,
                            Component.translatable("jukebox_song." + SinoMagic.MOD_ID + "dadongbei"),
                            204,
                            15
                    ));
    public static final DeferredHolder<JukeboxSong, JukeboxSong> DAHAIHANGXING_SONG =
            JUKEBOX_SONGS.register("dahaihangxing_song",
                    () -> new JukeboxSong(
                            SinoMagicSoundEvents.DAHAIHANGXING,
                            Component.translatable("jukebox_song." + SinoMagic.MOD_ID + "dahaihangxing"),
                            136,
                            15
                    ));
    public static final DeferredHolder<JukeboxSong, JukeboxSong> HAOHANGE_SONG =
            JUKEBOX_SONGS.register("haohange_song",
                    () -> new JukeboxSong(
                            SinoMagicSoundEvents.HAOHANGE,
                            Component.translatable("jukebox_song." + SinoMagic.MOD_ID + "haohange"),
                            170,
                            15
                    ));
    public static final DeferredHolder<JukeboxSong, JukeboxSong> HAOYUNLAI_SONG =
            JUKEBOX_SONGS.register("haoyunlai_song",
                    () -> new JukeboxSong(
                            SinoMagicSoundEvents.HAOYUNLAI,
                            Component.translatable("jukebox_song." + SinoMagic.MOD_ID + "haoyunlai"),
                            183,
                            15
                    ));
    public static final DeferredHolder<JukeboxSong, JukeboxSong> JINSHEKUANGWU_SONG =
            JUKEBOX_SONGS.register("jinshekuangwu_song",
                    () -> new JukeboxSong(
                            SinoMagicSoundEvents.JINSHEKUANGWU,
                            Component.translatable("jukebox_song." + SinoMagic.MOD_ID + "jinshekuangwu"),
                            137,
                            15
                    ));
    public static final DeferredHolder<JukeboxSong, JukeboxSong> LANLINGWANG_SONG =
            JUKEBOX_SONGS.register("lanlingwang_song",
                    () -> new JukeboxSong(
                            SinoMagicSoundEvents.LANLINGWANG,
                            Component.translatable("jukebox_song." + SinoMagic.MOD_ID + "lanlingwang"),
                            67,
                            15
                    ));
    public static final DeferredHolder<JukeboxSong, JukeboxSong> MINGTIANHUIGENGHAO_SONG =
            JUKEBOX_SONGS.register("mingtianhuigenghao_song",
                    () -> new JukeboxSong(
                            SinoMagicSoundEvents.MINGTIANHUIGENGHAO,
                            Component.translatable("jukebox_song." + SinoMagic.MOD_ID + "mingtianhuigenghao"),
                            282,
                            15
                    ));
    public static final DeferredHolder<JukeboxSong, JukeboxSong> OURWORKERHAVEPOWER_SONG =
            JUKEBOX_SONGS.register("ourworkerhavepower_song",
                    () -> new JukeboxSong(
                            SinoMagicSoundEvents.OURWORKERHAVEPOWER,
                            Component.translatable("jukebox_song." + SinoMagic.MOD_ID + "ourworkerhavepower"),
                            111,
                            15
                    ));
    public static final DeferredHolder<JukeboxSong, JukeboxSong> SAIMA_SONG =
            JUKEBOX_SONGS.register("saima_song",
                    () -> new JukeboxSong(
                            SinoMagicSoundEvents.SAIMA,
                            Component.translatable("jukebox_song." + SinoMagic.MOD_ID + "saima"),
                            103,
                            15
                    ));
    public static final DeferredHolder<JukeboxSong, JukeboxSong> SHEHUIZHUYIHAO_SONG =
            JUKEBOX_SONGS.register("shehuizhuyihao_song",
                    () -> new JukeboxSong(
                            SinoMagicSoundEvents.SHEHUIZHUYIHAO,
                            Component.translatable("jukebox_song." + SinoMagic.MOD_ID + "shehuizhuyihao"),
                            80,
                            15
                    ));
    public static final DeferredHolder<JukeboxSong, JukeboxSong> TONGTIANDADAO_SONG =
            JUKEBOX_SONGS.register("tongtiandadao_song",
                    () -> new JukeboxSong(
                            SinoMagicSoundEvents.TONGTIANDADAO,
                            Component.translatable("jukebox_song." + SinoMagic.MOD_ID + "tongtiandadao"),
                            119,
                            15
                    ));
    public static final DeferredHolder<JukeboxSong, JukeboxSong> YOUJIDUI_SONG =
            JUKEBOX_SONGS.register("youjidui_song",
                    () -> new JukeboxSong(
                            SinoMagicSoundEvents.YOUJIDUI,
                            Component.translatable("jukebox_song." + SinoMagic.MOD_ID + "youjidui"),
                            169,
                            15
                    ));
    public static final DeferredHolder<JukeboxSong, JukeboxSong> YUANFANGKEREN_SONG =
            JUKEBOX_SONGS.register("yuanfangkeren_song",
                    () -> new JukeboxSong(
                            SinoMagicSoundEvents.YUANFANGKEREN,
                            Component.translatable("jukebox_song." + SinoMagic.MOD_ID + "yuanfangkeren"),
                            170,
                            15
                    ));
    public static final DeferredHolder<JukeboxSong, JukeboxSong> ZIJINGHUA_SONG =
            JUKEBOX_SONGS.register("zijinghua_song",
                    () -> new JukeboxSong(
                            SinoMagicSoundEvents.ZIJINGHUA,
                            Component.translatable("jukebox_song." + SinoMagic.MOD_ID + "zijinghua"),
                            178,
                            15
                    ));
}
