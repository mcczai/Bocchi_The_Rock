package net.mcczai.bocchitherock.item.client.drumitem;

import net.mcczai.bocchitherock.item.custom.AnimateBlockItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class DrumItemRenderer extends GeoItemRenderer<AnimateBlockItem> {

    public DrumItemRenderer() {
        super(new DrumItemModel());
    }
}
