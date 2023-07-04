package net.mcczai.bocchitherock.block.entity.client.drum;

import net.mcczai.bocchitherock.bocchitherock;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class DrumModel extends GeoModel<DrumBlockEntity> {

    @Override
    public ResourceLocation getModelResource(DrumBlockEntity animatable) {
        return new ResourceLocation(bocchitherock.ID,"geo/drum.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DrumBlockEntity animatable) {
        return new ResourceLocation(bocchitherock.ID,"textures/block/drum.png");
    }

    @Override
    public ResourceLocation getAnimationResource(DrumBlockEntity animatable) {
        return new ResourceLocation(bocchitherock.ID,"animations/drum.animation.json");
    }
}
