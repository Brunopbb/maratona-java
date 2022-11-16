package ee.ufcg.maratonajava.javacore.Rdatas.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {


        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);

        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);

        Duration duration1= Duration.between(now, nowAfterTwoYears);
        Duration duration2 = Duration.between(timeNow, timeMinus7Hours);

        System.out.println(duration1.getSeconds());
        System.out.println(duration2.getSeconds());

    }
}
