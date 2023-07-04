package net.mcczai.bocchitherock.registry;

import net.mcczai.bocchitherock.block.entity.client.drum.DrumBlockEntity;
import net.mcczai.bocchitherock.bocchitherock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, bocchitherock.ID);

    public static final RegistryObject<BlockEntityType<DrumBlockEntity>> DRUM_ANIMATED_BLOCK_ENTITY = BLOCK_ENTITIES.register("drum_animated_block_entity",() ->
            BlockEntityType.Builder.of(DrumBlockEntity::new,BlockInit.DRUM_BLOCK.get()).build(null));

}
