package net.mcczai.bocchitherock.block.guitarsupport;

import com.mojang.logging.LogUtils;
import net.mcczai.bocchitherock.Init.BlockEntities;
import net.mcczai.bocchitherock.network.ItemStackSyncS2CPacket;
import net.mcczai.bocchitherock.network.MessgesInit;
import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Container;
import net.minecraft.world.ContainerHelper;
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

public class GuitarSupportEntity extends RandomizableContainerBlockEntity implements GeoBlockEntity {
    private AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);
    private NonNullList<ItemStack> items = NonNullList.withSize(9,ItemStack.EMPTY);
    public final static ItemStackHandler itemHandler = new ItemStackHandler(9);
    private ItemStack stack = ItemStack.EMPTY;

    public static Logger LOGGER = LogUtils.getLogger();

    private ContainerOpenersCounter openersCounter = new ContainerOpenersCounter() {
        @Override
        protected void onOpen(Level level, BlockPos pos, BlockState state) {
            level.setBlock(pos,state.setValue(GuitarSupportBlock.OPEN,true),1);
        }

        @Override
        protected void onClose(Level level, BlockPos pos, BlockState state) {
            level.setBlock(pos,state.setValue(GuitarSupportBlock.OPEN,false),1);

        }

        @Override
        protected void openerCountChanged(Level level, BlockPos pos, BlockState state, int i, int i1) {
            setChanged();
            if (!level.isClientSide()){
                MessgesInit.sendToClients(new ItemStackSyncS2CPacket(itemHandler,worldPosition));
                LOGGER.info("S2C Messges off");
            }

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
        if(!this.trySaveLootTable(compoundTag)){
            ContainerHelper.saveAllItems(compoundTag,this.items);
            LOGGER.info("chest save off!");
        }
    }

    @Override
    public void load(CompoundTag compoundTag) {
        super.load(compoundTag);
        this.items = NonNullList.withSize(this.getContainerSize(),ItemStack.EMPTY);
        if (!this.trySaveLootTable(compoundTag)){
            ContainerHelper.loadAllItems(compoundTag,this.items);
        }
    }

    @Override
    public void startOpen(Player player) {
        if (this.remove && !player.isSpectator()){
            this.openersCounter.incrementOpeners(player,this.getLevel(),this.getBlockPos(),this.getBlockState());
        }
    }

    @Override
    public void stopOpen(Player player) {
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
        return ChestMenu.oneRow(i,inventory);
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
}
