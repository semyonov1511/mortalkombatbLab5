package com.mycompany.lab5;

import Interface.JFrames;
import Interface.Music;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Lab5 {

    public static void main(String[] args) throws LineUnavailableException, UnsupportedAudioFileException {
        JFrames app = new JFrames();
        app.setVisible(true);
        Music.startMusic();
    }
}
