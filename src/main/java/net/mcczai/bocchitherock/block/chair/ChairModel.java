package net.mcczai.bocchitherock.block.chair;

import net.mcczai.bocchitherock.bocchitherock;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ChairModel extends GeoModel<ChairEntity> {
    @Override
    public ResourceLocation getModelResource(ChairEntity animatable) {
        return new ResourceLocation(bocchitherock.ID,"geo/chair.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ChairEntity animatable) {
        return new ResourceLocation(bocchitherock.ID,"textures/block/chair.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ChairEntity animatable) {
        return null;
    }
}
