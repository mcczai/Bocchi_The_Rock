package net.mcczai.bocchitherock.util;

import net.mcczai.bocchitherock.entity.client.DrumEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

public class Handler {
  /*  public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        Player player = event.getEntity();

        if (!event.getLevel().isClientSide && event.getFace() == Direction.UP && !PlayrUtil.isPlayerSitting(player) && !player.isShiftKeyDown()) {
            Level world = event.getLevel();
            BlockPos pos = event.getPos();
            BlockState state = world.getBlockState(pos);
            Block block = world.getBlockState(pos).getBlock();

            if (isValidBlock(world, pos, state, block) && isPlayerInRange(player, pos) && !SitUtil.isOccupied(world, pos) && player.getMainHandItem().isEmpty() && world.getBlockState(pos.above()).isAir()) {
                if (block instanceof SlabBlock && (!state.hasProperty(SlabBlock.TYPE) || state.getValue(SlabBlock.TYPE) != SlabType.BOTTOM))
                    return;
                else if (block instanceof StairBlock && (!state.hasProperty(StairBlock.HALF) || state.getValue(StairBlock.HALF) != Half.BOTTOM))
                    return;

                DrumEntity sit = new DrumEntity(world, pos);

                if (PlayrUtil.addSitEntity(world, pos, sit, player.blockPosition())) {
                    world.addFreshEntity(sit);
                    player.startRiding(sit);
                }
            }
        }
    }

    private static boolean isPlayerInRange(Player player, BlockPos pos) {
        BlockPos playerPos = player.blockPosition();
        int blockReachDistance = .blockReachDistance.get();

        if (blockReachDistance == 0) //player has to stand on top of the block
            return playerPos.getY() - pos.getY() <= 1 && playerPos.getX() - pos.getX() == 0 && playerPos.getZ() - pos.getZ() == 0;

        pos = BlockPos.containing(pos.getX() + 0.5D, pos.getY() + 0.5D, pos.getZ() + 0.5D);

        AABB range = new AABB(pos.getX() + blockReachDistance, pos.getY() + blockReachDistance, pos.getZ() + blockReachDistance, pos.getX() - blockReachDistance, pos.getY() - blockReachDistance, pos.getZ() - blockReachDistance);

        playerPos = BlockPos.containing(playerPos.getX() + 0.5D, playerPos.getY() + 0.5D, playerPos.getZ() + 0.5D);
        return range.minX <= playerPos.getX() && range.minY <= playerPos.getY() && range.minZ <= playerPos.getZ() && range.maxX >= playerPos.getX() && range.maxY >= playerPos.getY() && range.maxZ >= playerPos.getZ();
    }*/
}
