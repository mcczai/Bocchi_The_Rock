package net.mcczai.bocchitherock;

import net.mcczai.bocchitherock.registry.ItemInit;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = "bocchitherock",bus = Mod.EventBusSubscriber.Bus.MOD)
public class bocchitherockTab {

    // Creates a creative tab with the id "examplemod:example_tab" for the example item, that is placed after the combat tab
    /*public static final RegistryObject<CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("bocchitherock_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> EXAMPLE_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(EXAMPLE_ITEM.get()); // Add the example item to the tab. For your own tabs, this method is preferred over the event
            }).build());*/
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, bocchitherock.ID);

    public static final RegistryObject<CreativeModeTab> BOCCHI_THE_ROCK_TAB = CREATIVE_MODE_TABS.register("bocchitherock_tab",()-> CreativeModeTab.builder()
            .displayItems(ItemInit.get())
            .build());
}
