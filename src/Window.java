import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.TimerTask;

/**
 * Class Permettant de gerer les reveils en IHM
 */
public class Window extends JFrame {
    private JPanel panel;
    private JTextField compteur;
    private JRadioButton sonnerie;
    private JRadioButton radio;
    private JRadioButton cafetiere;
    private JButton button1;
    private Reveil reveil;
    private Thread threadReveil;
    private boolean isRunning = false;
    private JLabel label;
    private JLabel Temps;
    private JLabel Time;
    private JTextField num;
    private int tpsTotal;

    public Window() {
        panel.setSize(400, 200);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(panel);
        this.setSize(400, 250);
        initialisationRadioButton();
        InitialisationButton();
        reveil = null;
    }

    /**
     * Methode permettant d'initialiser l'actionListener du Button
     */
    private void InitialisationButton() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temps = compteur.getText();
                int[] tps = new int[3];
                String[] str = temps.split(":");
                for (int i = 1; i <= 3; i++) {
                    tps[i - 1] = Integer.parseInt(str[i - 1]);
                }
                int tempsTotal = tps[0] * 3600 + tps[1] * 60 + tps[2];
                tpsTotal = tempsTotal * 1000 - 1000;
                if (!isRunning)
                    if (sonnerie.isSelected()) {
                        reveil = new Reveil_Sonnerie(temps);
                        threadReveil = new Thread(reveil);
                        threadReveil.start();
                        isRunning = true;
                        System.out.println(tpsTotal);
                        sendMessage();
                        update();
                    } else if (radio.isSelected()) {
                        reveil = new Radio_Reveil(temps);
                        threadReveil = new Thread(reveil);
                        isRunning = true;
                        threadReveil.start();
                        sendMessage();
                        update();
                    } else if (cafetiere.isSelected()) {
                        reveil = new Radio_Cafetiere(temps);
                        threadReveil = new Thread(reveil);
                        isRunning = true;
                        threadReveil.start();
                        sendMessage();
                        update();
                    } else
                        JOptionPane.showMessageDialog(null, "Il faut selectionner un des réveils");


            }
        });
    }

    /**
     * Initialise les actionListener des radio buttons
     */
    private void initialisationRadioButton() {
        sonnerie.addActionListener((e) -> {
            radio.setSelected(false);
            cafetiere.setSelected(false);
        });

        radio.addActionListener((e) -> {
            sonnerie.setSelected(false);
            cafetiere.setSelected(false);
        });

        cafetiere.addActionListener((e) -> {
            radio.setSelected(false);
            sonnerie.setSelected(false);
        });
    }

    /**
     * Methode permettant d'update la date IHM
     */
    private void update() {
        java.util.Timer timer = new java.util.Timer();
        if (isRunning) {
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    if (!reveil.isTourne()) {
                        timer.cancel();
                        isRunning = false;
                    }
                    Time.setText(reveil.toString());
                }
            }, 0, 100);
        }
    }

    private void sendMessage() {
        java.util.Timer timer = new java.util.Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                ClientHttpApi api = new ClientHttpApi();
                try {
                    api.sendSmsGet("Sonnerie", num.getText());
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }, tpsTotal);
    }

}
