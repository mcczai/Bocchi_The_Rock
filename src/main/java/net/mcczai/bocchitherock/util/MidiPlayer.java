package net.mcczai.bocchitherock.util;

import com.mojang.logging.LogUtils;
import net.mcczai.bocchitherock.bocchitherock;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;

import javax.sound.midi.*;
import java.io.File;

public class MidiPlayer {

    private static final ResourceLocation midiflie = new ResourceLocation(bocchitherock.ID,"midi/test.mid");
    private static final File midif = new File("./midi/test.mid");

    public static  MidiDevice midid;
    public static Logger LOGGER = LogUtils.getLogger();
    public static long time = 0;
    public static Sequence sequence;
    public static Sequencer sequencer;

    Synthesizer midis = (Synthesizer) midid;  //创建合成器至默认midi设备

    public void MidiPlayer(boolean click, Sequence sequence, Sequencer sequencer) {
        if (click) {
            try {
                sequence = MidiSystem.getSequence(midif); //加载midi文件至播放序列
                LOGGER.info("midif OK");
                sequencer = MidiSystem.getSequencer();  //新建一个播放器
                LOGGER.info("sequencer OK");
                sequencer.open();
                LOGGER.info("sequencer OPEN");
                sequencer.setSequence(sequence);
                LOGGER.info("midif in sequencer");
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
                    LOGGER.info("sequencer CLOSE");
                }
            }catch (Exception e) {
                e.printStackTrace();
                LOGGER.warn("midi err");
            }
        }
    }


}
