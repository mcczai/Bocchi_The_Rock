package net.mcczai.bocchitherock.block.guitarsupport;

import com.mojang.logging.LogUtils;
import net.mcczai.bocchitherock.Init.BlockEntities;
import net.mcczai.bocchitherock.network.ItemStackSyncS2CPacket;
import net.mcczai.bocchitherock.network.MessagesInit;
import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.ContainerOpenersCounter;
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.items.ItemStackHandler;
import org.slf4j.Logger;
import software.bernie.geckolib.animatable.GeoBlockEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.RenderUtils;

import static net.minecraft.world.inventory.MenuType.GENERIC_9x1;

public class GuitarSupportEntity extends RandomizableContainerBlockEntity implements GeoBlockEntity {
    private AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);
    private NonNullList<ItemStack> items = NonNullList.withSize(9,ItemStack.EMPTY);
    public final ItemStackHandler itemHandler = new ItemStackHandler(9){
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
            /*if (!level.isClientSide()){
                MessagesInit.sendToClients(new ItemStackSyncS2CPacket(this,worldPosition));
                LOGGER.info("S2C Messges off");
            }*/
        }
    };
    private ItemStack stack = ItemStack.EMPTY;

    public static Logger LOGGER = LogUtils.getLogger();

    private ContainerOpenersCounter openersCounter = new ContainerOpenersCounter() {
        @Override
        protected void onOpen(Level level, BlockPos pos, BlockState state) {

        }

        @Override
        protected void onClose(Level level, BlockPos pos, BlockState state) {

        }

        @Override
        protected void openerCountChanged(Level level, BlockPos pos, BlockState state, int i, int i1) {
        }

        @Override
        protected boolean isOwnContainer(Player player) {
            if (player.containerMenu instanceof ChestMenu){
                Container container = ((ChestMenu) player.containerMenu).getContainer();
                return container == GuitarSupportEntity.this;
            }else {
                return false;
            }
        }
    };

    @Override
    protected void saveAdditional(CompoundTag compoundTag) {
        super.saveAdditional(compoundTag);
        compoundTag.put("Inventory", itemHandler.serializeNBT());
    }

    @Override
    public void load(CompoundTag compoundTag) {
        super.load(compoundTag);
        itemHandler.deserializeNBT(compoundTag.getCompound("Inventory"));
    }

    @Override
    public void startOpen(Player player) {
        setChanged();
        if (this.remove && !player.isSpectator()){
            this.openersCounter.incrementOpeners(player,this.getLevel(),this.getBlockPos(),this.getBlockState());
        }
    }

    @Override
    public void stopOpen(Player player) {
        setChanged();
        if (this.remove && !player.isSpectator()){
            this.openersCounter.decrementOpeners(player,this.getLevel(),this.getBlockPos(),this.getBlockState());
        }
    }

    public void recheckOpen(){
        if (this.remove){
            this.openersCounter.recheckOpeners(this.getLevel(),this.getBlockPos(),this.getBlockState());
        }
    }

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
        return Component.translatable("component.bocchitherock.guitar_support");
    }

    @Override
    protected AbstractContainerMenu createMenu(int i, Inventory inventory) {
        return new ChestMenu(GENERIC_9x1,i,inventory,this,1);
    }

    @Override
    public int getContainerSize() {
        return 9;
    }

    public void setHandler(ItemStackHandler itemStackHandler) {
        for (int i = 0;i<itemStackHandler.getSlots();i++){
            itemHandler.setStackInSlot(i, itemStackHandler.getStackInSlot(i));
        }
    }

    public ItemStack getStack() {
        return stack;
    }

    public ItemStack getRenderStack() {
        ItemStack stack;

        if(!itemHandler.getStackInSlot(2).isEmpty()) {
            stack = itemHandler.getStackInSlot(2);
        } else {
            stack = itemHandler.getStackInSlot(1);
        }

        return stack;
    }



}
