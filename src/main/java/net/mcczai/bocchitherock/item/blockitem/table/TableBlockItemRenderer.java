package net.mcczai.bocchitherock.item.blockitem.table;

import software.bernie.geckolib.renderer.GeoItemRenderer;

public class TableBlockItemRenderer extends GeoItemRenderer<TableBlockItem> {
    public TableBlockItemRenderer() {
        super(new TableBlockItemModel());
    }
}
