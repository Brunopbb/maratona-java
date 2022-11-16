package ee.ufcg.maratonajava.javacore.Rdatas.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.of(12, 5, 3);
        LocalTime now = LocalTime.now();

        System.out.println(now);

    }
}
