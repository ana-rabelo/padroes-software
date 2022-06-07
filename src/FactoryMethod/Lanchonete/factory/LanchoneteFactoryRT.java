package FactoryMethod.Lanchonete.factory;

import FactoryMethod.Lanchonete.sanduiche.Sanduiche;
import FactoryMethod.Lanchonete.sanduiche.SanduicheRT;

public class LanchoneteFactoryRT extends LanchoneteFactory {
    @Override
    public Sanduiche fazSanduiche(){
        return new SanduicheRT();
    }
}
