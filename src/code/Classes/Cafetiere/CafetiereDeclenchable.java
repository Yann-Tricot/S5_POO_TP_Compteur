package code.Classes.Cafetiere;

import code.Classes.Abstracts.Declenchable;
import code.Interfaces.Cafetiere;

public class CafetiereDeclenchable extends Declenchable implements Cafetiere {
    private CafetiereC cafetiere;

    public CafetiereDeclenchable() {
        this.cafetiere = new CafetiereC();
    }

    @Override
    public void lancerCafetiere() {
        declencher();
    }

    @Override
    public void declencher() {
        this.cafetiere.lancerCafetiere();
    }
}
