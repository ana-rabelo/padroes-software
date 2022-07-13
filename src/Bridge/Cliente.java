package Bridge;

import Bridge.negocio.Carro;
import Bridge.negocio.ClasseNegocio;
import Bridge.negocio.Pessoa;
import Bridge.persistencia.JSON;
import Bridge.persistencia.Persistencia;
import Bridge.persistencia.XML;

public class Cliente {
    public static void main(String[] args) {
        Persistencia persistenciaJSON = new JSON();
        Persistencia persistenciaXML = new XML();

        ClasseNegocio pessoa = new Pessoa();
        ClasseNegocio carro = new Carro();

        pessoa.persiste(persistenciaJSON);
        carro.persiste(persistenciaXML);
    }
}
