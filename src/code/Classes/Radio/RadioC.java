package code.Classes.Radio;

import code.Interfaces.Radio;

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

public class RadioC implements Radio {
    URL url = null;

    /**
     * Permet de lancer une musique de radio
     */
    public RadioC() {
        try {
            url = new URL("file:///C:\\Users\\Epulapp\\Documents\\CoursS5\\POO\\TP\\Montre\\musique_radio.wav");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void lancerRadio() {
        try {
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(200000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
