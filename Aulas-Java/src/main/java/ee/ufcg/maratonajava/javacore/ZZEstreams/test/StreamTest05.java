package ee.ufcg.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest05 {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();

        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);

        integers.stream().reduce(Integer::sum).ifPresent(System.out::println);

        Integer reduce1 = integers.stream().reduce(0, Integer::sum);
        Integer reduce2 = integers.stream().reduce(0, Integer::max);
        System.out.println(reduce2);

    }
}
