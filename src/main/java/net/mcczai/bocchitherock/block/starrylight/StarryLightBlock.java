package net.mcczai.bocchitherock.block.starrylight;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class StarryLightBlock extends BaseEntityBlock {

    public static final DirectionProperty FACING = BlockStateProperties.FACING;

    public StarryLightBlock(Properties properties) {
        super(properties.noOcclusion());
        this.registerDefaultState(this.getStateDefinition().any().setValue(FACING, Direction.SOUTH));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return super.defaultBlockState().setValue(FACING,context.getClickedFace());//.getNearestLookingDirection());
    }

    public static final VoxelShape SHAPEN = Block.box(-1, 0, 13.89, 18, 13, 16);
    public static final VoxelShape SHAPEW = Block.box(14, 0, -1, 16.1, 13, 18);
    public static final VoxelShape SHAPES = Block.box(-1, 0, -0.10, 18, 13, 2);
    public static final VoxelShape SHAPEE = Block.box(0, 0, -1, 2.10, 13, 18);

    @Override
    public @NotNull VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos blockPos, CollisionContext context) {
        if (state.getValue(FACING).getAxis() == Direction.Axis.Z){
            if (state.getValue(FACING).getAxisDirection() == Direction.AxisDirection.NEGATIVE){
                return SHAPEN;
            }else {
                return SHAPES;
            }
        }else {
            if (state.getValue(FACING).getAxisDirection() == Direction.AxisDirection.NEGATIVE){
                return SHAPEW;
            }
        }
        return SHAPEE;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new StarryLightEntity(pos,state);
    }

    @Override
    public RenderShape getRenderShape(BlockState state){
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }
}
