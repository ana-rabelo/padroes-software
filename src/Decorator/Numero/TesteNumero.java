package Decorator.Numero;

public class TesteNumero {
    public static void main(String[] args) {
        Numero numero = new NumeroUm();
        System.out.println(numero.imprime());

        // com parênteses
        numero = new ParentesesDecorator(new NumeroUm());
        System.out.println(numero.imprime());

        // com parênteses e chaves
        numero = new ChavesDecorator(numero);
        System.out.println(numero.imprime());

        // com parênteses, chaves e colchetes
        numero = new ColchetesDecorator((numero));
        System.out.println(numero.imprime());

        // com chaves
        numero = new ChavesDecorator(new NumeroUm());
        System.out.println(numero.imprime());

        // com chaves e colchetes
        numero = new ColchetesDecorator((numero));
        System.out.println(numero.imprime());
    }
}
