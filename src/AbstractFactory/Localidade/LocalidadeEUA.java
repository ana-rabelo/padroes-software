package AbstractFactory.Localidade;

public class LocalidadeEUA extends LocalidadeAbstractFactory{
    @Override
    public Data getData() {
        return new DataEUA();
    }

    @Override
    public Moeda getMoeda() {
        return new MoedaEUA();
    }
}
