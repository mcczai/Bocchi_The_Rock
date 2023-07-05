package net.mcczai.bocchitherock.item.fumo.nijika;

import net.mcczai.bocchitherock.bocchitherock;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class NijikaModel extends GeoModel<NijikaItem> {
    @Override
    public ResourceLocation getModelResource(NijikaItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"geo/nijika.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(NijikaItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"textures/item/nijika.png");
    }

    @Override
    public ResourceLocation getAnimationResource(NijikaItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"animations/guitar.animation.json");
    }
}
