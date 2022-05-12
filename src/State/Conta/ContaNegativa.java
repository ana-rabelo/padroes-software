package State.Conta;

public class ContaNegativa implements State {

    @Override
    public void saca(Conta conta, double valor) {
        throw new RuntimeException("\nNao eh possivel sacar de uma conta negativada!");
    }

    @Override
    public void deposita(Conta conta, double valor) {
        conta.saldo += (valor * 0.98);
        if (conta.saldo > 0) conta.setState(new ContaPositiva());
    }
}
