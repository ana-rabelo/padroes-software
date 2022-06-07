package FactoryMethod.Lanchonete.sanduiche;

public class SanduicheJP implements Sanduiche{
    @Override
    public void pao() {
        System.out.println("Pão francês\n");
    }

    @Override
    public void queijo() {
        System.out.println("Queijo Mussarela\n");
    }

    @Override
    public void presunto() {
        System.out.println("Presunto de Frango\n");
    }

    @Override
    public void salada() {
        System.out.println("Com verdura\n");
    }
}
