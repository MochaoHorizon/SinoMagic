package com.mochaohorizon.sinomagic.common.block;

import com.mochaohorizon.sinomagic.common.block.entity.MillstoneBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class Millstone extends Block implements EntityBlock {
    public Millstone(BlockBehaviour.Properties properties) {
        super(properties);
    }

    //Block entity
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state){
        return new MillstoneBlockEntity(pos, state);
    }

    //Click event
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (level.isClientSide) {
            return InteractionResult.SUCCESS;
        }
        if (level.getBlockEntity(pos) instanceof MillstoneBlockEntity be) {
            be.addClick(player);
            player.sendSystemMessage(Component.literal("clickcount" + be.getClickcount()));
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.SUCCESS;
    }
}
