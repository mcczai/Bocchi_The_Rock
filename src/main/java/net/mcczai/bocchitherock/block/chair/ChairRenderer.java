package net.mcczai.bocchitherock.block.chair;

import net.mcczai.bocchitherock.Init.BlockEntities;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class ChairRenderer extends GeoBlockRenderer<ChairEntity> {
    public ChairRenderer(BlockEntityRendererProvider.Context context) {
        super(new ChairModel());
    }

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event){
        event.registerBlockEntityRenderer(BlockEntities.CHAIR_BLOCK_ENTITY.get(), ChairRenderer::new);
    }
}
