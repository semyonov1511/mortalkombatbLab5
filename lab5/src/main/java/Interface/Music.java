package Interface;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Music {
    public static void startMusic(){
        try {
            File soundFile = new File("crab.wav");
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);
            try (
                Clip clip = AudioSystem.getClip()) {
                clip.open(ais);
                clip.setFramePosition(0);
                clip.start();
                Thread.sleep(clip.getMicrosecondLength() / 1000);
                clip.stop();
            }
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException | InterruptedException exc) {
            exc.printStackTrace();
        }
    }
}
