package me.villagerunknown.coinstacks.block;

import com.google.common.collect.ImmutableMap;
import me.villagerunknown.villagercoin.block.CoinStackBlock;
import me.villagerunknown.villagercoin.block.entity.AbstractCurrencyValueBlockEntity;
import me.villagerunknown.villagercoin.component.CurrencyComponent;
import me.villagerunknown.villagercoin.feature.CoinFeature;
import me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import java.util.HashMap;
import java.util.function.Function;

import static me.villagerunknown.villagercoin.component.Components.CURRENCY_COMPONENT;

public class CoinStackSlabBlock extends CoinStackBlock {
	
	protected static final VoxelShape SHAPE = Block.box(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
	
	public CoinStackSlabBlock(Properties settings) {
		super(settings);
	}
	
	@Override
	protected InteractionResult useItemOn(ItemStack stack, BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
		if( hit.getDirection() == Direction.UP && stack.is( this.asItem() ) ) {
			CurrencyComponent currencyComponent = stack.get( CURRENCY_COMPONENT );
			
			if( null != currencyComponent ) {
				BlockState blockState = null;
				long value = currencyComponent.value();
				long newValue = 0;
				
				if( CoinStackBlocksFeature.COPPER_VALUE * CoinStackBlocksFeature.SLAB_VALUE_MULTIPLIER == value ) {
					blockState = CoinStackBlocks.COPPER_COIN_STACK_BLOCK.defaultBlockState();
					newValue = CoinStackBlocksFeature.COPPER_VALUE * CoinStackBlocksFeature.BLOCK_VALUE_MULTIPLIER;
				} else if( CoinStackBlocksFeature.IRON_VALUE * CoinStackBlocksFeature.SLAB_VALUE_MULTIPLIER == value ) {
					blockState = CoinStackBlocks.IRON_COIN_STACK_BLOCK.defaultBlockState();
					newValue = CoinStackBlocksFeature.IRON_VALUE * CoinStackBlocksFeature.BLOCK_VALUE_MULTIPLIER;
				} else if( CoinStackBlocksFeature.GOLD_VALUE * CoinStackBlocksFeature.SLAB_VALUE_MULTIPLIER == value ) {
					blockState = CoinStackBlocks.GOLD_COIN_STACK_BLOCK.defaultBlockState();
					newValue = CoinStackBlocksFeature.GOLD_VALUE * CoinStackBlocksFeature.BLOCK_VALUE_MULTIPLIER;
				} else if( CoinStackBlocksFeature.EMERALD_VALUE * CoinStackBlocksFeature.SLAB_VALUE_MULTIPLIER == value ) {
					blockState = CoinStackBlocks.EMERALD_COIN_STACK_BLOCK.defaultBlockState();
					newValue = CoinStackBlocksFeature.EMERALD_VALUE * CoinStackBlocksFeature.BLOCK_VALUE_MULTIPLIER;
				} else if( CoinStackBlocksFeature.NETHERITE_VALUE * CoinStackBlocksFeature.SLAB_VALUE_MULTIPLIER == value ) {
					blockState = CoinStackBlocks.NETHERITE_COIN_STACK_BLOCK.defaultBlockState();
					newValue = CoinStackBlocksFeature.NETHERITE_VALUE * CoinStackBlocksFeature.BLOCK_VALUE_MULTIPLIER;
				} // if, else if ...
				
				if( null != blockState ) {
					CoinFeature.playHeavyCoinSound( player );
					
					world.setBlockAndUpdate(pos, blockState.setValue(FACING, player.getDirection()).setValue( WATERLOGGED, world.getFluidState( pos ).is( Fluids.WATER ) ) );
					
					BlockEntity blockEntity = world.getBlockEntity(pos);
					
					if( blockEntity instanceof AbstractCurrencyValueBlockEntity currencyValueBlockEntity ) {
						currencyValueBlockEntity.setTotalCurrencyValue( newValue );
					} // if
					
					world.blockEntityChanged(pos);
					
					stack.consume( 1, player );
					
					return InteractionResult.SUCCESS;
				} // if
			} // if
		}
		
		return super.useItemOn(stack, state, world, pos, player, hand, hit);
	}
	
	protected ImmutableMap<BlockState, VoxelShape> getShapesForStates(Function<BlockState, VoxelShape> stateToShape) {
		HashMap<BlockState, VoxelShape> shapes = new HashMap<>();
		
		shapes.put( stateDefinition.any().setValue(FACING, Direction.NORTH), SHAPE );
		shapes.put( stateDefinition.any().setValue(FACING, Direction.EAST), SHAPE );
		shapes.put( stateDefinition.any().setValue(FACING, Direction.SOUTH), SHAPE );
		shapes.put( stateDefinition.any().setValue(FACING, Direction.WEST), SHAPE );
		
		return ImmutableMap.<BlockState, VoxelShape>builder().putAll( shapes ).build();
	}
	
	protected VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return SHAPE;
	}
	
}
