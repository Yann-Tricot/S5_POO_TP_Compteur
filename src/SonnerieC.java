import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

public class SonnerieC implements Sonnerie {
    private URL url = null;

    /**
     * Permet de lancer une sonnerie
     */
    public SonnerieC() {
        try {
            url = new URL("file:///C:\\Users\\Epulapp\\Documents\\CoursS5\\POO\\TP\\Montre\\son.wav");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void lancerSon() {

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
