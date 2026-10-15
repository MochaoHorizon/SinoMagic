package com.mochaohorizon.sinomagic.common.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import com.mochaohorizon.sinomagic.SinoMagic;

public class ModSoundEvents {
	public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
			DeferredRegister.create(Registries.SOUND_EVENT, SinoMagic.MOD_ID);

	public static final DeferredHolder<SoundEvent, SoundEvent> BAINIAOCHAOFENG = SOUND_EVENTS.register(
			"music.bainiaochaofeng",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("sinomagic", "music.bainiaochaofeng"))
	);
	public static final DeferredHolder<SoundEvent, SoundEvent> BAOWEIHUANGHE = SOUND_EVENTS.register(
			"music.baoweihuanghe",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("sinomagic", "music.baoweihuanghe"))
	);
	public static final DeferredHolder<SoundEvent, SoundEvent> BEIJINGJINSHANSHANG = SOUND_EVENTS.register(
			"music.beijingjinshanshang",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("sinomagic", "music.beijingjinshanshang"))
	);
	public static final DeferredHolder<SoundEvent, SoundEvent> BUBUGAO = SOUND_EVENTS.register(
			"music.bubugao",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("sinomagic", "music.bubugao"))
	);
	public static final DeferredHolder<SoundEvent, SoundEvent> CHINFENGWUYI= SOUND_EVENTS.register(
			"music.chinfengwuyi",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("sinomagic", "music.chinfengwuyi"))
	);
	public static final DeferredHolder<SoundEvent, SoundEvent> DADAO = SOUND_EVENTS.register(
			"music.dadao",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("sinomagic", "music.dadao"))
	);
	public static final DeferredHolder<SoundEvent, SoundEvent> DADONGBEI = SOUND_EVENTS.register(
			"music.dadongbei",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("sinomagic", "music.dadongbei"))
	);
	public static final DeferredHolder<SoundEvent, SoundEvent> DAHAIHANGXING = SOUND_EVENTS.register(
			"music.dahaihangxing",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("sinomagic", "music.dahaihangxing"))
	);
	public static final DeferredHolder<SoundEvent, SoundEvent> HAOHANGE = SOUND_EVENTS.register(
			"music.haohange",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("sinomagic", "music.haohange"))
	);
	public static final DeferredHolder<SoundEvent, SoundEvent> HAOYUNLAI= SOUND_EVENTS.register(
			"music.haoyunlai",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("sinomagic", "music.haoyunlai"))
	);
	public static final DeferredHolder<SoundEvent, SoundEvent> JINSHEKUANGWU = SOUND_EVENTS.register(
			"music.jinshekuangwu",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("sinomagic", "music.jinshekuangwu"))
	);
	public static final DeferredHolder<SoundEvent, SoundEvent> LANLINGWANG = SOUND_EVENTS.register(
			"music.lanlingwang",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("sinomagic", "music.lanlingwang"))
	);
	public static final DeferredHolder<SoundEvent, SoundEvent> MINGTIANHUIGENGHAO = SOUND_EVENTS.register(
			"music.mingtianhuigenghao",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("sinomagic", "music.mingtianhuigenghao"))
	);
	public static final DeferredHolder<SoundEvent, SoundEvent> OURWORKERHAVEPOWER = SOUND_EVENTS.register(
			"music.ourworkerhavepower",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("sinomagic", "music.ourworkerhavepower"))
	);
	public static final DeferredHolder<SoundEvent, SoundEvent> SAIMA = SOUND_EVENTS.register(
			"music.saima",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("sinomagic", "music.saima"))
	);
	public static final DeferredHolder<SoundEvent, SoundEvent> SHEHUIZHUYIHAO = SOUND_EVENTS.register(
			"music.shehuizhuyihao",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("sinomagic", "music.shehuizhuyihao"))
	);
	public static final DeferredHolder<SoundEvent, SoundEvent> TONGTIANDADAO = SOUND_EVENTS.register(
			"music.tongtiandadao",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("sinomagic", "music.tongtiandadao"))
	);
	public static final DeferredHolder<SoundEvent, SoundEvent> YOUJIDUI = SOUND_EVENTS.register(
			"music.youjidui",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("sinomagic", "music.youjidui"))
	);
	public static final DeferredHolder<SoundEvent, SoundEvent> YUANFANGKEREN = SOUND_EVENTS.register(
			"music.yuanfangkeren",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("sinomagic", "music.yuanfangkeren"))
	);
	public static final DeferredHolder<SoundEvent, SoundEvent> ZIJINGHUA = SOUND_EVENTS.register(
			"music.zijinghua",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("sinomagic", "music.zijinghua"))
	);

	public static void register(IEventBus modBus){
		ModSoundEvents.SOUND_EVENTS.register(modBus);
	}
}