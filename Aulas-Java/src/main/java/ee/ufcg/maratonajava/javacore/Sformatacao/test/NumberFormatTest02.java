package ee.ufcg.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {

        Locale localeDefault = Locale.getDefault();
        Locale localePT = new Locale("pt", "BR");
        Locale localeIT = new Locale("it", "IT");
        Locale localeJA = new Locale("ja", "");

        NumberFormat[] nfa = new NumberFormat[4];
        double valor = 1000.1251;

        nfa[0] = NumberFormat.getCurrencyInstance(localeDefault);
        nfa[1] = NumberFormat.getCurrencyInstance(localePT);
        nfa[2] = NumberFormat.getCurrencyInstance(localeIT);
        nfa[3] = NumberFormat.getCurrencyInstance(localeJA);

        for(NumberFormat numberFormat : nfa){
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }

    }
}
