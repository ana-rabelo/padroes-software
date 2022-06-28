package Decorator.Pizza;

import Decorator.Pizza.CondimentosConcretos.BaconDecorator;
import Decorator.Pizza.CondimentosConcretos.CreamCheeseDecorator;
import Decorator.Pizza.CondimentosConcretos.OreganoDecorator;
import Decorator.Pizza.CondimentosConcretos.TomateDecorator;
import Decorator.Pizza.PizzaConcreto.Calabresa;
import Decorator.Pizza.PizzaConcreto.Mussarela;

public class Pizzaiolo {
    public static void main(String[] args) {

        // Cria Pizza de calabresa
        Pizza pizzaCalab = new Calabresa();
        System.out.println(pizzaCalab.getDescricao() + " --- " + pizzaCalab.getPreco());
        // adiciona tomate, bacon e oregano
        pizzaCalab = new BaconDecorator(pizzaCalab);
        pizzaCalab = new TomateDecorator(pizzaCalab);
        pizzaCalab = new OreganoDecorator(pizzaCalab);
        System.out.println(pizzaCalab.getDescricao() + " --- " + pizzaCalab.getPreco());

        // Cria Pizza de Mussarela
        Pizza pizzaMussa = new Mussarela();
        System.out.println(pizzaMussa.getDescricao() + " --- " + pizzaMussa.getPreco());
        // adiciona borda de cream cheese e tomate
        pizzaMussa = new CreamCheeseDecorator(pizzaMussa);
        pizzaMussa = new TomateDecorator(pizzaMussa);
        System.out.println(pizzaMussa.getDescricao() + " --- " + pizzaMussa.getPreco());
    }
}
