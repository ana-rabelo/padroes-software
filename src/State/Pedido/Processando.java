package State.Pedido;

public class Processando implements EstadoPedido {
    @Override
    public void envia(Pedido pedido) {
        System.out.println("\nPedido enviado!");
        pedido.setState(new Enviado());
    }

    @Override
    public void altera(Pedido pedido) {
        System.out.println("\nAlterando pedido...");
    }

    @Override
    public void cancela(Pedido pedido) {
        System.out.println("\nPedido cancelado!");
        pedido.setState(new Cancelado());
    }
}
