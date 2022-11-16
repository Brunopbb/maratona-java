package ee.ufcg.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2);

        Period p1 = Period.ofWeeks(10);
        System.out.println(p1);

        Period period = Period.between(now, nowAfterTwoYears.plusDays(18));

        System.out.println(period);

    }
}
