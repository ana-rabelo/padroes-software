package State.Processo;

import java.time.LocalDate;

public class Indeferido implements EstadoProcesso{

    @Override
    public void deferir(Processo processo) {
        String msg = "\nO processo foi indeferido, não é possível deferi-lo. Entre com recurso.";
        throw new IllegalStateException(msg);
    }

    @Override
    public void cancelar(Processo processo) {
        LocalDate hoje = LocalDate.now();
        if (hoje.compareTo(processo.getPrazoLegal()) == 1){
            System.out.println("\nProcesso fechado. Prazo legal trasncorrido.");
        } else {
            throw new IllegalStateException("\nPrazo legal ainda não transcorrido.");
        }
    }

    @Override
    public void indeferir(Processo processo) {
        String msg = "\nProcesso já indeferido!";
        throw new IllegalStateException(msg);
    }

    @Override
    public void designar(Processo processo) {
        System.out.println("\nProcesso foi designado! Em avaliação...");
        processo.setEstado(new EmAvaliacao());
        System.out.println("\nInteressado foi avisado via email.");
    }
}
