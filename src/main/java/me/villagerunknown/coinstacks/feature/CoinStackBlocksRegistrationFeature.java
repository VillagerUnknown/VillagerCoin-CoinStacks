package me.villagerunknown.coinstacks.feature;

import me.villagerunknown.coinstacks.block.*;
import me.villagerunknown.villagercoin.Villagercoin;
import me.villagerunknown.villagercoin.block.CoinStackBlock;
import me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature;
import me.villagerunknown.villagercoin.type.CoinType;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;

public class CoinStackBlocksRegistrationFeature {

	public static void execute(){
		new CoinStackBlocks();
	}
	
	public static Block registerCoinStackBlock( String id, Block block, long value ) {
		return CoinStackBlocksFeature.registerCoinStackBlock( Villagercoin.MOD_ID, id, block, value );
	}
	
	public static Block registerCraftableCoinStackBlock( CoinType type, String id, Block block, long value ) {
		return CoinStackBlocksFeature.registerCraftableCoinStackBlock( type, Villagercoin.MOD_ID, id, block, value );
	}
	
	public static Block registerCraftableFireproofCoinStackBlock( CoinType type, String id, Block block, long value ) {
		return CoinStackBlocksFeature.registerCraftableFireproofCoinStackBlock( type, Villagercoin.MOD_ID, id, block, value );
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
