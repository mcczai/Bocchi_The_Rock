package net.mcczai.bocchitherock.block.tltsoundbox;

import net.mcczai.bocchitherock.bocchitherock;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class TltSoundBoxModel extends GeoModel<TltSoundBoxEntity> {
    @Override
    public ResourceLocation getModelResource(TltSoundBoxEntity animatable) {
        return new ResourceLocation(bocchitherock.ID,"geo/tlt_sound_box.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(TltSoundBoxEntity animatable) {
        return new ResourceLocation(bocchitherock.ID,"textures/block/tlt_sound_box.png");
    }

    @Override
    public ResourceLocation getAnimationResource(TltSoundBoxEntity animatable) {
        return null;
    }
}
