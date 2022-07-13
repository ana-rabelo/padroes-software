package Composite.SistemaArquivo;

import java.io.File;

public class ElementoFactory {
    public static Elemento getElemento(File elemento){
        if(elemento.isFile()){
            return new Arquivo(elemento);
        } else if (elemento.isDirectory()){
            return new Diretorio(elemento);
        } else {
            System.err.printf("Não foi possível computar o tamanho de %s.\n", elemento.getName());
            return null;
        }
    }
}
