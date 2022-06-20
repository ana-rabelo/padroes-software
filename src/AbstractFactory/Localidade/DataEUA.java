package AbstractFactory.Localidade;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DataEUA implements Data{
    DateFormat data = DateFormat.getDateInstance(DateFormat.FULL,Locale.US);

    @Override
    public String toString() {
        return "DataEUA { " +
                data.format(new Date()) +
                " }";
    }
}
