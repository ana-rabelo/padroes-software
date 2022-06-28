package Decorator.Pizza.CondimentosConcretos;

import Decorator.Pizza.CondimentosDecorator;
import Decorator.Pizza.Pizza;

public class OreganoDecorator extends CondimentosDecorator {
    Pizza pizza;

    public OreganoDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    public String getDescricao(){
        return pizza.getDescricao() + ", Orégano";
    }

    public double getPreco(){
        return 0.50 + pizza.getPreco();
    }
}
