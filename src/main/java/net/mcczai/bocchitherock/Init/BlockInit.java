package net.mcczai.bocchitherock.Init;

import net.mcczai.bocchitherock.block.box.BoxBlock;
import net.mcczai.bocchitherock.block.chair.ChairBlock;
import net.mcczai.bocchitherock.block.drum.DrumBlock;
import net.mcczai.bocchitherock.block.guitarsupport.GuitarSupportBlock;
import net.mcczai.bocchitherock.block.starrylight.StarryLightBlock;
import net.mcczai.bocchitherock.block.table.TableBlock;
import net.mcczai.bocchitherock.block.tltsoundbox.TltSoundBoxBlock;
import net.mcczai.bocchitherock.block.yamaha.YamahaBlock;
import net.mcczai.bocchitherock.bocchitherock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS =DeferredRegister.create(ForgeRegistries.BLOCKS, bocchitherock.ID);

    public static final RegistryObject<Block> TEST_BLOCK = BLOCKS.register("test_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));
    public static final RegistryObject<Block> CHESSBOARD_BLOCK = BLOCKS.register("chessboard_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> DRUM_BLOCK = BLOCKS.register("drum_block",()-> new DrumBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));
    public static final RegistryObject<Block> BOX_BLOCK = BLOCKS.register("box_block",()-> new BoxBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));
    public static final RegistryObject<Block> YAMAHA_BLOCK = BLOCKS.register("yamaha_block",()-> new YamahaBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));
    public static final RegistryObject<Block> GUITAR_SUPPORT_BLOCK = BLOCKS.register("guitar_support_block",()-> new GuitarSupportBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));
    public static final RegistryObject<Block> TLT_SOUND_BOX_BLOCK = BLOCKS.register("tlt_sound_box_block",()-> new TltSoundBoxBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));
    public static final RegistryObject<Block> TABLE_BLOCK = BLOCKS.register("table_block",()-> new TableBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));
    public static final RegistryObject<Block> STARRY_LIGHT_BLOCK = BLOCKS.register("starry_light_block",()-> new StarryLightBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)
            .lightLevel((p_50870_) -> {return 13;})));
    public static final RegistryObject<Block> CHAIR_BLOCK = BLOCKS.register("chair_block",()-> new ChairBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));

}
