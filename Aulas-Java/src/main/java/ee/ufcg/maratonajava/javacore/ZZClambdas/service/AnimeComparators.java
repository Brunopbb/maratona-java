package ee.ufcg.maratonajava.javacore.ZZClambdas.service;

import ee.ufcg.maratonajava.javacore.ZZClambdas.dominio.Anime;

import java.util.List;

public class AnimeComparators {

    public static int compareByTitle(Anime anime1, Anime anime2){
        return anime1.getTitle().compareTo(anime2.getTitle());
    }

    public static int compareByEpisodes(Anime anime1, Anime anime2){
        return Integer.compare(anime1.getEpisodes(), anime2.getEpisodes());
    }

    public int compareByEpisodesNonStatic(Anime anime1, Anime anime2){
        return Integer.compare(anime1.getEpisodes(), anime2.getEpisodes());
    }

    public static void removeByName(List<Anime> animes, String nome){

    }


}
