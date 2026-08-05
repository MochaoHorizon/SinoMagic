package com.mochaohorizon.sinomagic.client.renderer;

import com.mochaohorizon.sinomagic.common.block.entity.MillstoneBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class MillstoneRenderer extends GeoBlockRenderer<MillstoneBlockEntity> {
    public MillstoneRenderer(BlockEntityRendererProvider.Context context) {
        super(new MillstoneBlockEntityModel());
    }
}
