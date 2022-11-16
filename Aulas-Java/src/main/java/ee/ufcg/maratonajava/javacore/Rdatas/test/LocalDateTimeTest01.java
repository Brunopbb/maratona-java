package ee.ufcg.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        LocalDate localDate = LocalDate.parse("2022-08-09");
        LocalTime localTime = LocalTime.parse("16:31:05");

        System.out.println(localDateTime);
        System.out.println(localDate);
        System.out.println(localTime);
    }
}
