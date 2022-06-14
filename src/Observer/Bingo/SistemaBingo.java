package Observer.Bingo;

import Observer.Acao.AcaoObserver;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SistemaBingo {

    // Referente ao padrão Observer
    private Set<BingoCartela> interessados;
    private int numeroSorteado;
    private int numCasas;
    private int numMaximo;

    // Indica se alguém bateu
    private boolean jogoEncerrou = false;

    SistemaBingo(int numCasas, int numMaximo){
        this.numCasas = numCasas;
        this.numMaximo = numMaximo;
        interessados = new HashSet<>();
    }

    // Método do padrão Observer
    public void registraInteressado(BingoCartela interessado){
        this.interessados.add(interessado);
    }

    // Começa o jogo e notifica os jogadores (cartelas)
    public void comecaBingo(){
        Random random = new Random();
        numeroSorteado = random.nextInt(numMaximo + 1);
        System.out.println("\nNumero sorteado = " + numeroSorteado);

        for (BingoCartela interessado : this.interessados) {
            interessado.atualiza(numeroSorteado);
            if(interessado.venceu()){
                break;
            };
        }
    }

    // método que o jogador chama quando bate
    public void bingo(String s) {
        System.out.println(s);
        jogoEncerrou = true;
    }

    public int getNumCasas() {
        return numCasas;
    }

    public int getNumMaximo() {
        return numMaximo;
    }

    public boolean isJogoEncerrou() {
        return jogoEncerrou;
    }

    // Retorna uma instância do SistemaBingo
    public SistemaBingo getInstance(){
        return this;
    }
}
