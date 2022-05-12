package State.Processo;

import java.time.LocalDate;

public class Processo {

    private EstadoProcesso estado;
    private LocalDate prazoLegal;

    public Processo(LocalDate prazoLegal) {
        this.estado = new Criado();
        this.prazoLegal = prazoLegal;
    }

    protected void setEstado(EstadoProcesso estado) {
        this.estado = estado;
    }

    public LocalDate getPrazoLegal() {
        return prazoLegal;
    }

    public void deferir() {
        estado.deferir(this);
    }

    public void cancelar() {
        estado.cancelar(this);
    }

    public void indeferir() {
        estado.indeferir(this);
    }

    public void designar() {
        estado.designar(this);
    }
}
