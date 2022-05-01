package ChainOfResponsibility.AplicacaoBancaria;

public interface Resposta {
    String respondeTipo(Requisicao requisicao, Conta conta);
    void setProximo(Resposta proximo);
}
