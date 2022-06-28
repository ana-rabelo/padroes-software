package Decorator.Pizza.PizzaConcreto;

import Decorator.Pizza.Pizza;

public class Mussarela extends Pizza {
    public Mussarela(){
        descricao += "Mussarela";
    }
    @Override
    public double getPreco() {
        return 11.9;
    }
}
