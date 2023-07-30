package net.mcczai.bocchitherock.item.guitarsupportitem;

import net.mcczai.bocchitherock.bocchitherock;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class GuitarSupportBlockItemModel extends GeoModel<GuitarSupportItem> {
    @Override
    public ResourceLocation getModelResource(GuitarSupportItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"geo/guitar_support.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GuitarSupportItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"textures/block/guitar_support.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GuitarSupportItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"animations/drum.animation.json");
    }
}
