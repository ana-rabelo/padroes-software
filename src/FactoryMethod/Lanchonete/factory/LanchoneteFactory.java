package FactoryMethod.Lanchonete.factory;
import FactoryMethod.Lanchonete.sanduiche.Sanduiche;

public abstract class LanchoneteFactory {
    public abstract Sanduiche fazSanduiche();

    public Sanduiche pedeSanduiche(){
        Sanduiche sanduiche = fazSanduiche();
        sanduiche.pao();
        sanduiche.queijo();
        sanduiche.presunto();
        sanduiche.salada();
        return sanduiche;
    }
}