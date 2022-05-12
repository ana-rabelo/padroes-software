package State.Processo;

public class Criado implements EstadoProcesso{
    @Override
    public void deferir(Processo processo) {
        String msg = "\nProcesso ainda não designado. Não é possível deferir.";
        throw new IllegalStateException(msg);
    }

    @Override
    public void cancelar(Processo processo) {
        System.out.println("\nProcesso Fechado!");
        processo.setEstado(new Fechado());
    }

    @Override
    public void indeferir(Processo processo) {
        String msg = "\nProcesso ainda não designado. Não é possível indeferir.";
        throw new IllegalStateException(msg);
    }

    @Override
    public void designar(Processo processo) {
        System.out.println("\nProcesso foi designado! Em avaliação...");
        processo.setEstado(new EmAvaliacao());
        System.out.println("\nInteressado foi avisado via email.");
    }
}
