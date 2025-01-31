package code.Classes.Radio;

import code.Classes.Abstracts.Declenchable;
import code.Interfaces.Radio;

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
