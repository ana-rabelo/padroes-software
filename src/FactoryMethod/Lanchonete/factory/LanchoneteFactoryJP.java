package FactoryMethod.Lanchonete.factory;

import FactoryMethod.Lanchonete.sanduiche.Sanduiche;
import FactoryMethod.Lanchonete.sanduiche.SanduicheJP;

public class LanchoneteFactoryJP extends LanchoneteFactory {
    @Override
    public Sanduiche fazSanduiche() {
        return new SanduicheJP();
    }
}
