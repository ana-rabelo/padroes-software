package Strategy.Imposto;

public class StrategyICMS implements Imposto {

    @Override
    public double valorImposto(Orcamento orcamento){
        return orcamento.getValor() * 0.25;
    }
}
