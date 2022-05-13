package Builder.Contato;

public class Director {

    private ContatoBuilder builder;

    public Director(ContatoBuilder builder) {
        super();
        this.builder = builder;
    }

    public void setBuilder(ContatoBuilder builder) {
        this.builder = builder;
    }

    public Contato contruirContatoCompleto(String nome, int telefone, String endereco, String email) {
        return builder.comEmail(email).comEndereco(endereco).comTelefone(telefone).comNome(nome).construir();
    }

    public Contato contruirContatoInternet(String nome, String email) {
        return builder.comEmail(email).comNome(nome).construir();
    }

    public Contato contruirContatoTelefone(String nome, int telefone) {
        return builder.comTelefone(telefone).comNome(nome).construir();
    }

}