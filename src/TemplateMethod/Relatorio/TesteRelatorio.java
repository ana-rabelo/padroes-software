package TemplateMethod.Relatorio;

public class TesteRelatorio {

    public static void main(String[] args) {

        Conta conta = new Conta("João da Silva", 3900, 56770, 1050.50);
        Banco banco = new Banco("Banco S/A", "Rua Ednaldo Pereira, 12",
                "40024922", "bancosa@hotmail.com");

        //Relatorio montarRelatorio = new RelatorioComplexo();
        //montarRelatorio.montaRelatorio(conta, banco);

        Relatorio montarRelatorio = new RelatorioSimples();
        montarRelatorio.montaRelatorio(conta, banco);

    }
}
