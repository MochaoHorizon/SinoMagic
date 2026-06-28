package com.mochaohorizon.sinomagic.common.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredRegister;
import com.mochaohorizon.sinomagic.SinoMagic;

public class SinoMagicSounds {
	public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(Registries.SOUND_EVENT, SinoMagic.MOD_ID);

	//add in v0.1.0
	/*
	public static final Supplier<SoundEvent> BLOCK_TOFU = SOUNDS.register("block.tofu",
			registryName -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(SinoMagic.MOD_ID, "block.tofu")
			);)

	 */
}