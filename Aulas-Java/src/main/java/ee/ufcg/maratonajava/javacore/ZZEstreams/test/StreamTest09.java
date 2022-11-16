package ee.ufcg.maratonajava.javacore.ZZEstreams.test;

import ee.ufcg.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest09 {


    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("overlod", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No game No life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 50.99)
    ));

    public static void main(String[] args) {

        System.out.println(lightNovelList.stream().collect(Collectors.counting()));

        lightNovelList.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);
        lightNovelList.stream().collect(Collectors.minBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);

        DoubleSummaryStatistics collect = lightNovelList.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));

        System.out.println(collect);

        String titles = lightNovelList.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));

        System.out.println(titles);



    }
}
