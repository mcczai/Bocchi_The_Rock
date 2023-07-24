package net.mcczai.bocchitherock.item.boxitem;

import software.bernie.geckolib.renderer.GeoItemRenderer;

public class BoxItemRenderer extends GeoItemRenderer<BoxBlockItem> {

    public BoxItemRenderer() {
        super(new BoxItemModel());
    }
}
