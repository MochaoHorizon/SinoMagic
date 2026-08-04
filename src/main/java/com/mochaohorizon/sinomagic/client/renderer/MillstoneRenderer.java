package com.mochaohorizon.sinomagic.client.renderer;

import com.mochaohorizon.sinomagic.common.block.entity.MillstoneBlockEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class MillstoneRenderer implements BlockEntityRenderer<MillstoneBlockEntity> {
    public MillstoneRenderer(BlockEntityRendererProvider.Context context) {}

    @Override
    public void render(MillstoneBlockEntity blockEntity, float partialTick, PoseStack stack, MultiBufferSource bufferSource, int packedLight, int packedOverlay) {

    }
}
