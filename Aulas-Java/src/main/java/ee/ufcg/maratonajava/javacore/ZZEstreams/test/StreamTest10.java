package ee.ufcg.maratonajava.javacore.ZZEstreams.test;

import ee.ufcg.maratonajava.javacore.ZZEstreams.dominio.Category;
import ee.ufcg.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest10 {

    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.DRAMA),
            new LightNovel("overlod", 3.99, Category.ROMANCE),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No game No life", 2.99, Category.ROMANCE),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.ROMANCE),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.DRAMA),
            new LightNovel("Monogatari", 4.99, Category.FANTASY)
    ));

    public static void main(String[] args) {

        Map<Category, List<LightNovel>> categoryListMap = new HashMap<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();

        for(LightNovel l : lightNovelList){
            switch (l.getCategory()){
                case DRAMA -> drama.add(l);
                case FANTASY -> fantasy.add(l);
                case ROMANCE -> romance.add(l);

            }
        }

        categoryListMap.put(Category.DRAMA, drama);
        categoryListMap.put(Category.FANTASY, fantasy);
        categoryListMap.put(Category.ROMANCE, romance);

        System.out.println(categoryListMap);


        Map<Category, List<LightNovel>> collect = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory));

        System.out.println(collect);


    }
}
