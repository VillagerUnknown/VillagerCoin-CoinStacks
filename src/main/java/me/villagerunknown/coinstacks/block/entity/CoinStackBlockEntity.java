package me.villagerunknown.coinstacks.block.entity;

import me.villagerunknown.coinstacks.feature.CoinStackBlocksFeatureLoader;
import me.villagerunknown.villagercoin.block.entity.AbstractCurrencyValueBlockEntity;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;

public class CoinStackBlockEntity extends AbstractCurrencyValueBlockEntity {

	public CoinStackBlockEntity(BlockEntityType<CoinStackBlockEntity> type, BlockPos pos, BlockState state) {
		super(type, pos, state);
	}
	
	public CoinStackBlockEntity(BlockPos blockPos, BlockState blockState) {
		super(CoinStackBlocksFeatureLoader.COIN_STACK_BLOCK_ENTITY_TYPE, blockPos, blockState);
	}
	
}
