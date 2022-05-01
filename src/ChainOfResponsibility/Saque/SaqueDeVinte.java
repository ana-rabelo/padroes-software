package ChainOfResponsibility.Saque;

public class SaqueDeVinte implements Saque {

    private Saque proximo;

    @Override
    public void saca(int valor) {
        int cedulas = valor / 20;
        int resto = valor % 20;

        if (cedulas > 0)
            System.out.printf("%d %s de 20.\n", cedulas, (cedulas > 1 ? "notas" : "nota"));
        if (resto > 0)
            proximo.saca(resto);
    }

    @Override
    public void setProximo(Saque proximo) {
        this.proximo = proximo;
    }
}