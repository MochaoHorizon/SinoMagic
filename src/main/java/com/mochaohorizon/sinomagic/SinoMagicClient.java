package com.mochaohorizon.sinomagic;

import com.mochaohorizon.sinomagic.registry.ModFluidTypes;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.NbtOps;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.decoration.Painting;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.CustomData;
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
import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;

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

    //绘画物品的 tooltip 由 HangingEntityItem 硬编码成「标题 / 作者 / 尺寸」三行，作者行没有开关。
    //本模组的画作都是公共创作、没有实际署名的作者，所以这里把作者行摘掉；原版画作不受影响。
    @SubscribeEvent
    static void onItemTooltip(ItemTooltipEvent event) {
        ItemStack stack = event.getItemStack();
        HolderLookup.Provider registries = event.getContext().registries();
        if (registries == null || !stack.is(Items.PAINTING)) {
            return;
        }

        CustomData data = stack.getOrDefault(DataComponents.ENTITY_DATA, CustomData.EMPTY);
        if (data.isEmpty()) {
            return;
        }

        //只有本模组命名空间的画作才处理：原版那 50 幅的署名是真实作者，要保留。
        boolean own = data.read(registries.createSerializationContext(NbtOps.INSTANCE), Painting.VARIANT_MAP_CODEC)
                .result()
                .flatMap(holder -> holder.unwrapKey())
                .map(key -> key.location().getNamespace().equals(SinoMagic.MOD_ID))
                .orElse(false);
        if (!own) {
            return;
        }

        //此时顺序固定为 [物品名, 标题, 作者, 尺寸]，摘掉作者行。
        List<Component> lines = event.getToolTip();
        if (lines.size() >= 4) {
            lines.remove(2);
        }
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
