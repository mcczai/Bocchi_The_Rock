package net.mcczai.bocchitherock.item.blockitem.boxitem;

import net.mcczai.bocchitherock.bocchitherock;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BoxItemModel extends GeoModel<BoxBlockItem> {
    @Override
    public ResourceLocation getModelResource(BoxBlockItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"geo/bocchi_paper_box.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BoxBlockItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"textures/block/box.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BoxBlockItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"animations/drum.animation.json");
    }
}
