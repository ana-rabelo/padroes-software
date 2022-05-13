package Builder.Contato;

public class ContatoTelefoneBuilder implements ContatoBuilder{
    private String nome;
    private int telefone;

    @Override
    public ContatoBuilder comEmail(String email) {
        return this;
    }

    @Override
    public ContatoBuilder comEndereco(String endereco) {
        return this;
    }
    @Override
    public ContatoBuilder comTelefone(int telefone){
        this.telefone = telefone;
        return this;
    }
    @Override
    public ContatoBuilder comNome(String nome){
        this.nome = nome;
        return this;
    }

    public Contato construir(){
        return new Contato(nome, telefone);
    }

    @Override
    public String toString() {
        return "ContatoTelefoneBuilder{" +
                "nome='" + nome + '\'' +
                ", telefone=" + telefone +
                '}';
    }
}
