package net.mcczai.bocchitherock.midi;

import net.mcczai.bocchitherock.bocchitherock;
import net.mcczai.bocchitherock.geo.guitar.GuitarModel;
import net.minecraft.resources.ResourceLocation;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import java.io.File;

public class MidiPlayer {
    private static final File midifile = new File("./midi/test.mid");


    public MidiPlayer(){
        try {
            Sequence sequence = MidiSystem.getSequence(midifile);
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.setSequence(sequence);
            if (!sequencer.isRunning()){
                sequencer.start();
            }
            long t = sequencer.getMicrosecondLength() / 1000;
            Thread.sleep(t);
            if (sequencer.isRunning()){
                sequencer.stop();
            }
            if (sequencer.isOpen()){
                sequencer.close();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
