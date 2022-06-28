package Decorator.Numero;

public class ColchetesDecorator extends Decorator{
    Numero numero;
    public ColchetesDecorator(Numero numero){
        this.numero = numero;
    }
    @Override
    public String imprime() {
        return "[" + numero.imprime() + "]";
    }
}
