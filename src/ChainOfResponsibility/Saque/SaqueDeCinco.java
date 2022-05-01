package ChainOfResponsibility.Saque;

public class SaqueDeCinco implements Saque {

    private Saque proximo;

    @Override
    public void saca(int valor) {
        int cedulas = valor / 5;
        int resto = valor % 5;

        if (cedulas > 0)
            System.out.printf("%d %s de 5.\n", cedulas, (cedulas > 1 ? "notas" : "nota"));
    }

    @Override
    public void setProximo(Saque proximo) {
        this.proximo = proximo;
    }
}