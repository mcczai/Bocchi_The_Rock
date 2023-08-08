package net.mcczai.bocchitherock.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class CanBlock extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.FACING;

    public CanBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.getStateDefinition().any().setValue(FACING, Direction.SOUTH));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return super.defaultBlockState().setValue(FACING,context.getNearestLookingDirection());
    }

    public static final VoxelShape SHAPENS = Stream.of(
            Block.box(4, 0, 5, 12, 0.5, 11),
            Block.box(3.75, 0.5, 4.5, 12.25, 1, 11.5),
            Block.box(12.25, 1, 4.5, 12.75, 7.5, 11.5),
            Block.box(3.25, 1, 4.5, 3.75, 7.5, 11.5),
            Block.box(3.75, 1, 4.25, 12.25, 7.5, 4.75),
            Block.box(3.75, 1, 11.25, 12.25, 7.5, 11.75),
            Block.box(12.5, 7.5, 4.25, 13, 14.5, 11.75),
            Block.box(3, 7.5, 4.25, 3.5, 14.5, 11.75),
            Block.box(3.5, 7.5, 4, 12.5, 14.5, 4.5),
            Block.box(3.25, 14.5, 3.75, 12.75, 15.25, 4.75),
            Block.box(3.25, 14.5, 11.25, 12.75, 15.25, 12.25),
            Block.box(2.75, 14.5, 3.75, 3.75, 15.25, 12.25),
            Block.box(12.25, 14.5, 3.75, 13.25, 15.25, 12.25),
            Block.box(3.5, 7.5, 11.5, 12.5, 14.5, 12)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    public static final VoxelShape SHAPEWE = Stream.of(
            Block.box(5, 0, 4, 11, 0.5, 12),
            Block.box(4.5, 0.5, 3.75, 11.5, 1, 12.25),
            Block.box(4.5, 1, 3.25, 11.5, 7.5, 3.75),
            Block.box(4.5, 1, 12.25, 11.5, 7.5, 12.75),
            Block.box(4.25, 1, 3.75, 4.75, 7.5, 12.25),
            Block.box(11.25, 1, 3.75, 11.75, 7.5, 12.25),
            Block.box(4.25, 7.5, 3, 11.75, 14.5, 3.5),
            Block.box(4.25, 7.5, 12.5, 11.75, 14.5, 13),
            Block.box(4, 7.5, 3.5, 4.5, 14.5, 12.5),
            Block.box(3.75, 14.5, 3.25, 4.75, 15.25, 12.75),
            Block.box(11.25, 14.5, 3.25, 12.25, 15.25, 12.75),
            Block.box(3.75, 14.5, 12.25, 12.25, 15.25, 13.25),
            Block.box(3.75, 14.5, 2.75, 12.25, 15.25, 3.75),
            Block.box(11.5, 7.5, 3.5, 12, 14.5, 12.5)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    @Override
    public @NotNull VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos blockPos, CollisionContext context) {
        if (state.getValue(FACING).getAxis() == Direction.Axis.Z)
            return SHAPENS;
        return SHAPEWE;
    }

    @Override
    public RenderShape getRenderShape(BlockState state){

        return RenderShape.MODEL;

    }

}
