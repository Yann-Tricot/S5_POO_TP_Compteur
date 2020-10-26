package code;

public class RadioDeclenchable extends Declenchable implements Radio {
    private RadioC radio;

    public RadioDeclenchable() {
        this.radio = new RadioC();
    }

    @Override
    public void declencher() {
        lancerRadio();
    }

    @Override
    public void lancerRadio() {
        radio.lancerRadio();
    }
}
