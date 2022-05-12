package State.Pedido;

public class Teste {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.altera();
        pedido.cancela();
        pedido.envia();
    }
}
