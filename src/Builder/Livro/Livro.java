package Builder.Livro;

import java.util.List;

public class Livro {
    private String nomeNacional;
    private int ano;
    private List<String> autores;
    private int edicao;
    private String cidade;
    private String editora;
    private String nomeOriginal;
    private List<String> tradutores;
    private int paginas;
    private long isbn;

    public Livro(String nomeNacional, int ano, List<String> autores,
                 int edicao, String cidade, String editora, String nomeOriginal,
                 List<String> tradutores, int paginas, long isbn) {
        this.nomeNacional = nomeNacional;
        this.ano = ano;
        this.autores = autores;
        this.edicao = edicao;
        this.cidade = cidade;
        this.editora = editora;
        this.nomeOriginal = nomeOriginal;
        this.tradutores = tradutores;
        this.paginas = paginas;
        this.isbn = isbn;
    }
}
