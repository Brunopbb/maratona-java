package ee.ufcg.maratonajava.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapTest02 {
    public static void main(String[] args) {

        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");

        List<String[]> collect = words.stream().map(w -> w.split("")).collect(Collectors.toList());

        List<String> collect1 = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());

        System.out.println(collect1);

    }
}
