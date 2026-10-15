package com.mochaohorizon.sinomagic;

import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

// Client-only: never loaded on a dedicated server.
@Mod(value = SinoMagic.MOD_ID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = SinoMagic.MOD_ID, value = Dist.CLIENT)
public class SinoMagicClient {
    public SinoMagicClient(ModContainer container) {
        // Lets NeoForge build a config screen for Config.java.
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        SinoMagic.LOGGER.info("HELLO FROM CLIENT SETUP");
        SinoMagic.LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
    }
}
