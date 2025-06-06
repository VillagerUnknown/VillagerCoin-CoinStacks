package me.villagerunknown.coinstacks.block;

import com.google.common.collect.ImmutableMap;
import me.villagerunknown.villagercoin.block.CoinStackBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

import java.util.HashMap;
import java.util.function.Function;

public class SmallCoinStackBlock extends CoinStackBlock {
	
	protected static final VoxelShape SHAPE = Block.createCuboidShape(6.0, 0.0, 6.0, 10.0, 4.0, 10.0);
	
	public SmallCoinStackBlock(Settings settings) {
		super(settings);
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
