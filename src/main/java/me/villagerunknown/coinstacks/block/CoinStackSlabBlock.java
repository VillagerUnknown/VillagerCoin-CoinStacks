package me.villagerunknown.coinstacks.block;

import com.google.common.collect.ImmutableMap;
import me.villagerunknown.villagercoin.block.CoinStackBlock;
import me.villagerunknown.villagercoin.block.entity.AbstractCurrencyValueBlockEntity;
import me.villagerunknown.villagercoin.component.CurrencyComponent;
import me.villagerunknown.villagercoin.feature.CoinFeature;
import me.villagerunknown.villagercoin.feature.CoinStackBlocksFeature;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.function.Function;

import static me.villagerunknown.villagercoin.component.Components.CURRENCY_COMPONENT;

public class CoinStackSlabBlock extends CoinStackBlock {
	
	protected static final VoxelShape SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
	
	public CoinStackSlabBlock(Settings settings) {
		super(settings);
	}
	
	@Override
	protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		if( hit.getSide() == Direction.UP && stack.isOf( this.asItem() ) ) {
			CurrencyComponent currencyComponent = stack.get( CURRENCY_COMPONENT );
			
			if( null != currencyComponent ) {
				BlockState blockState = null;
				long value = currencyComponent.value();
				long newValue = 0;
				
				if( CoinStackBlocksFeature.COPPER_VALUE * CoinStackBlocksFeature.SLAB_VALUE_MULTIPLIER == value ) {
					blockState = CoinStackBlocks.COPPER_COIN_STACK_BLOCK.getDefaultState();
					newValue = CoinStackBlocksFeature.COPPER_VALUE * CoinStackBlocksFeature.BLOCK_VALUE_MULTIPLIER;
				} else if( CoinStackBlocksFeature.IRON_VALUE * CoinStackBlocksFeature.SLAB_VALUE_MULTIPLIER == value ) {
					blockState = CoinStackBlocks.IRON_COIN_STACK_BLOCK.getDefaultState();
					newValue = CoinStackBlocksFeature.IRON_VALUE * CoinStackBlocksFeature.BLOCK_VALUE_MULTIPLIER;
				} else if( CoinStackBlocksFeature.GOLD_VALUE * CoinStackBlocksFeature.SLAB_VALUE_MULTIPLIER == value ) {
					blockState = CoinStackBlocks.GOLD_COIN_STACK_BLOCK.getDefaultState();
					newValue = CoinStackBlocksFeature.GOLD_VALUE * CoinStackBlocksFeature.BLOCK_VALUE_MULTIPLIER;
				} else if( CoinStackBlocksFeature.EMERALD_VALUE * CoinStackBlocksFeature.SLAB_VALUE_MULTIPLIER == value ) {
					blockState = CoinStackBlocks.EMERALD_COIN_STACK_BLOCK.getDefaultState();
					newValue = CoinStackBlocksFeature.EMERALD_VALUE * CoinStackBlocksFeature.BLOCK_VALUE_MULTIPLIER;
				} else if( CoinStackBlocksFeature.NETHERITE_VALUE * CoinStackBlocksFeature.SLAB_VALUE_MULTIPLIER == value ) {
					blockState = CoinStackBlocks.NETHERITE_COIN_STACK_BLOCK.getDefaultState();
					newValue = CoinStackBlocksFeature.NETHERITE_VALUE * CoinStackBlocksFeature.BLOCK_VALUE_MULTIPLIER;
				} // if, else if ...
				
				if( null != blockState ) {
					CoinFeature.playHeavyCoinSound( player );
					
					world.setBlockState(pos, blockState.with(FACING, player.getHorizontalFacing()).with( WATERLOGGED, world.getFluidState( pos ).isOf( Fluids.WATER ) ) );
					
					BlockEntity blockEntity = world.getBlockEntity(pos);
					
					if( blockEntity instanceof AbstractCurrencyValueBlockEntity currencyValueBlockEntity ) {
						currencyValueBlockEntity.setTotalCurrencyValue( newValue );
					} // if
					
					world.markDirty(pos);
					
					stack.decrementUnlessCreative( 1, player );
					
					return ItemActionResult.SUCCESS;
				} // if
			} // if
		}
		
		return super.onUseWithItem(stack, state, world, pos, player, hand, hit);
	}
	
	@Override
	protected ImmutableMap<BlockState, VoxelShape> getShapesForStates(Function<BlockState, VoxelShape> stateToShape) {
		HashMap<BlockState, VoxelShape> shapes = new HashMap<>();
		
		shapes.put( stateManager.getDefaultState().with(FACING, Direction.NORTH), SHAPE );
		shapes.put( stateManager.getDefaultState().with(FACING, Direction.EAST), SHAPE );
		shapes.put( stateManager.getDefaultState().with(FACING, Direction.SOUTH), SHAPE );
		shapes.put( stateManager.getDefaultState().with(FACING, Direction.WEST), SHAPE );
		
		return ImmutableMap.<BlockState, VoxelShape>builder().putAll( shapes ).build();
	}
	
	protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return SHAPE;
	}
	
}
