package net.mcczai.bocchitherock.entity;

import net.mcczai.bocchitherock.entity.client.DrumEntity;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class DrumSitRenderer extends EntityRenderer<DrumEntity> {

    protected DrumSitRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public ResourceLocation getTextureLocation(DrumEntity entity) {
        return null;
    }


}
