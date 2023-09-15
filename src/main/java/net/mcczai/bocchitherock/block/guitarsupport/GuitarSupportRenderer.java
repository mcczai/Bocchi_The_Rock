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
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import org.joml.Quaternionf;
import com.mojang.math.Axis;
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


   /* @Override
    public void renderFinal(PoseStack poseStack, GuitarSupportEntity BlockEntity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer,
                            float partialTick, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        ItemRenderer itemRenderer = Minecraft.getInstance().getItemRenderer();
        ItemStack itemStack = BlockEntity.getRenderStack();
        poseStack.pushPose();
        poseStack.translate(0.5f, 0.65f, 0.5f);
        poseStack.scale(0.25f, 0.25f, 0.25f);

        switch (BlockEntity.getBlockState().getValue(GuitarSupportBlock.FACING)) {
            case NORTH -> poseStack.mulPose(Axis.ZP.rotationDegrees(0));
            case EAST -> poseStack.mulPose((Axis.ZP.rotationDegrees(90)));
            case SOUTH -> poseStack.mulPose((Axis.ZP.rotationDegrees(180)));
            case WEST -> poseStack.mulPose((Axis.ZP.rotationDegrees(270)));
        }
        itemRenderer.renderStatic(itemStack, ItemDisplayContext.GUI, packedLight,OverlayTexture.NO_OVERLAY, poseStack, bufferSource,BlockEntity.getLevel(), 1);
        poseStack.popPose();

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
            poseStack.translate(0.5, 0.5, 0.5);
            poseStack.scale(0.75f, 0.75f, 0.75f);
            ItemStack itemstack = renderEntity.getItem();
            Minecraft.getInstance().getItemRenderer().renderStatic(itemstack, ItemDisplayContext.GROUND, packedLight, OverlayTexture.NO_OVERLAY, poseStack, bufferSource, animatable.getLevel(), (int) animatable.getBlockPos().asLong());
            poseStack.popPose();
        }
    }*/

}
