package FactoryMethod.Lanchonete.sanduiche;

public class SanduicheCG implements Sanduiche{
    @Override
    public void pao() {
        System.out.println("Pão integral\n");
    }

    @Override
    public void queijo() {
        System.out.println("Queijo Prato\n");
    }

    @Override
    public void presunto() {
        System.out.println("Presunto de Frango\n");
    }

    @Override
    public void salada() {
        System.out.println("Sem verdura\n");
    }
}
