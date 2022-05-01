package TemplateMethod.Relatorio;

public abstract class Relatorio {

    abstract void Cabecalho(Banco banco);
    abstract void Corpo(Conta conta);
    abstract void Rodape(Banco banco);

    public void montaRelatorio(Conta conta, Banco banco) {
        Cabecalho(banco);
        Corpo(conta);
        Rodape(banco);
    }
}
