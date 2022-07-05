package Adapter.Somador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Adapter extends SomadorEsperado {
    private static SomadorExistente somador = new SomadorExistente();
    int somaVetor(Integer[] vetor){
        List<Integer> lista = Arrays.asList(vetor);
        return somador.somaLista(lista);
    }
}
