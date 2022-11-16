package ee.ufcg.maratonajava.javacore.Rdatas.test;


import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2022, Month.JANUARY.getValue(), 9);
        LocalDate agora = LocalDate.now();

        System.out.println(date.getDayOfMonth());
        System.out.println(date.getYear());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getMonth());
        System.out.println(date);
        System.out.println(agora);


    }
}
