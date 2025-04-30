package me.villagerunknown.coinstacks.block;

import me.villagerunknown.coinstacks.feature.CoinStackBlocksFeatureLoader;
import me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature;
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
		SMALL_COPPER_COIN_STACK = CoinStackBlocksFeatureLoader.registerSmallCoinStackBlock( CoinType.COPPER, "small_copper_coin_stack", CoinStackBlocksFeature.COPPER_VALUE );
		SMALL_IRON_COIN_STACK = CoinStackBlocksFeatureLoader.registerSmallCoinStackBlock( CoinType.IRON, "small_iron_coin_stack", CoinStackBlocksFeature.IRON_VALUE );
		SMALL_GOLD_COIN_STACK = CoinStackBlocksFeatureLoader.registerSmallCoinStackBlock( CoinType.GOLD, "small_gold_coin_stack", CoinStackBlocksFeature.GOLD_VALUE );
		SMALL_EMERALD_COIN_STACK = CoinStackBlocksFeatureLoader.registerSmallCoinStackBlock( CoinType.EMERALD, "small_emerald_coin_stack", CoinStackBlocksFeature.EMERALD_VALUE );
		SMALL_NETHERITE_COIN_STACK = CoinStackBlocksFeatureLoader.registerSmallCoinStackBlock( CoinType.NETHERITE, "small_netherite_coin_stack", CoinStackBlocksFeature.NETHERITE_VALUE );
		
		MEDIUM_COPPER_COIN_STACK = CoinStackBlocksFeatureLoader.registerMediumCoinStackBlock( CoinType.COPPER, "medium_copper_coin_stack", CoinStackBlocksFeature.COPPER_VALUE * CoinStackBlocksFeature.MEDIUM_VALUE_MULTIPLIER );
		MEDIUM_IRON_COIN_STACK = CoinStackBlocksFeatureLoader.registerMediumCoinStackBlock( CoinType.IRON, "medium_iron_coin_stack", CoinStackBlocksFeature.IRON_VALUE * CoinStackBlocksFeature.MEDIUM_VALUE_MULTIPLIER );
		MEDIUM_GOLD_COIN_STACK = CoinStackBlocksFeatureLoader.registerMediumCoinStackBlock( CoinType.GOLD, "medium_gold_coin_stack", CoinStackBlocksFeature.GOLD_VALUE * CoinStackBlocksFeature.MEDIUM_VALUE_MULTIPLIER );
		MEDIUM_EMERALD_COIN_STACK = CoinStackBlocksFeatureLoader.registerMediumCoinStackBlock( CoinType.EMERALD, "medium_emerald_coin_stack", CoinStackBlocksFeature.EMERALD_VALUE * CoinStackBlocksFeature.MEDIUM_VALUE_MULTIPLIER );
		MEDIUM_NETHERITE_COIN_STACK = CoinStackBlocksFeatureLoader.registerMediumCoinStackBlock( CoinType.NETHERITE, "medium_netherite_coin_stack", CoinStackBlocksFeature.NETHERITE_VALUE * CoinStackBlocksFeature.MEDIUM_VALUE_MULTIPLIER );
		
		LARGE_COPPER_COIN_STACK = CoinStackBlocksFeatureLoader.registerLargeCoinStackBlock( CoinType.COPPER, "large_copper_coin_stack", CoinStackBlocksFeature.COPPER_VALUE * CoinStackBlocksFeature.LARGE_VALUE_MULTIPLIER );
		LARGE_IRON_COIN_STACK = CoinStackBlocksFeatureLoader.registerLargeCoinStackBlock( CoinType.IRON, "large_iron_coin_stack", CoinStackBlocksFeature.IRON_VALUE * CoinStackBlocksFeature.LARGE_VALUE_MULTIPLIER );
		LARGE_GOLD_COIN_STACK = CoinStackBlocksFeatureLoader.registerLargeCoinStackBlock( CoinType.GOLD, "large_gold_coin_stack", CoinStackBlocksFeature.GOLD_VALUE * CoinStackBlocksFeature.LARGE_VALUE_MULTIPLIER );
		LARGE_EMERALD_COIN_STACK = CoinStackBlocksFeatureLoader.registerLargeCoinStackBlock( CoinType.EMERALD, "large_emerald_coin_stack", CoinStackBlocksFeature.EMERALD_VALUE * CoinStackBlocksFeature.LARGE_VALUE_MULTIPLIER );
		LARGE_NETHERITE_COIN_STACK = CoinStackBlocksFeatureLoader.registerLargeCoinStackBlock( CoinType.NETHERITE, "large_netherite_coin_stack", CoinStackBlocksFeature.NETHERITE_VALUE * CoinStackBlocksFeature.LARGE_VALUE_MULTIPLIER );
		
		COPPER_COIN_STACK_SLAB = CoinStackBlocksFeatureLoader.registerCoinStackSlabBlock( CoinType.COPPER, "copper_coin_stack_slab", CoinStackBlocksFeature.COPPER_VALUE * CoinStackBlocksFeature.SLAB_VALUE_MULTIPLIER );
		IRON_COIN_STACK_SLAB = CoinStackBlocksFeatureLoader.registerCoinStackSlabBlock( CoinType.IRON, "iron_coin_stack_slab", CoinStackBlocksFeature.IRON_VALUE * CoinStackBlocksFeature.SLAB_VALUE_MULTIPLIER );
		GOLD_COIN_STACK_SLAB = CoinStackBlocksFeatureLoader.registerCoinStackSlabBlock( CoinType.GOLD, "gold_coin_stack_slab", CoinStackBlocksFeature.GOLD_VALUE * CoinStackBlocksFeature.SLAB_VALUE_MULTIPLIER );
		EMERALD_COIN_STACK_SLAB = CoinStackBlocksFeatureLoader.registerCoinStackSlabBlock( CoinType.EMERALD, "emerald_coin_stack_slab", CoinStackBlocksFeature.EMERALD_VALUE * CoinStackBlocksFeature.SLAB_VALUE_MULTIPLIER );
		NETHERITE_COIN_STACK_SLAB = CoinStackBlocksFeatureLoader.registerCoinStackSlabBlock( CoinType.NETHERITE, "netherite_coin_stack_slab", CoinStackBlocksFeature.NETHERITE_VALUE * CoinStackBlocksFeature.SLAB_VALUE_MULTIPLIER );
		
		COPPER_COIN_STACK_BLOCK = CoinStackBlocksFeatureLoader.registerCoinStackBlock( CoinType.COPPER, "copper_coin_stack_block", CoinStackBlocksFeature.COPPER_VALUE * CoinStackBlocksFeature.BLOCK_VALUE_MULTIPLIER );
		IRON_COIN_STACK_BLOCK = CoinStackBlocksFeatureLoader.registerCoinStackBlock( CoinType.IRON, "iron_coin_stack_block", CoinStackBlocksFeature.IRON_VALUE * CoinStackBlocksFeature.BLOCK_VALUE_MULTIPLIER );
		GOLD_COIN_STACK_BLOCK = CoinStackBlocksFeatureLoader.registerCoinStackBlock( CoinType.GOLD, "gold_coin_stack_block", CoinStackBlocksFeature.GOLD_VALUE * CoinStackBlocksFeature.BLOCK_VALUE_MULTIPLIER );
		EMERALD_COIN_STACK_BLOCK = CoinStackBlocksFeatureLoader.registerCoinStackBlock( CoinType.EMERALD, "emerald_coin_stack_block", CoinStackBlocksFeature.EMERALD_VALUE * CoinStackBlocksFeature.BLOCK_VALUE_MULTIPLIER );
		NETHERITE_COIN_STACK_BLOCK = CoinStackBlocksFeatureLoader.registerCoinStackBlock( CoinType.NETHERITE, "netherite_coin_stack_block", CoinStackBlocksFeature.NETHERITE_VALUE * CoinStackBlocksFeature.BLOCK_VALUE_MULTIPLIER );
	}

}
