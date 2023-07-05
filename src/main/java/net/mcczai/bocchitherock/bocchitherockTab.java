package net.mcczai.bocchitherock;

import net.mcczai.bocchitherock.registry.BlockInit;
import net.mcczai.bocchitherock.registry.ItemInit;
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
                .withTabsBefore(CreativeModeTabs.COMBAT)
                .icon(() -> new ItemStack(ItemInit.BOCCHI.get()))
                .displayItems((parameters, output) -> {

                    output.accept(ItemInit.TEST.get());
                    output.accept(ItemInit.MIDI_TEST_TOOL.get());
                    output.accept(BlockInit.DRUM_BLOCK.get());
                    output.accept(ItemInit.GUITARDC.get());
                    output.accept(ItemInit.GUITAR.get());
                    output.accept(ItemInit.BASS.get());
                    output.accept(ItemInit.TSHIRT.get());
                    output.accept(ItemInit.BOCCHI.get());
                    output.accept(ItemInit.IKUYO.get());
                    output.accept(ItemInit.NIJIKA.get());
                    output.accept(ItemInit.RUYO.get());


                }).build();
    }
}
