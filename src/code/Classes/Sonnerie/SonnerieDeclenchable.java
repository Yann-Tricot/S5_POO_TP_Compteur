package code.Classes.Sonnerie;


import code.Classes.Abstracts.Declenchable;
import code.Interfaces.Sonnerie;

public class SonnerieDeclenchable extends Declenchable implements Sonnerie {
    private SonnerieC sonnerie;

    public SonnerieDeclenchable() {
        this.sonnerie = new SonnerieC();
    }

    @Override
    public void declencher() {
        lancerSon();
    }

    @Override
    public void lancerSon() {
        this.sonnerie.lancerSon();
    }
}
