package State.Pedido;

public class Cancelado implements EstadoPedido {
    @Override
    public void envia(Pedido pedido) {
        String msg = "\nNão é possível enviar pois o pedido foi cancelado.";
        throw new IllegalStateException(msg);
    }

    @Override
    public void altera(Pedido pedido) {
        String msg = "\nNão é possível alterar pois o pedido já foi cancelado.";
        throw new IllegalStateException(msg);
    }

    @Override
    public void cancela(Pedido pedido) {
        String msg = "\nPedido já cancelado.";
        throw new IllegalStateException(msg);
    }
}
