package com.mochaohorizon.sinomagic.registry;

import com.mochaohorizon.sinomagic.SinoMagic;
import com.mochaohorizon.sinomagic.block.entity.MillstoneBlockEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, SinoMagic.MOD_ID);

    public static final Supplier<BlockEntityType<MillstoneBlockEntity>> Millstone_BlockEntity = BLOCK_ENTITY_TYPES.register(
            "millstone_blockentity",
            () -> BlockEntityType.Builder.of(
                            MillstoneBlockEntity::new,
                            ModBlocks.MILLSTONE.get())
                    .build(null)
    );

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITY_TYPES.register(eventBus);
    }
}
