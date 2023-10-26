package net.mcczai.bocchitherock.block.guitarsupport;

import net.mcczai.bocchitherock.Init.BlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.animatable.GeoBlockEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.RenderUtils;

public class GuitarSupportEntity extends BlockEntity implements GeoBlockEntity {
    private ItemStackHandler inventory = new ItemStackHandler(1){
        @Override
        protected int getStackLimit(int slot, @NotNull ItemStack stack) {
            return 1;
        }
    };

    public void addItem(ItemStack itemStack){
        for (int i = 0; i < this.inventory.getSlots(); i++) {
            ItemStack stack = this.inventory.getStackInSlot(i);
            if (stack.isEmpty()){
                this.inventory.setStackInSlot(i,itemStack.split(1));
                setChanged();
                return;
            }
        }
    }
    private AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);
    public GuitarSupportEntity(BlockPos pos, BlockState state){

        super(BlockEntities.GUITAR_SUPPORT_BLOCK_ENTITY.get(), pos ,state);
    }
    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        controllerRegistrar.add(new AnimationController<>(this,"controller",0,this::predicate));
    }
    private <T extends GeoAnimatable> PlayState predicate(AnimationState<T> tanimationState) {
        tanimationState.getController().setAnimation(RawAnimation.begin().then("animation.drum.standby", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }
    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }
    @Override
    public double getTick(Object blockEntity){
        return RenderUtils.getCurrentTick();
    }

}
