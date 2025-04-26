package me.villagerunknown.coinstacks.block;

import com.mojang.serialization.MapCodec;
import me.villagerunknown.coinstacks.block.entity.CoinStackBlockEntity;
import me.villagerunknown.villagercoin.block.AbstractCoinStackBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;

public class CoinStackBlock extends AbstractCoinStackBlock {
	
	public static final DirectionProperty FACING;
	
	public static final MapCodec<CoinStackBlock> CODEC = createCodec(CoinStackBlock::new);

	public CoinStackBlock(AbstractBlock.Settings settings) {
		super(
				settings
						.nonOpaque()
		);
	}
	
	@Override
	protected MapCodec<CoinStackBlock> getCodec() {
		return CODEC;
	}
	
	public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
		return new CoinStackBlockEntity(pos, state);
	}
	
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return (BlockState)this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing());
	}
	
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(new Property[]{FACING});
	}
	
	static {
		FACING = Properties.HORIZONTAL_FACING;
	}
	
}
