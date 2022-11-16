package ee.ufcg.maratonajava.javacore.Rdatas.test;


import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println(date);

        //calendar.add()
        //calendar.roll();



    }
}
