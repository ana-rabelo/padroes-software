package State.Processo;

public class Fechado implements EstadoProcesso{

    @Override
    public void deferir(Processo processo) {
        String msg = "\nProcesso já fechado, não é possível deferir.";
        throw new IllegalStateException(msg);
    }

    @Override
    public void cancelar(Processo processo) {
        String msg = "\nProcesso já fechado, não é possível cancelar.";
        throw new IllegalStateException(msg);
    }

    @Override
    public void indeferir(Processo processo) {
        String msg = "\nProcesso já fechado, não é possível indeferir.";
        throw new IllegalStateException(msg);
    }

    @Override
    public void designar(Processo processo) {
        String msg = "\nProcesso já fechado, não é possível designar.";
        throw new IllegalStateException(msg);
    }
}
