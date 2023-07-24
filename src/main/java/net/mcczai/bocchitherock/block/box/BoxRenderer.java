package net.mcczai.bocchitherock.block.box;

import net.mcczai.bocchitherock.Init.BlockEntities;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class BoxRenderer extends GeoBlockRenderer<BoxBlockEntity> {
    public BoxRenderer(BlockEntityRendererProvider.Context context){
        super(new BoxModel());
    }

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event){
        event.registerBlockEntityRenderer(BlockEntities.BOX_BLOCK_ENTITY.get(), BoxRenderer::new);
    }
}
