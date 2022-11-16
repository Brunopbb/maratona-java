package ee.ufcg.maratonajava.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest08 {
    public static void main(String[] args) {

        Stream.iterate(1, n-> n + 2).limit(20).forEach(System.out::println);

        Stream.iterate(new int[]{0, 1}, n-> new int[]{n[1], n[0] + n[1]}).limit(10).forEach(a -> System.out.println(Arrays.toString(a)));

        ThreadLocalRandom random = ThreadLocalRandom.current();

        Stream.generate(() -> random.nextInt(1, 500)).limit(50).forEach(System.out::println);

    }
}
