package net.mcczai.bocchitherock.Init;

import net.mcczai.bocchitherock.block.box.BoxBlockEntity;
import net.mcczai.bocchitherock.block.chair.ChairEntity;
import net.mcczai.bocchitherock.block.drum.DrumBlockEntity;
import net.mcczai.bocchitherock.block.guitarsupport.GuitarSupportEntity;
import net.mcczai.bocchitherock.block.starrylight.StarryLightEntity;
import net.mcczai.bocchitherock.block.table.TableBlockEntity;
import net.mcczai.bocchitherock.block.tltsoundbox.TltSoundBoxEntity;
import net.mcczai.bocchitherock.block.yamaha.YamahaBlockEntity;
import net.mcczai.bocchitherock.bocchitherock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, bocchitherock.ID);

    public static final RegistryObject<BlockEntityType<DrumBlockEntity>> DRUM_ANIMATED_BLOCK_ENTITY = BLOCK_ENTITIES.register("drum_animated_block_entity",() ->
            BlockEntityType.Builder.of(DrumBlockEntity::new,BlockInit.DRUM_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<BoxBlockEntity>> BOX_BLOCK_ENTITY = BLOCK_ENTITIES.register("box_block_entity",() ->
            BlockEntityType.Builder.of(BoxBlockEntity::new,BlockInit.BOX_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<YamahaBlockEntity>> YAMAHA_BLOCK_ENTITY = BLOCK_ENTITIES.register("yamaha_block_entity",() ->
            BlockEntityType.Builder.of(YamahaBlockEntity::new,BlockInit.YAMAHA_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<GuitarSupportEntity>> GUITAR_SUPPORT_BLOCK_ENTITY = BLOCK_ENTITIES.register("guitar_support_block_entity",() ->
            BlockEntityType.Builder.of(GuitarSupportEntity::new,BlockInit.GUITAR_SUPPORT_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<TltSoundBoxEntity>> TLT_SOUND_BOX_BLOCK_ENTITY = BLOCK_ENTITIES.register("tlt_sound_box_block_entity",() ->
            BlockEntityType.Builder.of(TltSoundBoxEntity::new,BlockInit.TLT_SOUND_BOX_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<TableBlockEntity>> TABLE_BLOCK_ENTITY = BLOCK_ENTITIES.register("table_block_entity",() ->
            BlockEntityType.Builder.of(TableBlockEntity::new,BlockInit.TABLE_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<StarryLightEntity>> STARRY_LIGHT_BLOCK_ENTITY = BLOCK_ENTITIES.register("starry_light_block_entity",() ->
            BlockEntityType.Builder.of(StarryLightEntity::new,BlockInit.STARRY_LIGHT_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<ChairEntity>> CHAIR_BLOCK_ENTITY = BLOCK_ENTITIES.register("chair_block_entity",() ->
            BlockEntityType.Builder.of(ChairEntity::new,BlockInit.CHAIR_BLOCK.get()).build(null));
}
