package ee.ufcg.maratonajava.javacore.YColecoes.test;

import ee.ufcg.maratonajava.javacore.YColecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByNameComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getNome().compareTo(manga2.getNome());
    }
}

public class MangaSortTest01 {

    public static void main(String[] args) {

        List<Manga> mangaList = new ArrayList<>();

        mangaList.add(new Manga(5, "naruto"));
        mangaList.add(new Manga(6, "Pokemon"));
        mangaList.add(new Manga(9, "Dragon ball z"));
        mangaList.add(new Manga(2, "Berserk"));
        mangaList.add(new Manga(3, "Boruto"));


        Manga bookRemove = new Manga(3, "chupa pomba");

        for(Manga manga : mangaList){
            System.out.println(manga);
        }
        System.out.println("-----------------------------");
        System.out.println(mangaList.remove(bookRemove));

        for(Manga manga : mangaList){
            System.out.println(manga);
        }




    }
}
