package State.Conta;

/**
 * Classe comum à todos estados
 */
public interface State {
    void saca(Conta conta, double valor);
    void deposita(Conta conta, double valor);
}
