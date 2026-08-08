package me.villagerunknown.coinstacks.block;

import com.google.common.collect.ImmutableMap;
import me.villagerunknown.villagercoin.block.CoinStackBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import java.util.HashMap;
import java.util.function.Function;

public class SmallCoinStackBlock extends CoinStackBlock {
	
	protected static final VoxelShape SHAPE = Block.box(6.0, 0.0, 6.0, 10.0, 4.0, 10.0);
	
	public SmallCoinStackBlock(Properties settings) {
		super(settings);
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
