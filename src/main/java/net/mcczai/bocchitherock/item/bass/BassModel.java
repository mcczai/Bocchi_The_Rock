package net.mcczai.bocchitherock.item.bass;

import net.mcczai.bocchitherock.bocchitherock;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BassModel extends GeoModel<BassItem> {
    @Override
    public ResourceLocation getModelResource(BassItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"geo/bass.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BassItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"textures/item/bass.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BassItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"animations/guitar.animation.json");
    }
}
