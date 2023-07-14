package net.mcczai.bocchitherock.registry;

import net.mcczai.bocchitherock.bocchitherock;
import net.mcczai.bocchitherock.entity.client.DrumEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, bocchitherock.ID);

    public static final RegistryObject<EntityType<DrumEntity>> DRUM_SIT = register("drum_set", EntityType.Builder.<DrumEntity>of((type, world) ->
            new DrumEntity(world), MobCategory.MISC).sized(0.0F, 0.0F).setCustomClientFactory((spawnEntity, world) -> new DrumEntity(world)).fireImmune());

    private static <T extends Entity> RegistryObject<EntityType<T>> register(String name, EntityType.Builder<T> builder)
    {
        return ENTITY_TYPES.register(name, () -> builder.build(name));
    }

}
