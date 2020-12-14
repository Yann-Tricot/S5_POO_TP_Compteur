package code.Classes.Cafetiere;

import code.Interfaces.Cafetiere;

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

public class CafetiereC implements Cafetiere {
    URL url = null;

    /**
     * Permet de lancer un son de cafetiere
     */
    public CafetiereC() {
        try {
            url = this.getClass().getResource("son_cafetiere.wav");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void lancerCafetiere() {
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
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
