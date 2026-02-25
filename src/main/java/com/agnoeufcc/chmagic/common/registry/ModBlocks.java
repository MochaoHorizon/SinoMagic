package com.agnoeufcc.chmagic.block;

import

public class ModBlocks
{
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, chmagic.MODID);

	private static ToIntFunction<BlockState> litBlockEmission(int lightValue) {
		return (state) -> state.getValue(BlockStateProperties.LIT) ? lightValue : 0;
	}

	//simple block
    public static final DeferredBlock<Block> TOFU_BLOCK = BLOCKS.register(
        "tofu_block", 
        registryName -> new Tofu_Block(BlockBehaviour.Properties.of()
            .destroyTime(0.2f)
            .explosionResistance(0.5f)
            .sound(Block.TOFU)
            .friction(0.8)
    ));
    public static final DeferredBlock<Block> SALT_ORE = BLOCKS.register(
        "salt_ore", 
        registryName -> new Salt_Ore(BlockBehaviour.Properties.of()
            .destroyTime(1.5f)
            .explosionResistance(1.0f)
            .sound(Sound.STONE)
    ));
    public static final DeferredBlock<Block> SALT_BLOCK = BLOCKS.register(
        "salt_block", 
        registryName -> new Salt_Block(BlockBehaviour.Properties.of()
            .destroyTime(1.5f)
            .explosionResistance(0.8f)
            .sound(Sound.STONE)
    ));
    
    //plants
    public static final Supplier<Block> PLANTED_DADOU = BLOCKS.register(
         "planted_dadou",
			registryName -> new Planted_Dadou(BlockBehaviour.Properties.of()
			.sound(Blocks.WHEAT)
	));
	public static final Supplier<Block> WILD_DADOU = BLOCKS.register(
         "wild_dadou",
			registryName -> new Wild_Dadou(BlockBehaviour.Properties.of()
			.sound(Blocks.WHEAT)
	));
	
	//workblock
	public static final Supplier<Block> DAGANG = BLOCKS.register(
         "dagang",
			registryName -> new dagang(BlockBehaviour.Properties.of()
			.sound(Blocks.STONE)
			.
	));