package net.mcczai.bocchitherock.config;

import net.mcczai.bocchitherock.bocchitherock;
import net.minecraftforge.common.ForgeConfigSpec;

public class ClientConfig {
    public static final String MIDI_SYNTH_CATEGORY_NAME = "MIDI Synth";
    public static final String MIDI_PLAYER_CATEGORY_NAME = "MIDI Player";

    public ForgeConfigSpec.ConfigValue<String> soundfontPath;
    public ForgeConfigSpec.ConfigValue<String> playlistFolderPath;

    public ClientConfig(ForgeConfigSpec.Builder builder){
        builder.push(MIDI_PLAYER_CATEGORY_NAME);
        playlistFolderPath = builder.comment("Optional full path to a folder containing MIDI files to be used by the MIDI Player. See guide book for more information.")
                .translation(bocchitherock.ID + ".config.midi.player.playlist.path")
                .define("playlistFolderPath", "");
        builder.pop();

        builder.push(MIDI_SYNTH_CATEGORY_NAME);
        soundfontPath = builder.comment("Optional full path to an SF2 format SoundFont to be used by the MIDI Synthesizer. See project page for more information.")
                .translation(bocchitherock.ID + ".config.midi.synth.soundfont.path")
                .define("soundfontPath", "");
        builder.pop();
    }
}
