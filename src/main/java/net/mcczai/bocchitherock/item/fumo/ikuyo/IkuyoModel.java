package net.mcczai.bocchitherock.item.fumo.ikuyo;

import net.mcczai.bocchitherock.bocchitherock;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class IkuyoModel extends GeoModel<IkuyoItem> {
    @Override
    public ResourceLocation getModelResource(IkuyoItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"geo/ikuyo.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(IkuyoItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"textures/item/ikuyo.png");
    }

    @Override
    public ResourceLocation getAnimationResource(IkuyoItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"animations/guitar.animation.json");
    }
}
