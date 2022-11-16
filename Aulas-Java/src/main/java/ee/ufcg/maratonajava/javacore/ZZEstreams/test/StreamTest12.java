package ee.ufcg.maratonajava.javacore.ZZEstreams.test;

import ee.ufcg.maratonajava.javacore.ZZEstreams.dominio.Category;
import ee.ufcg.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest12 {

    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.DRAMA),
            new LightNovel("overlod", 3.99, Category.ROMANCE),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No game No life", 2.99, Category.ROMANCE),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.ROMANCE),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.DRAMA),
            new LightNovel("Monogatari", 30.99, Category.FANTASY)
    ));

    public static void main(String[] args) {

        Map<Category, Long> collect1 = lightNovelList.stream()
                        .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));

        System.out.println(collect1);

        Map<Category, Optional<LightNovel>> collect3 = lightNovelList.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));


        Map<Category, LightNovel> collect4 = lightNovelList.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));

        System.out.println(collect4);

    }
}
