package State.Processo;

import State.Pedido.Pedido;

public interface EstadoProcesso {
    void deferir(Processo processo);
    void cancelar(Processo processo);
    void indeferir(Processo processo);

    void designar(Processo processo);
}
