package Builder.Livro;

import java.util.List;

public class TesteLivro {
    public static void main(String[] args) {
        Livro livroJava = new LivroBuilder("Java, como programar")
                .publicadoEm(2003)
                .dosAutores(List.of("H. M. Deitel", "P. J. Deitel"))
                .daEdicao(4)
                .cidade("Porto Alegre")
                .editora("Bookman")
                .nomeOriginal("Java How to Program")
                .tradutores(List.of("Carlos Arthur Land Lisboa"))
                .paginas(1386)
                .isbn(9788536301235L)
                .build();

        System.out.println(livroJava);
    }

}
