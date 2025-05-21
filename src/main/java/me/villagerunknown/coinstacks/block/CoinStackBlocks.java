package me.villagerunknown.coinstacks.block;

import me.villagerunknown.coinstacks.feature.CoinStackBlocksRegistrationFeature;
import me.villagerunknown.villagercoin.type.CoinType;
import net.minecraft.block.Block;

public class CoinStackBlocks {
	
	public static final Block SMALL_COPPER_COIN_STACK;
	public static final Block SMALL_IRON_COIN_STACK;
	public static final Block SMALL_GOLD_COIN_STACK;
	public static final Block SMALL_EMERALD_COIN_STACK;
	public static final Block SMALL_NETHERITE_COIN_STACK;
	
	public static final Block MEDIUM_COPPER_COIN_STACK;
	public static final Block MEDIUM_IRON_COIN_STACK;
	public static final Block MEDIUM_GOLD_COIN_STACK;
	public static final Block MEDIUM_EMERALD_COIN_STACK;
	public static final Block MEDIUM_NETHERITE_COIN_STACK;
	
	public static final Block LARGE_COPPER_COIN_STACK;
	public static final Block LARGE_IRON_COIN_STACK;
	public static final Block LARGE_GOLD_COIN_STACK;
	public static final Block LARGE_EMERALD_COIN_STACK;
	public static final Block LARGE_NETHERITE_COIN_STACK;
	
	public static final Block COPPER_COIN_STACK_SLAB;
	public static final Block IRON_COIN_STACK_SLAB;
	public static final Block GOLD_COIN_STACK_SLAB;
	public static final Block EMERALD_COIN_STACK_SLAB;
	public static final Block NETHERITE_COIN_STACK_SLAB;
	
	public static final Block COPPER_COIN_STACK_BLOCK;
	public static final Block IRON_COIN_STACK_BLOCK;
	public static final Block GOLD_COIN_STACK_BLOCK;
	public static final Block EMERALD_COIN_STACK_BLOCK;
	public static final Block NETHERITE_COIN_STACK_BLOCK;
	
	public CoinStackBlocks(){}
	
	static{
		SMALL_COPPER_COIN_STACK = CoinStackBlocksRegistrationFeature.registerSmallCoinStackBlock( CoinType.COPPER, "small_copper_coin_stack", me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.COPPER_VALUE );
		SMALL_IRON_COIN_STACK = CoinStackBlocksRegistrationFeature.registerSmallCoinStackBlock( CoinType.IRON, "small_iron_coin_stack", me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.IRON_VALUE );
		SMALL_GOLD_COIN_STACK = CoinStackBlocksRegistrationFeature.registerSmallCoinStackBlock( CoinType.GOLD, "small_gold_coin_stack", me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.GOLD_VALUE );
		SMALL_EMERALD_COIN_STACK = CoinStackBlocksRegistrationFeature.registerSmallCoinStackBlock( CoinType.EMERALD, "small_emerald_coin_stack", me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.EMERALD_VALUE );
		SMALL_NETHERITE_COIN_STACK = CoinStackBlocksRegistrationFeature.registerSmallFireproofCoinStackBlock( CoinType.NETHERITE, "small_netherite_coin_stack", me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.NETHERITE_VALUE );
		
		MEDIUM_COPPER_COIN_STACK = CoinStackBlocksRegistrationFeature.registerMediumCoinStackBlock( CoinType.COPPER, "medium_copper_coin_stack", me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.COPPER_VALUE * me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.MEDIUM_VALUE_MULTIPLIER );
		MEDIUM_IRON_COIN_STACK = CoinStackBlocksRegistrationFeature.registerMediumCoinStackBlock( CoinType.IRON, "medium_iron_coin_stack", me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.IRON_VALUE * me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.MEDIUM_VALUE_MULTIPLIER );
		MEDIUM_GOLD_COIN_STACK = CoinStackBlocksRegistrationFeature.registerMediumCoinStackBlock( CoinType.GOLD, "medium_gold_coin_stack", me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.GOLD_VALUE * me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.MEDIUM_VALUE_MULTIPLIER );
		MEDIUM_EMERALD_COIN_STACK = CoinStackBlocksRegistrationFeature.registerMediumCoinStackBlock( CoinType.EMERALD, "medium_emerald_coin_stack", me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.EMERALD_VALUE * me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.MEDIUM_VALUE_MULTIPLIER );
		MEDIUM_NETHERITE_COIN_STACK = CoinStackBlocksRegistrationFeature.registerMediumFireproofCoinStackBlock( CoinType.NETHERITE, "medium_netherite_coin_stack", me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.NETHERITE_VALUE * me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.MEDIUM_VALUE_MULTIPLIER );
		
		LARGE_COPPER_COIN_STACK = CoinStackBlocksRegistrationFeature.registerLargeCoinStackBlock( CoinType.COPPER, "large_copper_coin_stack", me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.COPPER_VALUE * me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.LARGE_VALUE_MULTIPLIER );
		LARGE_IRON_COIN_STACK = CoinStackBlocksRegistrationFeature.registerLargeCoinStackBlock( CoinType.IRON, "large_iron_coin_stack", me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.IRON_VALUE * me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.LARGE_VALUE_MULTIPLIER );
		LARGE_GOLD_COIN_STACK = CoinStackBlocksRegistrationFeature.registerLargeCoinStackBlock( CoinType.GOLD, "large_gold_coin_stack", me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.GOLD_VALUE * me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.LARGE_VALUE_MULTIPLIER );
		LARGE_EMERALD_COIN_STACK = CoinStackBlocksRegistrationFeature.registerLargeCoinStackBlock( CoinType.EMERALD, "large_emerald_coin_stack", me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.EMERALD_VALUE * me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.LARGE_VALUE_MULTIPLIER );
		LARGE_NETHERITE_COIN_STACK = CoinStackBlocksRegistrationFeature.registerLargeFireproofCoinStackBlock( CoinType.NETHERITE, "large_netherite_coin_stack", me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.NETHERITE_VALUE * me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.LARGE_VALUE_MULTIPLIER );
		
		COPPER_COIN_STACK_SLAB = CoinStackBlocksRegistrationFeature.registerCoinStackSlabBlock( CoinType.COPPER, "copper_coin_stack_slab", me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.COPPER_VALUE * me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.SLAB_VALUE_MULTIPLIER );
		IRON_COIN_STACK_SLAB = CoinStackBlocksRegistrationFeature.registerCoinStackSlabBlock( CoinType.IRON, "iron_coin_stack_slab", me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.IRON_VALUE * me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.SLAB_VALUE_MULTIPLIER );
		GOLD_COIN_STACK_SLAB = CoinStackBlocksRegistrationFeature.registerCoinStackSlabBlock( CoinType.GOLD, "gold_coin_stack_slab", me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.GOLD_VALUE * me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.SLAB_VALUE_MULTIPLIER );
		EMERALD_COIN_STACK_SLAB = CoinStackBlocksRegistrationFeature.registerCoinStackSlabBlock( CoinType.EMERALD, "emerald_coin_stack_slab", me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.EMERALD_VALUE * me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.SLAB_VALUE_MULTIPLIER );
		NETHERITE_COIN_STACK_SLAB = CoinStackBlocksRegistrationFeature.registerFireproofCoinStackSlabBlock( CoinType.NETHERITE, "netherite_coin_stack_slab", me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.NETHERITE_VALUE * me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.SLAB_VALUE_MULTIPLIER );
		
		COPPER_COIN_STACK_BLOCK = CoinStackBlocksRegistrationFeature.registerCoinStackBlock( CoinType.COPPER, "copper_coin_stack_block", me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.COPPER_VALUE * me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.BLOCK_VALUE_MULTIPLIER );
		IRON_COIN_STACK_BLOCK = CoinStackBlocksRegistrationFeature.registerCoinStackBlock( CoinType.IRON, "iron_coin_stack_block", me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.IRON_VALUE * me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.BLOCK_VALUE_MULTIPLIER );
		GOLD_COIN_STACK_BLOCK = CoinStackBlocksRegistrationFeature.registerCoinStackBlock( CoinType.GOLD, "gold_coin_stack_block", me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.GOLD_VALUE * me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.BLOCK_VALUE_MULTIPLIER );
		EMERALD_COIN_STACK_BLOCK = CoinStackBlocksRegistrationFeature.registerCoinStackBlock( CoinType.EMERALD, "emerald_coin_stack_block", me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.EMERALD_VALUE * me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.BLOCK_VALUE_MULTIPLIER );
		NETHERITE_COIN_STACK_BLOCK = CoinStackBlocksRegistrationFeature.registerFireproofCoinStackBlock( CoinType.NETHERITE, "netherite_coin_stack_block", me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.NETHERITE_VALUE * me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature.BLOCK_VALUE_MULTIPLIER );
	}

}
