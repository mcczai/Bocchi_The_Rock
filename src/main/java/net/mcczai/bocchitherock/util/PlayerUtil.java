package net.mcczai.bocchitherock.util;

import net.mcczai.bocchitherock.entity.client.DrumEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import org.apache.commons.lang3.tuple.Pair;

import java.util.HashMap;
import java.util.Map;

public class PlayrUtil {
   /* private static final Map<ResourceLocation,Map<BlockPos, Pair<DrumEntity,BlockPos>>> OCCUPIED = new HashMap<>();

    public static BlockPos getPreviousPlayerPosition(Player player, DrumEntity drumEntity){
        if (!player.level().isClientSide) {
            ResourceLocation id = getDimensionTypeId(player.level());

            if (OCCUPIED.containsKey(id)) {
                for (Pair<DrumEntity, BlockPos> pair : OCCUPIED.get(id).values()) {
                    if (pair.getLeft() == drumEntity)
                        return pair.getRight();
                }
            }
        }

        return null;
    }

    public static boolean isPlayerSitting(Player player) {
        for (ResourceLocation i : OCCUPIED.keySet()) {
            for (Pair<DrumEntity, BlockPos> pair : OCCUPIED.get(i).values()) {
                if (pair.getLeft().hasPassenger(player))
                    return true;
            }
        }

        return false;
    }

    private static ResourceLocation getDimensionTypeId(Level level) {
        return level.dimension().location();
    }*/
}
