package net.mcczai.bocchitherock.util;

import com.mojang.logging.LogUtils;
import net.mcczai.bocchitherock.bocchitherock;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;

import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import java.io.File;

public class MidiPlayer {

    private static final ResourceLocation midiflie = new ResourceLocation(bocchitherock.ID,"midi/test.mid");

    public static  MidiDevice midid;
    public static Logger LOGGER = LogUtils.getLogger();
    public static long time = 0;
    public static Sequence sequence;
    public static Sequencer sequencer;
    public static File midif = new MidiFileResourceLocation().getLocalResource();

    //Synthesizer midis = (Synthesizer) midid;  //创建合成器至默认midi设备

    public void MidiPlayer(boolean click) {
        if (click) {
            try {
                sequence = MidiSystem.getSequence(midif); //加载midi文件至播放序列
                sequencer = MidiSystem.getSequencer();  //新建一个播放器
                sequencer.open();
                sequencer.setSequence(sequence);
                if (!sequencer.isRunning()) {
                    sequencer.start();
                    LOGGER.info("sequencer RUN");
                }
                time = sequencer.getMicrosecondLength() / 1000;
            } catch (Exception e) {
                e.printStackTrace();
                LOGGER.warn("midi err");
            }
        }else {
            try {
                if (sequencer.isRunning()) {
                    sequencer.stop();
                    LOGGER.info("sequencer STOP");
                }
                if (sequencer.isOpen()) {
                    sequencer.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
                LOGGER.warn("midi err");
            }
        }
    }


}
