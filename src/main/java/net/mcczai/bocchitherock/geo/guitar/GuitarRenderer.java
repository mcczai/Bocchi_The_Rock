package net.mcczai.bocchitherock.geo.guitar;

import software.bernie.geckolib.renderer.GeoItemRenderer;

public class GuitarRenderer extends GeoItemRenderer<GuitarItem> {
    public GuitarRenderer(){
        super(new GuitarModel());
    }
}
