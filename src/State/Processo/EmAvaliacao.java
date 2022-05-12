package State.Processo;

import State.Pedido.Pedido;

public class EmAvaliacao implements EstadoProcesso{
    @Override
    public void deferir(Processo processo) {
        System.out.println("\nPedido deferido.");
        processo.setEstado(new Deferido());
    }

    @Override
    public void cancelar(Processo processo) {
        String msg = "Não é possível cancelar processo em avaliação.";
        throw new IllegalStateException(msg);
    }

    @Override
    public void indeferir(Processo processo) {
        System.out.println("\nPedido indeferido.");
        processo.setEstado(new Indeferido());
    }

    @Override
    public void designar(Processo processo) {
        String msg = "\nProcesso já designado. Em avaliação...";
        throw  new IllegalStateException(msg);
    }
}
