package com.mochaohorizon.sinomagic.common.block;

import com.mochaohorizon.sinomagic.common.block.entity.MillstoneBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class Millstone extends Block implements EntityBlock {
    public Millstone(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state){
        return new MillstoneBlockEntity(pos, state);
    }
}
