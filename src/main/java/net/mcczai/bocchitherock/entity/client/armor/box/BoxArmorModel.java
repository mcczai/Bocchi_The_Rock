package net.mcczai.bocchitherock.entity.client.armor.box;

import net.mcczai.bocchitherock.bocchitherock;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BoxArmorModel extends GeoModel<BoxArmorItem> {
    @Override
    public ResourceLocation getModelResource(BoxArmorItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"geo/bocchi_paper_box_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BoxArmorItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"textures/item/armor/box.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BoxArmorItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"animations/tshirt.animation.json");
    }
}
