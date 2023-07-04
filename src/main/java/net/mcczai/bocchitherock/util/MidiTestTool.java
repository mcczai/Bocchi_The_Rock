package net.mcczai.bocchitherock.util;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class MidiTestTool {
    private final InteractionHand hand;
    private final Player player;
    private final ItemStack item;

    public MidiTestTool(InteractionHand hand, Player player, ItemStack item) {
        this.hand = hand;
        this.player = player;
        this.item = item;
    }

    public InteractionHand getHand(){
        return hand;
    }
    public Player getPlayer(){
        return player;
    }
    public ItemStack getItemS(){
        return item;
    }
}
