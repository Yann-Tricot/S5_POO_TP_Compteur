package code.Classes.Radio;

import code.Classes.Abstracts.Reveil;

public class Radio_Reveil extends Reveil {
    public Radio_Reveil(String fin) {
        super(fin);
        super.setDeclenchable(new RadioDeclenchable());
    }
}
