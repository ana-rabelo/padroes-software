package ChainOfResponsibility.AplicacaoBancaria;

import static ChainOfResponsibility.AplicacaoBancaria.Formato.*;

class TesteAplicacao {
    public static void main(String[] args) {
        Resposta json = new RespostaJSON();
        Resposta xml = new RespostaXML();
        Resposta csv = new RespostaCSV();
        json.setProximo(xml);
        xml.setProximo(csv);
        csv.setProximo(null);

        Conta conta = new Conta("Ana", 59);

        Requisicao requisicaoJSON = new Requisicao(JSON);
        Requisicao requisicaoXML = new Requisicao(XML);
        Requisicao requisicaoCSV = new Requisicao(CSV);

        System.out.println(json.respondeTipo(requisicaoJSON, conta));
        System.out.println(json.respondeTipo(requisicaoXML, conta));
        System.out.println(json.respondeTipo(requisicaoCSV, conta));
    }
}