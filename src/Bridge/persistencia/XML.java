package Bridge.persistencia;

import Bridge.persistencia.Persistencia;

public class XML implements Persistencia {
    @Override
    public void getFormato(){
        System.out.println("PersistĂȘncia com XML...");
    }
}
