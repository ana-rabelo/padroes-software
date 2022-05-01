package ChainOfResponsibility.AplicacaoBancaria;

public class Conta {
    public String titular;
    public double saldo;

    public Conta(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular(){
        return this.titular;
    }

    public double getSaldo(){
        return this.saldo;
    }
}
