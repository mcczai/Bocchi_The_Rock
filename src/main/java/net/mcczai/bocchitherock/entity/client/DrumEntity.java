package net.mcczai.bocchitherock.entity.client;

import net.mcczai.bocchitherock.registry.EntityInit;
import net.mcczai.bocchitherock.util.PlayrUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SupportType;
import net.minecraft.world.phys.Vec3;


public class DrumEntity extends Entity {
    public DrumEntity(EntityType<?> type, Level level) {
        super(type, level);
    }

    public DrumEntity(Level level, BlockPos pos){
        super(EntityInit.DRUM_SIT.get(),level);
        setPos(pos.getX() + 0.5D,pos.getY() + 0.25D, pos.getZ() + 0.5D);
        noPhysics = true;
    }
    
    public Vec3 getDismountLocationForPassenger(LivingEntity passenger){
        if (passenger instanceof Player player) {
            BlockPos pos = PlayrUtil.getPreviousPlayerPosition(player, this);

            if (pos != null) {
                Vec3 resetPosition = new Vec3(pos.getX() + 0.5D, pos.getY(), pos.getZ() + 0.5D);
                BlockPos belowResetPos = BlockPos.containing(resetPosition.x, resetPosition.y - 1, resetPosition.z);

                discard();

                if (!player.level().getBlockState(belowResetPos).isFaceSturdy(level(), belowResetPos, Direction.UP, SupportType.FULL))
                    return new Vec3(resetPosition.x, resetPosition.y + 1, resetPosition.z);
                else
                    return resetPosition;
            }
        }
        discard();
        return super.getDismountLocationForPassenger(passenger);
    }
    @Override
    protected void defineSynchedData() {

    }

    @Override
    protected void readAdditionalSaveData(CompoundTag p_20052_) {

    }

    @Override
    protected void addAdditionalSaveData(CompoundTag p_20139_) {

    }
}
