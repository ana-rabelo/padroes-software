package Builder.Contato;

public class Client {
    public static void main(String[] args) {
        ContatoBuilder builder = new ContatoInternetBuilder();
        Director director = new Director(builder);
        Contato contato = director.contruirContatoInternet("Ana", "123");
        System.out.println(contato);

        builder = new ContatoTelefoneBuilder();
        director = new Director(builder);
        contato = director.contruirContatoTelefone("Ana", 98999990);
        System.out.println(contato);

        builder = new ContatoCompletoBuilder();
        director = new Director(builder);
        contato = director.contruirContatoCompleto("Ana", 99999999, "são luís", "ana.qacad.com");
        System.out.println(contato);

    }
}
