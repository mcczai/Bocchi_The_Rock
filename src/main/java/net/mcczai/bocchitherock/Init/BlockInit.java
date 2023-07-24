package net.mcczai.bocchitherock.Init;

import net.mcczai.bocchitherock.block.box.BoxBlock;
import net.mcczai.bocchitherock.block.drum.DrumBlock;
import net.mcczai.bocchitherock.block.yamaha.YamahaBlock;
import net.mcczai.bocchitherock.bocchitherock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS =DeferredRegister.create(ForgeRegistries.BLOCKS, bocchitherock.ID);

    public static final RegistryObject<Block> TEST_BLOCK = BLOCKS.register("test_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));
    public static final RegistryObject<Block> DRUM_BLOCK = BLOCKS.register("drum_block",()-> new DrumBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));
    public static final RegistryObject<Block> BOX_BLOCK = BLOCKS.register("box_block",()-> new BoxBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));
    public static final RegistryObject<Block> YAMAHA_BLOCK = BLOCKS.register("yamaha_block",()-> new YamahaBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));

}
