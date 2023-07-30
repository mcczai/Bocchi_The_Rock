package net.mcczai.bocchitherock.item.blockitem.chair;

import net.mcczai.bocchitherock.bocchitherock;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ChairBlockItemModel extends GeoModel<ChairBlockItem> {
    @Override
    public ResourceLocation getModelResource(ChairBlockItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"geo/chair.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ChairBlockItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"textures/block/chair.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ChairBlockItem animatable) {
        return null;
    }
}
