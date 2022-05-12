package State.Pedido;

public class Enviado implements EstadoPedido {
    @Override
    public void envia(Pedido pedido) {
        String msg = "\nO pedido já foi enviado!";
        throw new IllegalStateException(msg);
    }

    @Override
    public void altera(Pedido pedido) {
        String msg = "\nNão é possível realizar alterações pois o pedido já foi enviado.";
        throw new IllegalStateException(msg);
    }

    @Override
    public void cancela(Pedido pedido) {
        String msg = "\nNão é possível cancelar pois o pedido já foi enviado.";
        throw new IllegalStateException(msg);
    }
}
