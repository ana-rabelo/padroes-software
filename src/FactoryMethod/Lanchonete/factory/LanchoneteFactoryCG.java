package FactoryMethod.Lanchonete.factory;

import FactoryMethod.Lanchonete.sanduiche.Sanduiche;
import FactoryMethod.Lanchonete.sanduiche.SanduicheCG;

public class LanchoneteFactoryCG extends LanchoneteFactory {
    @Override
    public Sanduiche fazSanduiche() {
        return new SanduicheCG();
    }

}
