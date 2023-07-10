package net.mcczai.bocchitherock.registry;

import net.mcczai.bocchitherock.bocchitherock;
import net.mcczai.bocchitherock.entity.client.DrumEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, bocchitherock.ID);

    /*public static final RegistryObject<EntityType<DrumEntity>> DRUM_SIT = ENTITY_TYPES.register("drum_sit",()-> EntityType.Builder.<DrumEntity>of(DrumEntity::new, MobCategory.MISC)
            .setTrackingRange(256)
            .setUpdateInterval(20)
            .sized(0.0001F, 0.0001F)
            .build(bocchitherock.ID + ":drum_sit"));*/

}
