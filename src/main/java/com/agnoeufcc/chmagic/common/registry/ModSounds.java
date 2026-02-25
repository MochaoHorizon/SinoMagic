package com.agnoeufcc.chmagic.sound;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredRegister;
import com.agnoeufcc.chmagic.Chmagic;

import java.util.function.Supplier;

public class ModSounds
{
	public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(Registries.SOUND_EVENT, chmagic.MODID);

    public static final Supplier<SoundEvent> BLOCK_TOFU = SOUNDS.register("block.tofu",
			registryName -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(chmagic.MODID, "block.tofu"));