public class Radio_Cafetiere extends Reveil {
    public Radio_Cafetiere(String fin) {
        super(fin);
        super.setDeclenchable(new CafetiereDeclenchable());
    }
}
