package ChainOfResponsibility.Saque;

public class SaqueDeCinquenta implements Saque {

    private Saque proximo;

    @Override
    public void saca(int valor) {
        int cedulas = valor / 50;
        int resto = valor % 50;

        if (cedulas > 0)
            System.out.printf("%d %s de 50.\n", cedulas, (cedulas > 1 ? "notas" : "nota"));
        if (resto > 0)
            proximo.saca(resto);
    }

    @Override
    public void setProximo(Saque proximo) {
        this.proximo = proximo;
    }
}