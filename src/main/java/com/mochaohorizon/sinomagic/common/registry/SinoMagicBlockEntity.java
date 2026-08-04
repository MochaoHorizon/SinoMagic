package com.mochaohorizon.sinomagic.common.registry;

import com.mochaohorizon.sinomagic.SinoMagic;
import com.mochaohorizon.sinomagic.common.block.entity.MillstoneBlockEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class SinoMagicBlockEntity{
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, SinoMagic.MOD_ID);

    public static final Supplier<BlockEntityType<MillstoneBlockEntity>> Millstone_Block_Entity = BLOCK_ENTITY_TYPES.register(
            "millstone_block_entity",
            () -> BlockEntityType.Builder.of(
                            MillstoneBlockEntity::new,
                            SinoMagicBlocks.MILLSTONE.get())
                    .build(null)
    );
}
