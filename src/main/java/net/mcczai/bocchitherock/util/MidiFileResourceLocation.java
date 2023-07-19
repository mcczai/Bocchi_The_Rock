package net.mcczai.bocchitherock.util;

import com.sun.tools.javac.Main;

import java.net.URL;

public class MidiFileResourceLocation {
    public void getLocalResource(){
        URL midifile = Main.class.getClassLoader().getResource("/assets/bocchitherock/midi/test.mid");
    }
}
