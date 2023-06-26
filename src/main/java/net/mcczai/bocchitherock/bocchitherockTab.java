package net.mcczai.bocchitherock;

import net.mcczai.bocchitherock.registry.ItemInit;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import javax.sound.midi.*;

@Mod.EventBusSubscriber(modid = "bocchitherock",bus = Mod.EventBusSubscriber.Bus.MOD)
public class bocchitherockTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, bocchitherock.ID);

    public static final RegistryObject<CreativeModeTab> BOCCHI_THE_ROCK_TAB = CREATIVE_MODE_TABS.register("bocchitherock_tab",()-> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(()-> ItemInit.TEST.get().getDefaultInstance())
            .displayItems((parameters , output) -> {
                 output.accept(ItemInit.TEST.get());
            }).build());

}
