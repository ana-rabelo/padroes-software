package Bridge.negocio;

import Bridge.persistencia.Persistencia;

public interface ClasseNegocio {
    void persiste(Persistencia formato);
}
