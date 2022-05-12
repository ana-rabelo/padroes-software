package State.Pedido;

import State.Conta.State;

public class Pedido {
    private EstadoPedido estado;

    public Pedido(){
        this.estado = new Processando();
    }

    protected void setState(EstadoPedido estado){
        this.estado = estado;
    }

    protected void envia(){
        estado.envia(this);
    }

    protected void altera(){
        estado.altera(this);
    }

    protected void cancela(){
        estado.cancela(this);
    }
}
