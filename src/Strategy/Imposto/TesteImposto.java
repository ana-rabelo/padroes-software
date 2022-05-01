package Strategy.Imposto;

public class TesteImposto {
    public static void main(String[] args) {

        //ISS
        Imposto iss = new StrategyISS();
        Orcamento orcamentoISS = new Orcamento(150.0);

        CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
        calculadorDeImposto.calculaImposto(orcamentoISS, iss);

        //ICMS
        Imposto icms = new StrategyICMS();
        Orcamento orcamentoICMS = new Orcamento(260.0);
        calculadorDeImposto.calculaImposto(orcamentoICMS, icms);

    }
}
