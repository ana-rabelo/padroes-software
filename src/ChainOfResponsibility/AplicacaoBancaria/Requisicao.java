package ChainOfResponsibility.AplicacaoBancaria;

enum Formato {
    JSON,
    XML,
    CSV
}

class Requisicao {
    private Formato formato;

    public Requisicao(Formato formato) {
        this.formato = formato;
    }

    public Formato getFormato(){
        return this.formato;
    }
}