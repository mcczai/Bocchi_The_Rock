package net.mcczai.bocchitherock.item.fumo.ruyo;

import net.mcczai.bocchitherock.bocchitherock;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class RuyoModel extends GeoModel<RuyoItem> {
    @Override
    public ResourceLocation getModelResource(RuyoItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"geo/ruyo.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(RuyoItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"textures/item/ruyo.png");
    }

    @Override
    public ResourceLocation getAnimationResource(RuyoItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"animations/guitar.animation.json");
    }
}
