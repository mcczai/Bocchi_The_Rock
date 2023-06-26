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
        MinecraftForge.EVENT_BUS.register(this);

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        bocchitherockTab.CREATIVE_MODE_TABS.register(bus);

    }

    }

