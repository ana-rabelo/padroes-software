package ChainOfResponsibility.Saque;

public interface Saque {
    void saca(int valor);
    void setProximo(Saque proximo);
}