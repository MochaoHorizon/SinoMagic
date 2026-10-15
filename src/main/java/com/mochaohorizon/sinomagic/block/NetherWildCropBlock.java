package com.mochaohorizon.sinomagic.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import vectorwing.farmersdelight.common.block.WildCropBlock;

/**
 * 地狱野生植株：沿用 WildCropBlock 全部行为，仅把土壤判定放宽到地狱地表，供野生辣椒生成。
 */
public class NetherWildCropBlock extends WildCropBlock {
    public NetherWildCropBlock(Holder<MobEffect> suspiciousStewEffect, int effectDuration, BlockBehaviour.Properties properties) {
        super(suspiciousStewEffect, effectDuration, properties);
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
        return super.mayPlaceOn(state, level, pos)
                // 地狱岩 / 玄武岩 / 黑石
                || state.is(BlockTags.BASE_STONE_NETHER)
                || state.is(Blocks.SOUL_SAND)
                || state.is(Blocks.SOUL_SOIL)
                || state.is(Blocks.CRIMSON_NYLIUM)
                || state.is(Blocks.WARPED_NYLIUM)
                || state.is(Blocks.GRAVEL);
    }
}
