package ee.ufcg.maratonajava.javacore.YColecoes.test;

import ee.ufcg.maratonajava.javacore.YColecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {

        //Set<Manga> mangas = new LinkedHashSet<>();
        Set<Manga> mangas = new HashSet<>();

        Manga manga1 = new Manga(5L, "naruto", 20.0, 0);
        Manga manga2 = new Manga(1L, "DBZ", 10.0, 50);
        Manga manga3 = new Manga(4L, "Berserk", 5.50, 10);
        Manga manga4 = new Manga(10L, "Pokemon", 3.0, 9);
        Manga manga5 = new Manga(8L, "One Piece", 84.0, 45);

        mangas.add(manga1);
        mangas.add(manga2);
        mangas.add(manga3);
        mangas.add(manga4);
        mangas.add(manga5);

        for(Manga manga : mangas){
            System.out.println(manga);
        }

    }
}
