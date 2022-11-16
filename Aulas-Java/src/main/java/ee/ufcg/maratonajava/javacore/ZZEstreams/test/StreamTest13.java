package ee.ufcg.maratonajava.javacore.ZZEstreams.test;

import ee.ufcg.maratonajava.javacore.ZZEstreams.dominio.Category;
import ee.ufcg.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import ee.ufcg.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest13 {

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

        Map<Category, DoubleSummaryStatistics> collect = lightNovelList.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));


        Map<Category, Set<Promotion>> collect1 = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest13::getPromotion, Collectors.toSet())));

        System.out.println(collect);

    }

    private static Promotion getPromotion(LightNovel ln){
        return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}
