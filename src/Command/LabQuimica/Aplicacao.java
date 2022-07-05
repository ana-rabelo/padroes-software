package Command.LabQuimica;

import Command.LabQuimica.Commands.AplicaProduto;
import Command.LabQuimica.Commands.ElevaTemperatura;

public class Aplicacao {
    public static void main(String[] args) {

        Experimento experimento = new Experimento();
        ElevaTemperatura elevaTemperatura = new ElevaTemperatura();
        AplicaProduto aplicaProduto = new AplicaProduto();

        experimento.adicionaAcao(elevaTemperatura);
        experimento.adicionaAcao(aplicaProduto);

        experimento.executaAcao();
    }

}
