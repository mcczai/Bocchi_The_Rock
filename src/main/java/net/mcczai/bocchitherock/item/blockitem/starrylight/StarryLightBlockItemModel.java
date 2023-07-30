package net.mcczai.bocchitherock.item.blockitem.starrylight;

import net.mcczai.bocchitherock.bocchitherock;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class StarryLightBlockItemModel extends GeoModel<StarryLightBlockItem> {
    @Override
    public ResourceLocation getModelResource(StarryLightBlockItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"geo/starry_light.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(StarryLightBlockItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"textures/block/starry_light.png");
    }

    @Override
    public ResourceLocation getAnimationResource(StarryLightBlockItem animatable) {
        return null;
    }
}
