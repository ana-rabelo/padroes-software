package ChainOfResponsibility.AplicacaoBancaria;

import static ChainOfResponsibility.AplicacaoBancaria.Formato.XML;

public class RespostaXML implements Resposta {

    private Resposta proximo;

    @Override
    public String respondeTipo(Requisicao requisicao, Conta conta){
        if(requisicao.getFormato().equals(XML))
            return "<conta>\n\t<titular>" + conta.getTitular() + "</titular> \n\t<saldo>" + conta.getSaldo() + "</saldo>\n</conta>";

        return proximo.respondeTipo(requisicao, conta);
    }

    @Override
    public void setProximo(Resposta proximo) {
        this.proximo = proximo;
    }
}