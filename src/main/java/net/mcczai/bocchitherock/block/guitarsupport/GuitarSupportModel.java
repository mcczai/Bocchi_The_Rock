package net.mcczai.bocchitherock.block.guitarsupport;

import net.mcczai.bocchitherock.bocchitherock;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class GuitarSupportModel extends GeoModel<GuitarSupportEntity> {
    @Override
    public ResourceLocation getModelResource(GuitarSupportEntity animatable) {
        return new ResourceLocation(bocchitherock.ID,"geo/guitar_support.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GuitarSupportEntity animatable) {
        return new ResourceLocation(bocchitherock.ID,"textures/block/guitar_support.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GuitarSupportEntity animatable) {
        return new ResourceLocation(bocchitherock.ID,"animations/drum.animation.json");
    }
}
