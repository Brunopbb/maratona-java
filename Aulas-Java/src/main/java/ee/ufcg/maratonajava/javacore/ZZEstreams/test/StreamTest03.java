package ee.ufcg.maratonajava.javacore.ZZEstreams.test;

import ee.ufcg.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("overlod", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No game No life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.99)
    ));
    public static void main(String[] args) {

        Stream<LightNovel> stream = lightNovelList.stream();
        lightNovelList.forEach(System.out::println);

        System.out.println(stream.filter(lightNovel -> lightNovel.getPrice() <= 4)
                .count());

        System.out.println(lightNovelList.stream().distinct()
                .filter(lightNovel -> lightNovel.getPrice() <= 4)
                .count());

    }
}
