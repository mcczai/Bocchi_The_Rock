package net.mcczai.bocchitherock.block.yamaha;

import net.mcczai.bocchitherock.bocchitherock;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class YamahaModel extends GeoModel<YamahaBlockEntity> {
    @Override
    public ResourceLocation getModelResource(YamahaBlockEntity animatable) {
        return new ResourceLocation(bocchitherock.ID,"geo/yamaha.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(YamahaBlockEntity animatable) {
        return new ResourceLocation(bocchitherock.ID,"textures/block/yamaha.png");
    }

    @Override
    public ResourceLocation getAnimationResource(YamahaBlockEntity animatable) {
        return new ResourceLocation(bocchitherock.ID,"animations/drum.animation.json");
    }
}
