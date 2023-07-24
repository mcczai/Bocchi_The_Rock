package net.mcczai.bocchitherock.item.yamahaitem;

import net.mcczai.bocchitherock.bocchitherock;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class YamahaItemModel extends GeoModel<YamahaBlockItem> {
    @Override
    public ResourceLocation getModelResource(YamahaBlockItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"geo/yamaha.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(YamahaBlockItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"textures/block/yamaha.png");
    }

    @Override
    public ResourceLocation getAnimationResource(YamahaBlockItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"animations/drum.animation.json");
    }
}
