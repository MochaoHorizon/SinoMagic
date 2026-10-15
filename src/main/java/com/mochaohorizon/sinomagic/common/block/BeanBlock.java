package com.mochaohorizon.sinomagic.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.function.Supplier;

/**
 * 通用豆科植株：黑豆、赤豆、绿豆共用。生长行为全部继承 CropBlock，只覆写形状与种子。
 */
public class BeanBlock extends CropBlock {
    //形状高度与 blockstate 的 stage 映射一致：stage0=6px, stage1=8px, stage2=12px, stage3=14px
    private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]{
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D),   //age 0 → stage0
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D),   //age 1 → stage0
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D),   //age 2 → stage1
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D),   //age 3 → stage1
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D),  //age 4 → stage2
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D),  //age 5 → stage2
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D),  //age 6 → stage2
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D)   //age 7 → stage3 成熟
    };

    //种子以 Supplier 延迟求值，避开与 ModItems 的初始化顺序问题
    private final Supplier<? extends ItemLike> seed;

    public BeanBlock(Supplier<? extends ItemLike> seed, BlockBehaviour.Properties properties) {
        super(properties);
        this.seed = seed;
    }

    //种植用种子本身，掉落由战利品表管理
    @Override
    protected ItemLike getBaseSeedId() {
        return this.seed.get();
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE_BY_AGE[state.getValue(this.getAgeProperty())];
    }
}
