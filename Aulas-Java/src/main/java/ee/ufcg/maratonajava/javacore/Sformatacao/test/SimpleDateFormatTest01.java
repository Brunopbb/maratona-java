package ee.ufcg.maratonajava.javacore.Sformatacao.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatTest01 {

    public static void main(String[] args) {


        String pattern = "'Esperança' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        System.out.println(simpleDateFormat.format(Calendar.getInstance().getTime()));






    }
}
