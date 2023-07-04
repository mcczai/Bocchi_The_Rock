package net.mcczai.bocchitherock.block.custom;

import net.mcczai.bocchitherock.block.entity.client.drum.DrumBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class AnimateBlock extends BaseEntityBlock {
    public AnimateBlock(Properties properties){
        super(properties);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState state) {

        return new DrumBlockEntity(blockPos,state);

    }

    @Override
    public RenderShape getRenderShape(BlockState state){

        return RenderShape.ENTITYBLOCK_ANIMATED;

    }
}
