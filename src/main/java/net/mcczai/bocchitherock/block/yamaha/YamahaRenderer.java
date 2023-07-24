package net.mcczai.bocchitherock.block.yamaha;

import net.mcczai.bocchitherock.Init.BlockEntities;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class YamahaRenderer extends GeoBlockRenderer<YamahaBlockEntity> {
    public YamahaRenderer(BlockEntityRendererProvider.Context context){
        super(new YamahaModel());
    }

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event){
        event.registerBlockEntityRenderer(BlockEntities.YAMAHA_BLOCK_ENTITY.get(), YamahaRenderer::new);
    }
}
