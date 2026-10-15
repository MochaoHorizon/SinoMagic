package com.mochaohorizon.sinomagic;

import com.mochaohorizon.sinomagic.registry.ModBlockEntities;
import com.mochaohorizon.sinomagic.registry.ModBlocks;
import com.mochaohorizon.sinomagic.registry.ModCreativeTabs;
import com.mochaohorizon.sinomagic.registry.ModFluidTypes;
import com.mochaohorizon.sinomagic.registry.ModFluids;
import com.mochaohorizon.sinomagic.registry.ModItems;
import com.mochaohorizon.sinomagic.registry.ModRecipeTypes;
import com.mochaohorizon.sinomagic.registry.ModSerializers;
import com.mochaohorizon.sinomagic.registry.ModSoundEvents;
import com.mojang.logging.LogUtils;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

@Mod(SinoMagic.MOD_ID)
public class SinoMagic {
    // Must match mod_id in gradle.properties and META-INF/neoforge.mods.toml.
    public static final String MOD_ID = "sinomagic";
    public static final Logger LOGGER = LogUtils.getLogger();

    public SinoMagic(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModFluidTypes.register(modEventBus);
        ModFluids.register(modEventBus);
        ModCreativeTabs.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModRecipeTypes.register(modEventBus);
        ModSerializers.register(modEventBus);
        ModSoundEvents.register(modEventBus);

        // Needed because this class has @SubscribeEvent methods (see onServerStarting).
        NeoForge.EVENT_BUS.register(this);

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM COMMON SETUP");

        if (Config.LOG_DIRT_BLOCK.getAsBoolean()) {
            LOGGER.info("DIRT BLOCK >> {}", BuiltInRegistries.BLOCK.getKey(Blocks.DIRT));
        }

        LOGGER.info("{}{}", Config.MAGIC_NUMBER_INTRODUCTION.get(), Config.MAGIC_NUMBER.getAsInt());

        Config.ITEM_STRINGS.get().forEach((item) -> LOGGER.info("ITEM >> {}", item));
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("恭喜！没有崩溃！");
    }
}
