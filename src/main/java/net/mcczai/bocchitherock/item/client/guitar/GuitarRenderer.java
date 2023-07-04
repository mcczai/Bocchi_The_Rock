package net.mcczai.bocchitherock.item.client.guitar;

import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import software.bernie.geckolib.renderer.GeoItemRenderer;

import java.util.function.Consumer;

public class GuitarRenderer extends GeoItemRenderer<GuitarItem> {
    public GuitarRenderer(){
        super(new GuitarModel());
    }

    public void initializeClient(Consumer<IClientItemExtensions> consumer){
        consumer.accept((new IClientItemExtensions() {
            private GuitarRenderer renderer = null;
            public BlockEntityWithoutLevelRenderer getItemStackRenderer(){
                if(this.renderer == null)
                    this.renderer =new GuitarRenderer();

                return renderer;
            }
        }));
    }
}
