package Decorator.Numero;

public class ChavesDecorator extends Decorator{
    Numero numero;

    public ChavesDecorator(Numero numero){
        this.numero = numero;
    }
    @Override
    public String imprime() {
        return "{" + numero.imprime() + "}";
    }
}
