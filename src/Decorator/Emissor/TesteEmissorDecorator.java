package Decorator.Emissor;

public class TesteEmissorDecorator {
    public static void main(String[] args) {
        String mensagem = "Ser ou não ser, eis a questão";

        Emissor emissorCript = new EmissorDecoratorComCriptografia(new EmissorBasico());
        emissorCript.envia(mensagem);

        Emissor emissorCompr = new EmissorDecoratorComCompressao(new EmissorBasico());
        emissorCompr.envia(mensagem);

        Emissor emissorCripCompr = new EmissorDecoratorComCriptografia(new EmissorDecoratorComCompressao(new EmissorBasico()));
        emissorCripCompr.envia(mensagem);
    }
}
