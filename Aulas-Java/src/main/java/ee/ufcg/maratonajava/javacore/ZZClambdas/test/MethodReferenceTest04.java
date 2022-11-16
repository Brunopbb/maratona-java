package ee.ufcg.maratonajava.javacore.ZZClambdas.test;

import ee.ufcg.maratonajava.javacore.ZZClambdas.dominio.Anime;
import ee.ufcg.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {

        Supplier<AnimeComparators> animeSupplier = AnimeComparators::new;
        AnimeComparators animeComparators = animeSupplier.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("naruto", 500), new Anime("berserk", 43), new Anime("one piece", 900)));
        System.out.println(animeList);


        BiFunction<String, Integer, Anime> byFunction = Anime::new;
        animeList.add(byFunction.apply("DBZ", 800));

        System.out.println(animeList);

    }
}
