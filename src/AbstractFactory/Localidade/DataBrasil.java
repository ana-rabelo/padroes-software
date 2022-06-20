package AbstractFactory.Localidade;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DataBrasil implements Data{
    Locale BRASIL = new Locale("pt", "BR");
    DateFormat data = DateFormat.getDateInstance(DateFormat.FULL,BRASIL);

    @Override
    public String toString() {
        return "DataBrasil { " +
                data.format(new Date()) +
                " }";
    }
}
