package net.mcczai.bocchitherock.block.table;

import net.mcczai.bocchitherock.Init.BlockEntities;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class TableBlockRenderer extends GeoBlockRenderer<TableBlockEntity> {
    public TableBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new TableBlockModel());
    }

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event){
        event.registerBlockEntityRenderer(BlockEntities.TABLE_BLOCK_ENTITY.get(), TableBlockRenderer::new);
    }
}
