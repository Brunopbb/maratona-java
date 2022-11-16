package ee.ufcg.maratonajava.javacore.Rdatas.test;


import java.time.DayOfWeek;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class ObterProximoDiaUtil implements TemporalAdjuster{

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays = switch (dayOfWeek) {
            case FRIDAY -> 3;
            case SATURDAY -> 2;
            default -> 1;
        };
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

public class TemoralAdjustersTest01 {

    public static void main(String[] args) {

    }
}
