package net.mcczai.bocchitherock.item.blockitem.chair;

import software.bernie.geckolib.renderer.GeoItemRenderer;

public class ChairBlockItemRenderer extends GeoItemRenderer<ChairBlockItem> {
    public ChairBlockItemRenderer() {
        super(new ChairBlockItemModel());
    }
}
