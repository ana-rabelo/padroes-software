package Strategy.Imposto;

public class StrategyISS implements Imposto {

    @Override
    public double valorImposto(Orcamento orcamento){
        return orcamento.getValor() * 0.06;
    }
}
