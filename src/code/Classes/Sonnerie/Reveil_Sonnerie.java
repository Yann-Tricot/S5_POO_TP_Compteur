package code.Classes.Sonnerie;

import code.Classes.Abstracts.Reveil;

public class Reveil_Sonnerie extends Reveil implements Runnable {
    public Reveil_Sonnerie(String fin) {
        super(fin);
        super.setDeclenchable(new SonnerieDeclenchable());
    }
}
