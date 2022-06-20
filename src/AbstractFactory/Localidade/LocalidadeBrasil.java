package AbstractFactory.Localidade;

public class LocalidadeBrasil extends LocalidadeAbstractFactory{

    @Override
    public Data getData() {
        return new DataBrasil();
    }

    @Override
    public Moeda getMoeda() {
        return new MoedaBrasil();
    }
}

