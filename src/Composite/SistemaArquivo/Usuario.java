package Composite.SistemaArquivo;

import java.io.File;
import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o nome do arquivo ou diretório");
        File file = new File(leitor.nextLine());

        Elemento elemento = ElementoFactory.getElemento(file);

        System.out.printf("%d bytes", elemento.tamanho());

    }
}
