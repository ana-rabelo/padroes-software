package Builder.Contato;

public class Contato {
    private String nome;
    private int telefone;
    private String endereco;
    private String email;

    public Contato(String nome, int telefone, String endereco, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
    }

    public Contato(String nome, int telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public Contato(String  nome, String email){
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefone=" + telefone +
                ", endereco='" + endereco + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
