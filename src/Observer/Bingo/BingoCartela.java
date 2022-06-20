package Observer.Bingo;


import java.util.*;

public class BingoCartela {
    public static int ID = 1;
    private int cartelaId;
    private Set<Integer> numeros = new HashSet<>();
    private SistemaBingo sistema;
    Random random = new Random();

    void geraCartela(){
        int numero;
        do {
            numero = random.nextInt(sistema.getNumMaximo()+1);
            numeros.add(numero);
        } while(numeros.size() < sistema.getNumCasas());
    }

    // O construtor inicializa as variáveis e constroi a cartela randomicamente
    public BingoCartela(SistemaBingo sistema) {
        this.cartelaId = ID++;
        this.sistema = sistema;
        this.geraCartela();
    }

    // Método que controla se o jogador bateu ou não, retirando da cartela os números sorteados
    public void atualiza(int numSorteado){
        if(numeros.contains(numSorteado)){
            numeros.remove(numSorteado);
            System.out.println("\nCartela " + cartelaId + " marcou o numero " + numSorteado);
        }
    }

    // Verifica se a cartela ganhou
    public boolean venceu(){
        if (numeros.isEmpty()) {
            sistema.bingo("Cartela " + cartelaId + " venceu!");
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "BingoCartela " +
                "cartelaId=" + cartelaId +
                ", numeros=" + numeros;
    }

    public int getCartelaId() {
        return cartelaId;
    }
}
