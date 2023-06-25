package net.mcczai.bocchitherock;

import net.mcczai.bocchitherock.registry.BlockInit;
import net.mcczai.bocchitherock.registry.ItemInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("bocchitherock")
public class bocchitherock {
    public static final String ID = "bocchitherock";

    public bocchitherock() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.register(bus);
        CREATIVE_MODE_TABS.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }
}
