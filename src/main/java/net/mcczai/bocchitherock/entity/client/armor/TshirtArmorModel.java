package net.mcczai.bocchitherock.entity.client.armor;

import net.mcczai.bocchitherock.bocchitherock;
import net.mcczai.bocchitherock.item.custom.TshirtArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class TshirtArmorModel extends GeoModel<TshirtArmorItem> {
    @Override
    public ResourceLocation getModelResource(TshirtArmorItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"geo/tshirt.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(TshirtArmorItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"textures/item/armor/tshirt.png");
    }

    @Override
    public ResourceLocation getAnimationResource(TshirtArmorItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"animations/tshirt.animation.json");
    }
}
