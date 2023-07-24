package net.mcczai.bocchitherock.Init;

import net.mcczai.bocchitherock.bocchitherock;
import net.mcczai.bocchitherock.entity.client.armor.box.BoxArmorItem;
import net.mcczai.bocchitherock.entity.client.armor.tshirt.TshirtArmorItem;
import net.mcczai.bocchitherock.item.MidiTestTool;
import net.mcczai.bocchitherock.item.boxitem.BoxBlockItem;
import net.mcczai.bocchitherock.item.fumo.bocchi.BocchiItem;
import net.mcczai.bocchitherock.item.fumo.ikuyo.IkuyoItem;
import net.mcczai.bocchitherock.item.fumo.nijika.NijikaItem;
import net.mcczai.bocchitherock.item.fumo.ruyo.RuyoItem;
import net.mcczai.bocchitherock.item.instrument.bass.BassItem;
import net.mcczai.bocchitherock.item.instrument.drumitem.DrumBlockItem;
import net.mcczai.bocchitherock.item.instrument.guitar.GuitarItem;
import net.mcczai.bocchitherock.item.instrument.guitardc.GuitardcItem;
import net.mcczai.bocchitherock.item.yamahaitem.YamahaBlockItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =DeferredRegister.create(ForgeRegistries.ITEMS, bocchitherock.ID);

    public static final RegistryObject<Item> MIDI_TEST_TOOL = ITEMS.register("midi_test_tool",()->new MidiTestTool(new Item.Properties()));
    public static final RegistryObject<Item> GUITAR = ITEMS.register("guitar",()->new GuitarItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BASS = ITEMS.register("bass",()->new BassItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GUITARDC = ITEMS.register("guitardc",()->new GuitardcItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BOCCHI = ITEMS.register("bocchi",()->new BocchiItem((new Item.Properties().stacksTo(1))));
    public static final RegistryObject<Item> NIJIKA = ITEMS.register("nijika",()->new NijikaItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> IKUYO = ITEMS.register("ikuyo",()->new IkuyoItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> RUYO = ITEMS.register("ruyo",()->new RuyoItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<ArmorItem> TSHIRT = ITEMS.register("tshirt",()->new TshirtArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE,new Item.Properties()));
    public static final RegistryObject<ArmorItem> BOX = ITEMS.register("bocchi_the_box_armor",()->new BoxArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET,new Item.Properties()));

    public static final RegistryObject<Item> DRUM_BLOCK_ITEM = ITEMS.register("drum_block",()->new DrumBlockItem(BlockInit.DRUM_BLOCK.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BOX_BLOCK_ITEM = ITEMS.register("box_block",()->new BoxBlockItem(BlockInit.BOX_BLOCK.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> YAMAHA_BLOCK_ITEM = ITEMS.register("yamaha_block",()->new YamahaBlockItem(BlockInit.YAMAHA_BLOCK.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TEST_BLOCK_ITEM = ITEMS.register("test_block", () -> new BlockItem(BlockInit.TEST_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> TEST = ITEMS.register("test", () -> new Item((new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEat().nutrition(1).saturationMod(2f).build()))));
}
