package ChainOfResponsibility.Saque;

public class TesteSaque {
    public static void main(String[] args) {
        Saque saque100 = new SaqueDeCem();
        Saque saque50 = new SaqueDeCinquenta();
        Saque saque20 = new SaqueDeVinte();
        Saque saque05 = new SaqueDeCinco();

        saque100.setProximo(saque50);
        saque50.setProximo(saque20);
        saque20.setProximo(saque05);
        saque05.setProximo(null);

        saque100.saca(935);
    }
}
