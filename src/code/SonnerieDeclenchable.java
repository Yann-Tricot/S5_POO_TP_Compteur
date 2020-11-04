package code;


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
