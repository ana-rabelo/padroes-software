package Command.LabQuimica;

import Command.LabQuimica.Commands.RoboAction;

import java.util.ArrayList;
import java.util.List;

public class Experimento {
    public List<RoboAction> roboActions;

    public Experimento(){
        this.roboActions = new ArrayList<>();
    }

    public void adicionaAcao(RoboAction roboAction){
        this.roboActions.add(roboAction);
    }

    public void executaAcao(){
        for(RoboAction acao : this.roboActions)
            acao.execute();
    }
}
