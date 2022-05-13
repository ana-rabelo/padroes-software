package Builder.Contato;

public class ContatoInternetBuilder implements ContatoBuilder{
    private String nome;
    private String email;

    @Override
    public ContatoBuilder comEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public String toString() {
        return "ContatoInternetBuilder{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public ContatoBuilder comEndereco(String endereco) {
        return this;
    }

    @Override
    public ContatoBuilder comTelefone(int telefone) {
        return this;
    }

    @Override
    public ContatoBuilder comNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public Contato construir() {
        return new Contato(nome, email);
    }
}
