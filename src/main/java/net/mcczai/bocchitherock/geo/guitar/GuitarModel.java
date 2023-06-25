package net.mcczai.bocchitherock.geo.guitar;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.GeckoLib;
import software.bernie.geckolib.model.GeoModel;

public class GuitarModel extends GeoModel<GuitarItem> {
    private static final ResourceLocation modelPath = new ResourceLocation(GeckoLib.MOD_ID,"geo/guitar.geo.json");
    private static final ResourceLocation texturePath = new ResourceLocation(GeckoLib.MOD_ID,"textures/item/guitar.png");
    private static final ResourceLocation animationPath = new ResourceLocation(GeckoLib.MOD_ID,"animations/guitar.animation.json");


    public ResourceLocation getModelPath(GuitarModel animatable){return modelPath;}
    public ResourceLocation getTexturePath(GuitarModel animatable){return texturePath;}
    public ResourceLocation getAnimationPath(GuitarModel animatable){return animationPath;}

    @Override
    public ResourceLocation getModelResource(GuitarItem animatable) {
        return null;
    }

    @Override
    public ResourceLocation getTextureResource(GuitarItem animatable) {
        return null;
    }

    @Override
    public ResourceLocation getAnimationResource(GuitarItem animatable) {
        return null;
    }
}
