package com.mochaohorizon.sinomagic.common.registry;

import com.mochaohorizon.sinomagic.SinoMagic;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredRegister;

public class SinoMagicBlockEntity{
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, SinoMagic.MOD_ID);

    public static final Supplier<BlockEntityType<MillstoneBlockEntity>> MILLSTONE = BLOCK_ENTITY_TYPES.register(
            "millstone",
            () -> BlockEntityType.Builder.of(
                            MillstoneBlockEntity::new,
                            SinoMagicBlocks.MILLSTONE.get())
                    .build(null)
    );
}
