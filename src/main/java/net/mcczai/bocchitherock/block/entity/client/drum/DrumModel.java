package net.mcczai.bocchitherock.block.entity.client.drum;

import net.mcczai.bocchitherock.block.entity.AnimateBlockEntity;
import net.mcczai.bocchitherock.bocchitherock;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class DrumModel extends GeoModel<AnimateBlockEntity> {

    @Override
    public ResourceLocation getModelResource(AnimateBlockEntity animatable) {
        return new ResourceLocation(bocchitherock.ID,"geo/drum.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AnimateBlockEntity animatable) {
        return new ResourceLocation(bocchitherock.ID,"textures/block/drum.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AnimateBlockEntity animatable) {
        return new ResourceLocation(bocchitherock.ID,"animations/drum.animation.json");
    }
}
