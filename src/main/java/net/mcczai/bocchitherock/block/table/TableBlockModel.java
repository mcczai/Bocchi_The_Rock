package net.mcczai.bocchitherock.block.table;

import net.mcczai.bocchitherock.bocchitherock;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class TableBlockModel extends GeoModel<TableBlockEntity> {
    @Override
    public ResourceLocation getModelResource(TableBlockEntity animatable) {
        return new ResourceLocation(bocchitherock.ID,"geo/table.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(TableBlockEntity animatable) {
        return new ResourceLocation(bocchitherock.ID,"textures/block/table.png");
    }

    @Override
    public ResourceLocation getAnimationResource(TableBlockEntity animatable) {
        return null;
    }
}
