package net.mcczai.bocchitherock.util;


import java.io.File;
import java.net.URL;

public class MidiFileResourceLocation {
    public File getLocalResource(){
        URL midiurl = getClass().getResource("/assets/bocchitherock/midi/test.mid");
        File midifile = new File(midiurl.getFile());
        return midifile;
    }
}
