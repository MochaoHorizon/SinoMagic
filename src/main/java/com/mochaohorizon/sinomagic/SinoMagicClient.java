package com.mochaohorizon.sinomagic;

import com.mochaohorizon.sinomagic.registry.ModFluidTypes;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
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

    //流体本身只在服务端注册，贴图怎么画是纯客户端的事，所以扩展在这里登记。
    //5 种流体的贴图都取自 assets/sinomagic/textures/fluid/，不染色（tint 用默认的白色），颜色由贴图自己决定。
    @SubscribeEvent
    static void onRegisterClientExtensions(RegisterClientExtensionsEvent event) {
        event.registerFluidType(fluidTextures("soybean_oil"), ModFluidTypes.SOYBEAN_OIL);
        event.registerFluidType(fluidTextures("soy_sauce"), ModFluidTypes.SOY_SAUCE);
        event.registerFluidType(fluidTextures("soy_milk"), ModFluidTypes.SOY_MILK);
        event.registerFluidType(fluidTextures("marinade"), ModFluidTypes.MARINADE);
        event.registerFluidType(fluidTextures("shit"), ModFluidTypes.SHIT);
    }

    private static IClientFluidTypeExtensions fluidTextures(String name) {
        ResourceLocation still = ResourceLocation.fromNamespaceAndPath(SinoMagic.MOD_ID, "fluid/" + name);
        ResourceLocation flowing = ResourceLocation.fromNamespaceAndPath(SinoMagic.MOD_ID, "fluid/" + name + "_flow");
        return new IClientFluidTypeExtensions() {
            @Override
            public ResourceLocation getStillTexture() {
                return still;
            }

            @Override
            public ResourceLocation getFlowingTexture() {
                return flowing;
            }
        };
    }
}
