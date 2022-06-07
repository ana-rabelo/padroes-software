package FactoryMethod.Lanchonete.sanduiche;

public class SanduicheRT implements Sanduiche{
    @Override
    public void pao() {
        System.out.println("Pão Bola\n");
    }

    @Override
    public void queijo() {
        System.out.println("Qeijo Cheddar\n");
    }

    @Override
    public void presunto() {
        System.out.println("Presunto de Peru\n");
    }

    @Override
    public void salada() {
        System.out.println("Sem verdura\n");
    }
}
