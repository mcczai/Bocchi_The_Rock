package net.mcczai.bocchitherock.block.entity.client.drum;

import net.mcczai.bocchitherock.block.entity.AnimateBlockEntity;
import net.mcczai.bocchitherock.registry.BlockEntities;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import software.bernie.geckolib.renderer.GeoBlockRenderer;


public class DrumRenderer extends GeoBlockRenderer<AnimateBlockEntity> {
    public DrumRenderer(BlockEntityRendererProvider.Context context){
        super(new DrumModel());
    }

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event){
        event.registerBlockEntityRenderer(BlockEntities.DRUM_ANIMATED_BLOCK_ENTITY.get(),DrumRenderer::new);
    }
}