package Bridge.persistencia;

import Bridge.persistencia.Persistencia;

public class JSON implements Persistencia {

    @Override
    public void getFormato(){
        System.out.println("Persistência com JSON...");
    }
}
