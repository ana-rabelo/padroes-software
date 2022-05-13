package Builder.Contato;

public class ContatoCompletoBuilder implements ContatoBuilder{
    private String nome;
    private int telefone;
    private String email;
    private String endereco;
    @Override
    public ContatoBuilder comEmail(String email) {
        this.email = email;
        return  this;
    }

    @Override
    public ContatoBuilder comEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    @Override
    public ContatoBuilder comTelefone(int telefone) {
        this.telefone = telefone;
        return this;
    }

    @Override
    public ContatoBuilder comNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public Contato construir() {
        return new Contato(nome, telefone, endereco, email);
    }

    @Override
    public String toString() {
        return "ContatoCompletoBuilder{" +
                "nome='" + nome + '\'' +
                ", telefone=" + telefone +
                ", email='" + email + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
