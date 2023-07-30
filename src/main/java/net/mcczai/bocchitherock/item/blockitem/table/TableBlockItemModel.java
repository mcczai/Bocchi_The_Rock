package net.mcczai.bocchitherock.item.blockitem.table;

import net.mcczai.bocchitherock.bocchitherock;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class TableBlockItemModel extends GeoModel<TableBlockItem> {
    @Override
    public ResourceLocation getModelResource(TableBlockItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"geo/table.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(TableBlockItem animatable) {
        return new ResourceLocation(bocchitherock.ID,"textures/block/table.png");
    }

    @Override
    public ResourceLocation getAnimationResource(TableBlockItem animatable) {
        return null;
    }
}
