package code;

public class Reveil_Sonnerie extends Reveil implements Runnable {
    public Reveil_Sonnerie(String fin) {
        super(fin);
        super.setDeclenchable(new SonnerieDeclenchable());
    }
}
