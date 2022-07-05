package Adapter.Somador;

public class Aplicacao {
    public static void main(String[] args) {
        Cliente Ana = new Cliente(new Adapter());
        Ana.executar();
    }
}
