import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

public class Sonneri {

    /**
     * Permet de lancer une sonnerie
     *
     * @param son Le son qui sera utilise
     */
    public Sonneri(String son) {
        //System.out.println(son);
        URL url = null;
        try {
            url = new URL("file:///C:\\Users\\Epulapp\\Documents\\CoursS5\\POO\\TP\\Montre\\son.wav");
            lancerSon(url);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void lancerSon(URL url) throws IOException, LineUnavailableException, UnsupportedAudioFileException {

        AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
        Clip clip = AudioSystem.getClip();
        clip.open(audioIn);
        clip.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
