package Decorator.Pizza.CondimentosConcretos;

import Decorator.Pizza.CondimentosDecorator;
import Decorator.Pizza.Pizza;

public class BaconDecorator extends CondimentosDecorator {
    Pizza pizza;

    public BaconDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    public String getDescricao(){
        return pizza.getDescricao() + ", Bacon";
    }

    public double getPreco(){
        return 0.80 + pizza.getPreco();
    }
}
