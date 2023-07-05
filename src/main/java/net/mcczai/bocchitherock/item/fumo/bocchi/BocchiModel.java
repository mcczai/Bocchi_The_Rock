package net.mcczai.bocchitherock.item.fumo.bocchi;

import net.mcczai.bocchitherock.bocchitherock;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BocchiModel extends GeoModel<BocchiItem> {
    @Override
    public ResourceLocation getModelResource(BocchiItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"geo/bocchi.json");
    }

    @Override
    public ResourceLocation getTextureResource(BocchiItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"textures/item/bocchi.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BocchiItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"animations/guitar.animation.json");
    }
}
