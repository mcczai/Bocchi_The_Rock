package net.mcczai.bocchitherock.item.blockitem.tltsoundbox;

import net.mcczai.bocchitherock.bocchitherock;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class TltSoundBoxBlockItemModel extends GeoModel<TltSoundBoxBlockItem> {
    @Override
    public ResourceLocation getModelResource(TltSoundBoxBlockItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"geo/tlt_sound_box.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(TltSoundBoxBlockItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"textures/block/tlt_sound_box.png");
    }

    @Override
    public ResourceLocation getAnimationResource(TltSoundBoxBlockItem animatable) {
        return null;
    }
}
