package net.mcczai.bocchitherock;

import net.mcczai.bocchitherock.Init.BlockEntities;
import net.mcczai.bocchitherock.Init.BlockInit;
import net.mcczai.bocchitherock.Init.EntityInit;
import net.mcczai.bocchitherock.Init.ItemInit;
import net.mcczai.bocchitherock.block.drum.DrumRenderer;
import net.mcczai.bocchitherock.entity.DrumSitRenderer;
import net.mcczai.bocchitherock.entity.client.DrumEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import software.bernie.geckolib.GeckoLib;

@Mod("bocchitherock")
public class bocchitherock {
    public static final String ID = "bocchitherock";

    public bocchitherock() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        bocchitherockTab.TABS.register(bus);
        BlockEntities.BLOCK_ENTITIES.register(bus);
        EntityInit.ENTITY_TYPES.register(bus);

        GeckoLib.initialize();

    }

    @Mod.EventBusSubscriber(modid = ID,bus = Mod.EventBusSubscriber.Bus.MOD,value = Dist.CLIENT)
    public static class ClientModEvents{
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event){
            BlockEntityRenderers.register(BlockEntities.DRUM_ANIMATED_BLOCK_ENTITY.get(), DrumRenderer::new);
            EntityRenderers.register(EntityInit.DRUM_SIT.get(), DrumSitRenderer::new);
        }
    }
    }

