package net.mcczai.bocchitherock.block.tltsoundbox;

import net.mcczai.bocchitherock.Init.BlockEntities;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class TltSoundBoxRenderer extends GeoBlockRenderer<TltSoundBoxEntity> {
    public TltSoundBoxRenderer(BlockEntityRendererProvider.Context context) {
        super(new TltSoundBoxModel());
    }
    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event){
        event.registerBlockEntityRenderer(BlockEntities.TLT_SOUND_BOX_BLOCK_ENTITY.get(), TltSoundBoxRenderer::new);
    }
}
