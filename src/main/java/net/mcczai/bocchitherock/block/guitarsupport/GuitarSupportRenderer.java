package net.mcczai.bocchitherock.block.guitarsupport;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.mcczai.bocchitherock.Init.BlockEntities;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.renderer.GeoBlockRenderer;
import software.bernie.geckolib.util.RenderUtils;

public class GuitarSupportRenderer extends GeoBlockRenderer<GuitarSupportEntity>  {
    public ItemEntity renderEntity;

    public GuitarSupportRenderer(BlockEntityRendererProvider.Context context){
        super(new GuitarSupportModel());
    }

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event){

        event.registerBlockEntityRenderer(BlockEntities.GUITAR_SUPPORT_BLOCK_ENTITY.get(), GuitarSupportRenderer::new);
    }

    @Override
    public void renderFinal(PoseStack poseStack, GuitarSupportEntity animatable, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer,
                            float partialTick, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        CoreGeoBone frame = model.getBone("bone").orElse(null);
        if (frame != null && animatable.getStack() != null) {
            double x = animatable.getBlockPos().getX();
            double y = animatable.getBlockPos().getY();
            double z = animatable.getBlockPos().getZ();
            if (renderEntity == null || !ItemStack.matches(renderEntity.getItem(), animatable.getStack())) {
                renderEntity = new ItemEntity(animatable.getLevel(), x, y, z, animatable.getStack());
            }
            poseStack.pushPose();
            RenderUtils.translateMatrixToBone(poseStack, frame);
            poseStack.translate(0.5, +0.5, 0.5);
            poseStack.scale(0.75f, 0.75f, 0.75f);
            ItemStack itemstack = renderEntity.getItem();
            Minecraft.getInstance().getItemRenderer().renderStatic(itemstack, ItemDisplayContext.GROUND, packedLight, OverlayTexture.NO_OVERLAY, poseStack, bufferSource, animatable.getLevel(), (int) animatable.getBlockPos().asLong());
            poseStack.popPose();
            //itemStack, ItemTransforms.TransformType.GUI, getLightLevel(animatable.getLevel(),
            //                            animatable.getBlockPos()),
            //                    OverlayTexture.NO_OVERLAY, poseStack, bufferSource, 1);
            //itemStack,ItemDisplayContext.GROUND, packedLight, OverlayTexture.NO_OVERLAY, poseStack, bufferSource, animatable.getLevel(), (int) animatable.getBlockPos()
            // .asLong()
        }
    }
}
