package net.mcczai.bocchitherock.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import net.mcczai.bocchitherock.entity.client.DrumEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

public class DrumSitRenderer extends EntityRenderer<DrumEntity> {

    public DrumSitRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public ResourceLocation getTextureLocation(DrumEntity entity) {
        return null;
    }

    @Override
    protected void renderNameTag(DrumEntity entity, Component component, PoseStack poseStack, MultiBufferSource source, int i) {
    }
}
