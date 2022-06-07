package FactoryMethod.Lanchonete;

import FactoryMethod.Lanchonete.factory.LanchoneteFactory;
import FactoryMethod.Lanchonete.factory.LanchoneteFactoryCG;
import FactoryMethod.Lanchonete.factory.LanchoneteFactoryJP;
import FactoryMethod.Lanchonete.factory.LanchoneteFactoryRT;
import FactoryMethod.Lanchonete.sanduiche.Sanduiche;

public class Main {
    public static void main(String[] args) {
        LanchoneteFactory sanduicheCG = new LanchoneteFactoryCG();
        LanchoneteFactory sanduicheJP = new LanchoneteFactoryJP();
        LanchoneteFactory sanduicheRT = new LanchoneteFactoryRT();

        System.out.println("\n---- Sanduiche CG ---- ");
        Sanduiche sanduiche = sanduicheCG.pedeSanduiche();
        System.out.println("\n---- Sanduiche JP ---- ");
        sanduiche = sanduicheJP.pedeSanduiche();
        System.out.println("\n---- Sanduiche RT ---- ");
        sanduiche = sanduicheRT.pedeSanduiche();
    }
}
