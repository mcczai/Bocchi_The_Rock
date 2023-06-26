package net.mcczai.bocchitherock.registry;

import net.mcczai.bocchitherock.bocchitherock;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =DeferredRegister.create(ForgeRegistries.ITEMS, bocchitherock.ID);

    public static final RegistryObject<Item> MIDI_TEST_TOOL = ITEMS.register("midi_test_tool",()->new Item())
    public static final RegistryObject<Item> TEST_BLOCK_ITEM = ITEMS.register("test_block", () -> new BlockItem(BlockInit.TEST_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> TEST = ITEMS.register("test", () -> new Item((new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEat().nutrition(1).saturationMod(2f).build()))));
}
