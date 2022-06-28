package Decorator.Numero;

public class ParentesesDecorator extends Decorator{
    Numero numero;

    public ParentesesDecorator(Numero numero){
        this.numero = numero;
    }
    @Override
    public String imprime() {
        return "(" + numero.imprime() + ")";
    }
}
