package code.Classes;

public class Compteur {

    private int min;
    private int max;
    private int pas;
    private int valeur;

    public Compteur() {
        this(0, 60, 1);
    }

    public Compteur(int min, int max, int pas) {
        this.min = min;
        this.max = max;
        this.pas = pas;
        this.valeur = min;

    }

    public int getMin() {
        return this.min;
    }

    public int getMax() {
        return this.max;
    }

    public int getPas() {
        return this.pas;
    }

    public int getValeur() {
        return this.valeur;
    }

    /**
     * Methode permettant d'incrementer le compteur
     *
     * @return true si on depasse la borne, false sinon
     */
    public boolean incrementer() {
        this.valeur += pas;
        if (valeur >= max) {
            valeur = min;
            return true;
        }
        return false;
    }

    /**
     * Methode permettant de remettre à zero le compteur
     */
    public void raz() {
        this.valeur = min;
    }

    /**
     * Methode permettant d'afficher la valeur du compteur
     */
    public void afficher() {
        System.out.print(toString());
    }

    /**
     * Methode permettant de convertir la valeur du compteur en string
     *
     * @return la valeur du compteur en string
     */
    public String toString() {
        return String.valueOf(valeur);
    }

}
