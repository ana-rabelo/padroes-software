package Bridge.negocio;

import Bridge.persistencia.Persistencia;

public class Carro implements ClasseNegocio {
    @Override
    public void persiste(Persistencia formato) {
        formato.getFormato();
    }
}
