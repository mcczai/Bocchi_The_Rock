package net.mcczai.bocchitherock.block.starrylight;

import net.mcczai.bocchitherock.bocchitherock;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class StarryLightModel extends GeoModel<StarryLightEntity> {
    @Override
    public ResourceLocation getModelResource(StarryLightEntity animatable) {
        return new ResourceLocation(bocchitherock.ID,"geo/starry_light.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(StarryLightEntity animatable) {
        return new ResourceLocation(bocchitherock.ID,"textures/block/starry_light.png");
    }

    @Override
    public ResourceLocation getAnimationResource(StarryLightEntity animatable) {
        return null;
    }
}
