package State.Pedido;

public interface EstadoPedido {
    void envia(Pedido pedido);

    void altera(Pedido pedido);

    void cancela(Pedido pedido);
}
