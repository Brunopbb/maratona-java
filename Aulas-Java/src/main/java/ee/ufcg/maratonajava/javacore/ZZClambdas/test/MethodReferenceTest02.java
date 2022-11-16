package ee.ufcg.maratonajava.javacore.ZZClambdas.test;

import ee.ufcg.maratonajava.javacore.ZZClambdas.dominio.Anime;
import ee.ufcg.maratonajava.javacore.ZZClambdas.service.AnimeComparators;
import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {

        AnimeComparators animeComparators = new AnimeComparators();

        List<Anime> animeList = new ArrayList<>(List.of(new Anime("naruto", 500), new Anime("berserk", 43), new Anime("one piece", 900)));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);


        System.out.println(animeList);
    }
}
