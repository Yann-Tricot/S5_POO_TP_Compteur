package code.Classes.Abstracts;

import code.Classes.ChaineDeCompteurs;
import code.Classes.Montre;

public abstract class Reveil extends Montre implements Runnable {

    private String fin;
    private Declenchable declenchable;
    private ChaineDeCompteurs end;

    public Reveil(String fin) {
        super();
        this.fin = fin;
    }

    /**
     * Methode permettant de verifier si le reveil doit sonner
     */
    public void checkSonnerie() {
        if (super.toString().equals(fin)) {
            declenchable.declencher();
            super.stopMontre();
        }
    }

    public Declenchable getDeclenchable() {
        return declenchable;
    }

    public void setDeclenchable(Declenchable declenchable) {
        this.declenchable = declenchable;
    }

    @Override
    public void incrementer() {
        checkSonnerie();
        super.incrementer();
    }

    @Override
    public void run() {
        tourner();
    }
}
