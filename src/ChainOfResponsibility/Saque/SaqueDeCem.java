package ChainOfResponsibility.Saque;

public class SaqueDeCem implements Saque {

    private Saque proximo;

    @Override
    public void saca(int valor) {
        int cedulas = valor / 100;
        int resto = valor % 100;

        if (cedulas > 0)
            System.out.printf("%d %s de 100.\n", cedulas, (cedulas > 1 ? "notas" : "nota"));
        if (resto > 0)
            proximo.saca(resto);
    }

    @Override
    public void setProximo(Saque proximo) {
        this.proximo = proximo;
    }
}