package TemplateMethod.Relatorio;

import java.util.Calendar;

public class RelatorioComplexo extends Relatorio {
    @Override
    public void Cabecalho(Banco banco) {
        System.out.println(banco.getNome() + "\t\t" + banco.getTelefone());
        System.out.println(banco.getEndereco());
    }

    @Override
    public void Corpo(Conta conta) {
        System.out.print("\nTitular: " + conta.getTitular() + "\nAgência: " + conta.getAgencia() +
                "\tConta: " + conta.getNumConta() + "\nSaldo: " + conta.getSaldo());
    }

    @Override
    public void Rodape(Banco banco) {
        Calendar data = Calendar.getInstance();
        System.out.println("\n\n" + banco.getEmail() + "\t\t" + data.getTime());
    }
}
