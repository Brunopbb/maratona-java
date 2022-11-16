package ee.ufcg.maratonajava.javacore.ZZClambdas.test;

import ee.ufcg.maratonajava.javacore.ZZClambdas.dominio.Anime;
import ee.ufcg.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {

        List<Anime> animeList = new ArrayList<>(List.of(new Anime("naruto", 500), new Anime("berserk", 43), new Anime("one piece", 900)));

        for(Anime anime : animeList){
            System.out.println(anime);
        }

        System.out.println("-----------------");
        //animeList.sort((a1, a2) -> AnimeComparators.compareByEpisodes(a1, a2));
        animeList.sort(AnimeComparators::compareByEpisodes);


        for(Anime anime : animeList){
            System.out.println(anime);
        }
    }
}
