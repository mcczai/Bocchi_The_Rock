package net.mcczai.bocchitherock.entity.client.armor;

import net.mcczai.bocchitherock.item.custom.TshirtArmorItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class TshirtArmorRenderer extends GeoArmorRenderer<TshirtArmorItem> {
    public TshirtArmorRenderer() {
        super(new TshirtArmorModel());

    }
}
