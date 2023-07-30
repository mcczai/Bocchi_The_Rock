package net.mcczai.bocchitherock.block.guitarsupport;

import net.mcczai.bocchitherock.Init.BlockEntities;
import net.mcczai.bocchitherock.network.ItemStackSyncS2CPacket;
import net.mcczai.bocchitherock.network.MessgesInit;
import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.items.ItemStackHandler;
import software.bernie.geckolib.animatable.GeoBlockEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.RenderUtils;

public class GuitarSupportEntity extends RandomizableContainerBlockEntity implements GeoBlockEntity {
    private AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);
    private NonNullList<ItemStack> items = NonNullList.withSize(1,ItemStack.EMPTY);
    public final static ItemStackHandler itemHandler = new ItemStackHandler(1);
    private ItemStack stack = ItemStack.EMPTY;

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



    @Override
    protected NonNullList<ItemStack> getItems() {
        return this.items;
    }

    @Override
    protected void setItems(NonNullList<ItemStack> stacks) {
        this.items = stacks;
    }

    @Override
    protected Component getDefaultName() {
        return null;
    }

    @Override
    protected AbstractContainerMenu createMenu(int p_58627_, Inventory p_58628_) {
        return null;
    }

    @Override
    public int getContainerSize() {
        return 1;
    }

    public static ItemStack getRebderStack() {
        ItemStack itemStack;
        itemStack = itemHandler.getStackInSlot(1);
        return itemStack;
    }

    public void setHandler(ItemStackHandler itemStackHandler) {
        for (int i = 0;i<itemStackHandler.getSlots();i++){
            itemHandler.setStackInSlot(i, itemStackHandler.getStackInSlot(i));
        }
    }

    public ItemStack getStack() {
        return stack;
    }

    protected void onContentsChanged(int slot) {
        setChanged();
        if (!level.isClientSide()){
            MessgesInit.sendToClients(new ItemStackSyncS2CPacket(itemHandler,worldPosition));
        }
    }


}
