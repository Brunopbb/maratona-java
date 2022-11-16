package ee.ufcg.maratonajava.javacore.Rdatas.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Map;

public class ZoneIdTest01 {

    public static void main(String[] args) {

        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());


        LocalDateTime localDateTime = LocalDateTime.now();
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");

        System.out.println(localDateTime.now().atZone(tokyoZone));

    }
}
