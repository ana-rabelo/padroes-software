package Observer.Bingo;

// crie um jogo de Bingo com 5 cartelas, onde cada cartela tem 6 números, e cujo
// número máximo do sorteio é 50, ou seja, os números sorteados variam dentro do
// intervalo [0,50].

public class TesteBingo {
    public static void main(String[] args) {
        // -- Cria sistema
        SistemaBingo sistemaBingo = new SistemaBingo(6, 50);

        // -- Cria cartelas
        BingoCartela bingoCartela = new BingoCartela(sistemaBingo);
        BingoCartela bingoCartela2 = new BingoCartela(sistemaBingo);
        BingoCartela bingoCartela3 = new BingoCartela(sistemaBingo);

        // -- Registra cartelas
        sistemaBingo.registraInteressado(bingoCartela);
        sistemaBingo.registraInteressado(bingoCartela2);
        sistemaBingo.registraInteressado(bingoCartela3);

        // -- Imprime numeros das cartelas
        System.out.println(bingoCartela);
        System.out.println(bingoCartela2);
        System.out.println(bingoCartela3);

        do {
            sistemaBingo.comecaBingo();
        } while(!sistemaBingo.isJogoEncerrou());
    }
}
