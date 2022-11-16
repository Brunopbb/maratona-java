package ee.ufcg.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {

    public static void main(String[] args) {

        LocalDateTime aniversario = LocalDateTime.of(1999, 2, 2, 12, 0, 5);

        System.out.println(ChronoUnit.DAYS.between(aniversario, LocalDateTime.now()));

    }
}
