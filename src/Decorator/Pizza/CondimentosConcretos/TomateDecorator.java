package Decorator.Pizza.CondimentosConcretos;

import Decorator.Pizza.CondimentosDecorator;
import Decorator.Pizza.Pizza;

public class TomateDecorator extends CondimentosDecorator {
    Pizza pizza;

    public TomateDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    public String getDescricao(){
        return pizza.getDescricao() + ", Tomate";
    }

    public double getPreco(){
        return 0.10 + pizza.getPreco();
    }
}
