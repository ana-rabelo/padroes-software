package Composite.SistemaArquivo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Diretorio implements Elemento{

    private File path;
    private File[] arquivos;

    public Diretorio(File path) {
        this.path = path;
        this.arquivos = path.listFiles();
    }

    @Override
    public long tamanho() {
        long tam = 0;
        for(File arq : arquivos){
            System.out.printf("%s: %d bytes\n", arq, arq.length());
            tam += arq.length();
        }
        return tam;
    }
}
