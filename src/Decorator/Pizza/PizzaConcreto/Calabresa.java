package Decorator.Pizza.PizzaConcreto;

import Decorator.Pizza.Pizza;

public class Calabresa extends Pizza {
    public Calabresa (){
        descricao += "Calabresa";
    }
    @Override
    public double getPreco() {
        return 14.9;
    }
}
