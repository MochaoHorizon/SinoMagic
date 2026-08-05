package com.mochaohorizon.sinomagic.common.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import software.bernie.geckolib.animatable.GeoBlockEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.*;
import software.bernie.geckolib.util.GeckoLibUtil;

import static com.mochaohorizon.sinomagic.common.registry.SinoMagicBlockEntity.Millstone_BlockEntity;

public class MillstoneBlockEntity extends BlockEntity implements GeoBlockEntity {
    protected static final RawAnimation DEPLOY_ANIM = RawAnimation.begin().thenPlay("misc.deploy").thenLoop("misc.idle");

    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    public MillstoneBlockEntity(BlockPos pos, BlockState state) {
        super(Millstone_BlockEntity.get(), pos, state);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, this::deployAnimController));
    }

    protected <E extends MillstoneBlockEntity> PlayState deployAnimController(final AnimationState<E> state) {
        return state.setAndContinue(DEPLOY_ANIM);
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }
}
