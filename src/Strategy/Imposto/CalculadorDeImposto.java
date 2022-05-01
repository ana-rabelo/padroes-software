package Strategy.Imposto;

public class CalculadorDeImposto{

    public void calculaImposto(Orcamento orcamento, Imposto imposto){
        System.out.printf("Valor do imposto: %.2f\n",
                                        imposto.valorImposto(orcamento));
    }

}
