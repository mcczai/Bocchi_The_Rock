package net.mcczai.bocchitherock.block.starrylight;

import net.mcczai.bocchitherock.Init.BlockEntities;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class StarryLightRenderer extends GeoBlockRenderer<StarryLightEntity> {
    public StarryLightRenderer(BlockEntityRendererProvider.Context context) {
        super(new StarryLightModel());
    }

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event){
        event.registerBlockEntityRenderer(BlockEntities.STARRY_LIGHT_BLOCK_ENTITY.get(), StarryLightRenderer::new);
    }
}
