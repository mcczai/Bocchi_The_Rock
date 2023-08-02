package net.mcczai.bocchitherock;

import net.mcczai.bocchitherock.Init.BlockInit;
import net.mcczai.bocchitherock.Init.ItemInit;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


@Mod.EventBusSubscriber(modid = "bocchitherock")
public class bocchitherockTab {

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,bocchitherock.ID);
    public static final RegistryObject<CreativeModeTab> BOCCHITHEROCK_TAB = TABS.register("bocchitherock_tab",()->new bocchitherockTab().output());

    public CreativeModeTab output() {
        return CreativeModeTab.builder().title(Component.translatable("itemGroup.bocchitherock_tab"))
                .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
                .icon(() -> new ItemStack(ItemInit.BOCCHI.get()))
                .displayItems((parameters, output) -> {

                    output.accept(ItemInit.GUITARDC.get());
                    output.accept(ItemInit.GUITAR.get());
                    output.accept(ItemInit.BASS.get());
                    output.accept(ItemInit.BOCCHI.get());
                    output.accept(ItemInit.IKUYO.get());
                    output.accept(ItemInit.NIJIKA.get());
                    output.accept(ItemInit.RUYO.get());

                    output.accept(ItemInit.TSHIRT.get());
                    output.accept(ItemInit.BOX.get());

                    output.accept(BlockInit.DRUM_BLOCK.get());
                    output.accept(BlockInit.BOX_BLOCK.get());
                    output.accept(BlockInit.YAMAHA_BLOCK.get());
                    output.accept(BlockInit.GUITAR_SUPPORT_BLOCK.get());
                    output.accept(BlockInit.STARRY_LIGHT_BLOCK.get());
                    output.accept(BlockInit.CHAIR_BLOCK.get());
                    output.accept(BlockInit.TABLE_BLOCK.get());
                    output.accept(BlockInit.CHESSBOARD_BLOCK.get());
                    output.accept(BlockInit.CAN_BLOCK.get());


                }).build();
    }
}
