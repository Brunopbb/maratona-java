package ee.ufcg.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {

        Locale localeItaly = new Locale("it", "IT");
        Locale localeBrasil = new Locale("pt", "BR");

        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeBrasil);

        System.out.println("Italia: ");

        System.out.println(df1.format(calendar.getTime()));

        System.out.println("Brasil");

        System.out.println(df2.format(calendar.getTime()));

    }
}
