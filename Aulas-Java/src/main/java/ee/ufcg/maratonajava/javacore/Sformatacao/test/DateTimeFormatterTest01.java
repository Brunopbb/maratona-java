package ee.ufcg.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest01 {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();

        String s1 = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = localDate.format(DateTimeFormatter.ISO_DATE);
        String s3 = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("--------------------------");

        LocalDate parse1 = LocalDate.parse("20220811", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2022-08-11", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2022-08-11", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

    }
}
