package Decorator.Pizza.CondimentosConcretos;

import Decorator.Pizza.CondimentosDecorator;
import Decorator.Pizza.Pizza;

public class CreamCheeseDecorator extends CondimentosDecorator {
    Pizza pizza;

    public CreamCheeseDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    public String getDescricao(){
        return pizza.getDescricao() + ", Borda de Cream Cheese";
    }

    public double getPreco(){
        return 1.20 + pizza.getPreco();
    }
}
