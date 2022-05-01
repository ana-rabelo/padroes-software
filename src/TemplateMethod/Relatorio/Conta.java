package TemplateMethod.Relatorio;

public class Conta {
    public String titular;
    public int agencia;
    public int numConta;
    public double saldo;

    public Conta(String titular, int agencia, int numConta, double saldo) {
        this.titular = titular;
        this.agencia = agencia;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
