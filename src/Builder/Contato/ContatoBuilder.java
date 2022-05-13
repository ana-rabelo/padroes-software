package Builder.Contato;

public interface ContatoBuilder {

    public ContatoBuilder comEmail(String email);

    public ContatoBuilder comEndereco(String endereco);

    public ContatoBuilder comTelefone(int telefone);

    public ContatoBuilder comNome(String nome);

    public Contato construir();
}
