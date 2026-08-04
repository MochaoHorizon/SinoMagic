package com.mochaohorizon.sinomagic.common.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

import static com.mochaohorizon.sinomagic.common.registry.SinoMagicBlockEntity.Millstone_Block_Entity;

public class MillstoneBlockEntity extends BlockEntity {
    public MillstoneBlockEntity(BlockPos pos, BlockState state){
        super(Millstone_Block_Entity.get(), pos, state);
    }
}
