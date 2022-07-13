package Bridge.negocio;

import Bridge.negocio.ClasseNegocio;
import Bridge.persistencia.Persistencia;

public class Pessoa implements ClasseNegocio {
    @Override
    public void persiste(Persistencia formato) {
        formato.getFormato();
    }
}
