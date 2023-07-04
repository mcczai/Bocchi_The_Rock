package net.mcczai.bocchitherock.item.drumitem;

import net.mcczai.bocchitherock.bocchitherock;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class DrumItemModel extends GeoModel<DrumBlockItem> {

    @Override
    public ResourceLocation getModelResource(DrumBlockItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"geo/drum.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DrumBlockItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"textures/block/drum.png");
    }

    @Override
    public ResourceLocation getAnimationResource(DrumBlockItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"animations/drum.animation.json");
    }
}
