package ee.ufcg.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {

        Locale localeDefault = Locale.getDefault();
        Locale localePT = new Locale("pt", "BR");
        Locale localeIT = new Locale("it", "IT");
        Locale localeJA = new Locale("ja", "");

        NumberFormat[] nfa = new NumberFormat[4];
        double valor = 10_000.1251;

        nfa[0] = NumberFormat.getInstance(localeDefault);
        nfa[1] = NumberFormat.getInstance(localePT);
        nfa[2] = NumberFormat.getInstance(localeIT);
        nfa[3] = NumberFormat.getInstance(localeJA);

        for(NumberFormat numberFormat : nfa){
            System.out.println(numberFormat.format(valor));
        }

    }
}
