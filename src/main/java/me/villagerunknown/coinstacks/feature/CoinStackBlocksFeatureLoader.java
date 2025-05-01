package me.villagerunknown.coinstacks.feature;

import me.villagerunknown.coinstacks.block.*;
import me.villagerunknown.coinstacks.block.entity.CoinStackBlockEntity;
import me.villagerunknown.platform.util.RegistryUtil;
import me.villagerunknown.villagercoin.Villagercoin;
import me.villagerunknown.villagercoin.block.entity.AbstractCurrencyValueBlockEntity;
import me.villagerunknown.villagercoin.component.CurrencyComponent;
import me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature;
import me.villagerunknown.villagercoin.type.CoinType;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

import static me.villagerunknown.villagercoin.Villagercoin.CURRENCY_COMPONENT;

public class CoinStackBlocksFeatureLoader {

	public static final BlockEntityType<CoinStackBlockEntity> COIN_STACK_BLOCK_ENTITY_TYPE = (BlockEntityType<CoinStackBlockEntity>) registerCoinStackBlockEntities();
	
	public static void execute(){
		new CoinStackBlocks();
	}
	
	private static BlockEntityType<? extends AbstractCurrencyValueBlockEntity> registerCoinStackBlockEntities() {
		BlockEntityType.Builder<CoinStackBlockEntity> builder = BlockEntityType.Builder.create(
				CoinStackBlockEntity::new,
				CoinStackBlocks.SMALL_COPPER_COIN_STACK,
				CoinStackBlocks.SMALL_IRON_COIN_STACK,
				CoinStackBlocks.SMALL_GOLD_COIN_STACK,
				CoinStackBlocks.SMALL_EMERALD_COIN_STACK,
				CoinStackBlocks.SMALL_NETHERITE_COIN_STACK,
				CoinStackBlocks.MEDIUM_COPPER_COIN_STACK,
				CoinStackBlocks.MEDIUM_IRON_COIN_STACK,
				CoinStackBlocks.MEDIUM_GOLD_COIN_STACK,
				CoinStackBlocks.MEDIUM_EMERALD_COIN_STACK,
				CoinStackBlocks.MEDIUM_NETHERITE_COIN_STACK,
				CoinStackBlocks.LARGE_COPPER_COIN_STACK,
				CoinStackBlocks.LARGE_IRON_COIN_STACK,
				CoinStackBlocks.LARGE_GOLD_COIN_STACK,
				CoinStackBlocks.LARGE_EMERALD_COIN_STACK,
				CoinStackBlocks.LARGE_NETHERITE_COIN_STACK,
				CoinStackBlocks.COPPER_COIN_STACK_SLAB,
				CoinStackBlocks.IRON_COIN_STACK_SLAB,
				CoinStackBlocks.GOLD_COIN_STACK_SLAB,
				CoinStackBlocks.EMERALD_COIN_STACK_SLAB,
				CoinStackBlocks.NETHERITE_COIN_STACK_SLAB,
				CoinStackBlocks.COPPER_COIN_STACK_BLOCK,
				CoinStackBlocks.IRON_COIN_STACK_BLOCK,
				CoinStackBlocks.GOLD_COIN_STACK_BLOCK,
				CoinStackBlocks.EMERALD_COIN_STACK_BLOCK,
				CoinStackBlocks.NETHERITE_COIN_STACK_BLOCK
		);
		
		return CoinStackBlocksFeature.registerCoinStackBlockEntities( builder );
	}
	
	public static Block registerCoinStackBlock( String id, Block block, long value ) {
		return CoinStackBlocksFeature.registerCoinStackBlock( id, block, value );
	}
	
	public static Block registerCraftableCoinStackBlock( CoinType type, String id, Block block, long value ) {
		return CoinStackBlocksFeature.registerCraftableCoinStackBlock( type, id, block, value );
	}
	
	public static Block registerCraftableFireproofCoinStackBlock( CoinType type, String id, Block block, long value ) {
		return CoinStackBlocksFeature.registerCraftableFireproofCoinStackBlock( type, id, block, value );
	}
	
	public static Block registerSmallCoinStackBlock( CoinType type, String id, long value ) {
		return registerCraftableCoinStackBlock( type, id, new SmallCoinStackBlock( AbstractBlock.Settings.create() ), value );
	}
	
	public static Block registerSmallFireproofCoinStackBlock( CoinType type, String id, long value ) {
		return registerCraftableFireproofCoinStackBlock( type, id, new SmallCoinStackBlock( AbstractBlock.Settings.create() ), value );
	}
	
	public static Block registerMediumCoinStackBlock( CoinType type, String id, long value ) {
		return registerCraftableCoinStackBlock( type, id, new MediumCoinStackBlock( AbstractBlock.Settings.create() ), value );
	}
	
	public static Block registerMediumFireproofCoinStackBlock( CoinType type, String id, long value ) {
		return registerCraftableFireproofCoinStackBlock( type, id, new MediumCoinStackBlock( AbstractBlock.Settings.create() ), value );
	}
	
	public static Block registerLargeCoinStackBlock( CoinType type, String id, long value ) {
		return registerCraftableCoinStackBlock( type, id, new LargeCoinStackBlock( AbstractBlock.Settings.create() ), value );
	}
	
	public static Block registerLargeFireproofCoinStackBlock( CoinType type, String id, long value ) {
		return registerCraftableFireproofCoinStackBlock( type, id, new LargeCoinStackBlock( AbstractBlock.Settings.create() ), value );
	}
	
	public static Block registerCoinStackSlabBlock( CoinType type, String id, long value ) {
		return registerCraftableCoinStackBlock( type, id, new CoinStackSlabBlock( AbstractBlock.Settings.create() ), value );
	}
	
	public static Block registerFireproofCoinStackSlabBlock( CoinType type, String id, long value ) {
		return registerCraftableFireproofCoinStackBlock( type, id, new CoinStackSlabBlock( AbstractBlock.Settings.create() ), value );
	}
	
	public static Block registerCoinStackBlock( CoinType type, String id, long value ) {
		return registerCraftableCoinStackBlock( type, id, new CoinStackBlock( AbstractBlock.Settings.create() ), value );
	}
	
	public static Block registerFireproofCoinStackBlock( CoinType type, String id, long value ) {
		return registerCraftableFireproofCoinStackBlock( type, id, new CoinStackBlock( AbstractBlock.Settings.create() ), value );
	}
	
}
