package net.mcczai.bocchitherock.block.box;

import net.mcczai.bocchitherock.bocchitherock;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BoxModel extends GeoModel<BoxBlockEntity> {
    @Override
    public ResourceLocation getModelResource(BoxBlockEntity animatable) {
        return new ResourceLocation(bocchitherock.ID,"geo/bocchi_paper_box.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BoxBlockEntity animatable) {
        return new ResourceLocation(bocchitherock.ID,"textures/block/box.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BoxBlockEntity animatable) {
        return new ResourceLocation(bocchitherock.ID,"animations/drum.animation.json");
    }
}
