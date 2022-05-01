package ChainOfResponsibility.AplicacaoBancaria;

import static ChainOfResponsibility.AplicacaoBancaria.Formato.JSON;

public class RespostaJSON implements Resposta {

    private Resposta proximo;

    @Override
    public String respondeTipo(Requisicao requisicao, Conta conta){
        if(requisicao.getFormato().equals(JSON))
            return "{ titular: " + conta.getTitular() + ", saldo: " + conta.getSaldo() + " }";

        return proximo.respondeTipo(requisicao, conta);
    }

    @Override
    public void setProximo(Resposta proximo) {
        this.proximo = proximo;
    }
}