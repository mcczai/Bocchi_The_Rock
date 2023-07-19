package net.mcczai.bocchitherock.item;

import net.mcczai.bocchitherock.util.MidiPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class MidiTestTool extends Item {
    public static boolean click = false;
    public MidiTestTool(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        click = !click;
        MidiPlayer midiPlayer = new MidiPlayer();
        midiPlayer.MidiPlayer(click);
        return InteractionResultHolder.success(player.getItemInHand(hand));
    }
}
