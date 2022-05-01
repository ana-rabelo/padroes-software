package TemplateMethod.Relatorio;

import java.util.Calendar;

public class RelatorioSimples extends Relatorio {

    @Override
    public void Cabecalho(Banco banco) {
        System.out.println(banco.getNome() + "\t\t" + banco.getTelefone());
    }

    @Override
    public void Corpo(Conta conta) {
        System.out.println("\nTitular: " + conta.getTitular() + "\nSaldo: " + conta.getSaldo());
    }

    @Override
    public void Rodape(Banco banco) {
    }
}
