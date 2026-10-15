package com.mochaohorizon.sinomagic.common.block;

import com.mochaohorizon.sinomagic.common.registry.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ChiliBlock extends CropBlock {
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

    public ChiliBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    //种植用辣椒种子，掉落辣椒由战利品表管理
    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.CHILI_SEED.get();
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE_BY_AGE[state.getValue(this.getAgeProperty())];
    }
}
