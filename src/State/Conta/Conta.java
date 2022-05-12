package State.Conta;

public class Conta {
    private State state;
    protected double saldo;

    public Conta(){
        this.state = new ContaPositiva();
    }

    protected void setState(State state){
        this.state = state;
    }

    protected void saca(double valor){
        state.saca(this, valor);
    }

    protected void deposita(double valor){
        state.deposita(this, valor);
    }

}
