package ee.ufcg.maratonajava.javacore.ZZEstreams.test;

import ee.ufcg.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest04 {
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

        System.out.println(lightNovelList.stream().anyMatch(ln -> ln.getPrice() > 10));
        System.out.println(lightNovelList.stream().allMatch(ln -> ln.getPrice() > 0));
        System.out.println(lightNovelList.stream().noneMatch(ln -> ln.getPrice() < 0));

        lightNovelList.stream()
                .filter(ln -> ln.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);

    }

}
