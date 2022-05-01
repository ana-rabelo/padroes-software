package ChainOfResponsibility.AplicacaoBancaria;

public class RespostaCSV implements Resposta{

    private Resposta proximo;

    @Override
    public String respondeTipo(Requisicao requisicao, Conta conta) {
        if (requisicao.getFormato().equals(Formato.CSV))
            return conta.getTitular() + "%" + conta.getSaldo();
        return proximo.respondeTipo(requisicao, conta);
    }

    @Override
    public void setProximo(Resposta proximo) { this.proximo = proximo;

    }
}
