package Observer.Acao;

public class TesteObserver {
    public static void main(String[] args) {
        Acao acao = new Acao("VALE3", 45.27);

        Corretora corretora1 = new Corretora("A&P Corretora");
        Corretora corretora2 = new Corretora("Corretora Sonho");

        acao.registraInteressado(corretora1);
        acao.registraInteressado(corretora2);

        acao.setValor(50.89);

    }
}
