package net.mcczai.bocchitherock.item.client.drumitem;

import net.mcczai.bocchitherock.bocchitherock;
import net.mcczai.bocchitherock.item.custom.AnimateBlockItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class DrumItemModel extends GeoModel<AnimateBlockItem> {

    @Override
    public ResourceLocation getModelResource(AnimateBlockItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"geo/drum.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AnimateBlockItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"textures/block/drum.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AnimateBlockItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"animations/drum.animation.json");
    }
}
