package com.mycompany.lab5;

import Interface.JFrames;
import Interface.Music;

public class Lab5 {

    public static void main(String[] args){
        JFrames app = new JFrames();
        app.setVisible(true);
        Music.startMusic();
    }
}
