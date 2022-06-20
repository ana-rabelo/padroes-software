package AbstractFactory.Localidade;

public class Cliente {
    public static void main(String[] args) {
        LocalidadeAbstractFactory localidadeBrasil = new LocalidadeBrasil();
        LocalidadeAbstractFactory localidadeEUA = new LocalidadeEUA();

        // - data
        System.out.println(localidadeBrasil.getData());
        System.out.println(localidadeEUA.getData());

        // - moeda
        double valor = 10.0;
        System.out.printf("%s%.2f", localidadeBrasil.getMoeda(), valor);
        System.out.printf("%s%.2f", localidadeEUA.getMoeda(), valor);
    }
}
