package code;

public class Montre extends ChaineDeCompteurs {
    private boolean tourne = true;

    public Montre() {
        super(3, new int[]{0, 0, 0}, new int[]{24, 60, 60}, new int[]{1, 1, 1});
    }

    /**
     * Methode incrementant toutes les secondes le compteur
     */
    public void tourner() {
        while (tourne) {
            afficher();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            incrementer();
        }
    }

    /**
     * Methode permettant de regler la compteur
     *
     * @param h heure (24 max)
     * @param m minute (60 max)
     * @param s seconde (60 max)
     */
    public void regler(int h, int m, int s) {
        for (int i = 0; i < h * 3600 + m * 60 + s; i++) {
            incrementer();
        }
    }

    /**
     * Methode permettant de faire stoper la compteur
     */
    public void stopMontre() {
        this.tourne = false;
    }

    public boolean isTourne() {
        return tourne;
    }
}
