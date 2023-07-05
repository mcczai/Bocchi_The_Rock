package net.mcczai.bocchitherock.item.instrument.guitar;

import net.mcczai.bocchitherock.bocchitherock;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class GuitarModel extends GeoModel<GuitarItem> {

    @Override
    public ResourceLocation getModelResource(GuitarItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"geo/guitar.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GuitarItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"textures/item/guitar.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GuitarItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"animations/guitar.animation.json");
    }
}
