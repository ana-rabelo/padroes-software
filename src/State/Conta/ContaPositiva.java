package State.Conta;

public class ContaPositiva implements State {
    @Override
    public void saca(Conta conta, double valor) {
        conta.saldo -= valor;

        if (conta.saldo < 0) conta.setState(new ContaNegativa());
    }

    @Override
    public void deposita(Conta conta, double valor) {
        conta.saldo += (valor * 0.98);
    }
}
