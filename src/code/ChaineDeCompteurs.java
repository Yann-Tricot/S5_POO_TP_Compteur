package code;

import java.util.Arrays;

public class ChaineDeCompteurs {

    private Compteur[] compteurs;
    boolean termine;

    public ChaineDeCompteurs(int nombreCompteurs, int[] mins, int[] maxs, int[] pas) {
        this.compteurs = new Compteur[nombreCompteurs];
        for (int i = 0; i < nombreCompteurs; i++) {
            this.compteurs[i] = new Compteur(mins[i], maxs[i], pas[i]);
        }
    }

    /**
     * Methode permettant d'incrementer la chaine de compteur
     */
    public void incrementer() {
        boolean termine = false;
        for (int i = compteurs.length - 1; i >= 0 && !termine; i--) {
            termine = !compteurs[i].incrementer();
        }
    }

    /**
     * Methode permettant de remettre à zero la chaine de compteur
     */
    public void raz() {
        for (Compteur compteur : compteurs) {
            compteur.raz();
        }
    }

    /**
     * Methode permettant d'afficher la valeur en string de la chaine de caractère
     */
    public void afficher() {
        System.out.println(toString());
    }

    /**
     * Methode permettant de convertir la chaine de compteur en string
     *
     * @return Valeur convertie en string
     */
    public String toString() {
        String valeur = "";
        for (int i = 0; i < compteurs.length; i++) {
            valeur += compteurs[i].toString();
            if (i != compteurs.length - 1) {
                valeur += ':';
            }
        }
        return valeur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChaineDeCompteurs that = (ChaineDeCompteurs) o;
        return termine == that.termine &&
                Arrays.equals(compteurs, that.compteurs);
    }
}
