package net.mcczai.bocchitherock.entity.client.armor.box;

import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class BoxArmorRenderer extends GeoArmorRenderer<BoxArmorItem> {
    public BoxArmorRenderer() {
        super(new BoxArmorModel());
    }
}
