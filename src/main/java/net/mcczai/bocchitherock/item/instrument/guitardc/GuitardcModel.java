package net.mcczai.bocchitherock.item.instrument.guitardc;

import net.mcczai.bocchitherock.bocchitherock;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class GuitardcModel extends GeoModel<GuitardcItem> {
    @Override
    public ResourceLocation getModelResource(GuitardcItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"geo/guitardc.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GuitardcItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"textures/item/guitardc.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GuitardcItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"animations/guitar.animation.json");
    }
}
