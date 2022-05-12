package State.Processo;

import java.time.LocalDate;

public class Deferido implements EstadoProcesso{

    @Override
    public void deferir(Processo processo) {
        String msg = "\nProcesso já deferido!";
        throw new IllegalStateException(msg);
    }

    @Override
    public void cancelar(Processo processo) {
        LocalDate hoje = LocalDate.now();
        if (hoje.compareTo(processo.getPrazoLegal()) == 1){
            System.out.println("\nProcesso fechado. Prazo legal transcorrido.");
        } else {
            throw new IllegalStateException("\nPrazo legal ainda não transcorrido.");
        }
    }

    @Override
    public void indeferir(Processo processo) {
        String msg = "\nNão é possível indeferir processo já deferido.";
        throw new IllegalStateException(msg);
    }

    @Override
    public void designar(Processo processo) {
        String msg = "\nO processo já foi designado e avaliado.";
        throw new IllegalStateException(msg);
    }
}
