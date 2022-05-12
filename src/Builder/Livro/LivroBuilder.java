package Builder.Livro;

import java.util.List;

public class LivroBuilder {
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

    public LivroBuilder(String nomeNacional) {
        this.nomeNacional = nomeNacional;
    }

    public LivroBuilder publicadoEm(int ano) {
        this.ano = ano;
        return this;
    }

    public LivroBuilder dosAutores(List<String> autores) {
        this.autores = autores;
        return this;
    }

    public LivroBuilder daEdicao(int edicao) {
        this.edicao = edicao;
        return this;
    }

    public LivroBuilder cidade(String cidade) {
        this.cidade = cidade;
        return this;
    }

    public LivroBuilder editora(String editora) {
        this.editora = editora;
        return this;
    }

    public LivroBuilder nomeOriginal(String nomeOriginal) {
        this.nomeOriginal = nomeOriginal;
        return this;
    }

    public LivroBuilder tradutores(List<String> tradutores) {
        this.tradutores = tradutores;
        return this;
    }

    public LivroBuilder paginas(int paginas) {
        this.paginas = paginas;
        return this;
    }

    public LivroBuilder isbn(long isbn) {
        this.isbn = isbn;
        return this;
    }

    public Livro build() {
        return new Livro(nomeNacional, ano, autores,
                edicao, cidade, editora, nomeOriginal,
                tradutores, paginas, isbn);
    }

}
