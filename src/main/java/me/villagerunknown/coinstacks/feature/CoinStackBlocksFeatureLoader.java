package me.villagerunknown.coinstacks.feature;

import me.villagerunknown.coinstacks.block.*;
import me.villagerunknown.coinstacks.block.entity.CoinStackBlockEntity;
import me.villagerunknown.platform.util.RegistryUtil;
import me.villagerunknown.villagercoin.Villagercoin;
import me.villagerunknown.villagercoin.block.entity.AbstractCurrencyValueBlockEntity;
import me.villagerunknown.villagercoin.component.CurrencyComponent;
import me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature;
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
				CoinStackBlocks.LARGE_NETHERITE_COIN_STACK
		);
		
		return CoinStackBlocksFeature.registerCoinStackBlockEntities( builder );
	}
	
	public static Block registerCoinStackBlock( String id, int value ) {
		return CoinStackBlocksFeature.registerCoinStackBlock( id, new CoinStackBlock( AbstractBlock.Settings.create() ), value );
	}
	
	public static Block registerSmallCoinStackBlock( String id, int value ) {
		return CoinStackBlocksFeature.registerCoinStackBlock( id, new SmallCoinStackBlock( AbstractBlock.Settings.create() ), value );
	}
	
	public static Block registerMediumCoinStackBlock( String id, int value ) {
		return CoinStackBlocksFeature.registerCoinStackBlock( id, new MediumCoinStackBlock( AbstractBlock.Settings.create() ), value );
	}
	
	public static Block registerLargeCoinStackBlock( String id, int value ) {
		return CoinStackBlocksFeature.registerCoinStackBlock( id, new LargeCoinStackBlock( AbstractBlock.Settings.create() ), value );
	}
	
}
