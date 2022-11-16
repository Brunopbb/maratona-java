package ee.ufcg.maratonajava.javacore.YColecoes.test;

import ee.ufcg.maratonajava.javacore.YColecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaIdComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga o1, Manga o2) {
        return o1.getId().compareTo(o2.getId());
    }
}

public class BinarySearchTest02 {
    public static void main(String[] args) {

        List<Manga> mangaList = new ArrayList<>();

        mangaList.add(new Manga(5, "naruto"));
        mangaList.add(new Manga(6, "Pokemon"));
        mangaList.add(new Manga(9, "Dragon ball z"));
        mangaList.add(new Manga(2, "Berserk"));
        mangaList.add(new Manga(3, "Boruto"));

        Manga mangaSearch = new Manga(9, "dragon ball z");



        Collections.sort(mangaList);

        for(Manga manga : mangaList){
            System.out.println(manga);
        }
        System.out.println("-------------------");

        mangaList.sort(new MangaIdComparator());

        for(Manga manga : mangaList){
            System.out.println(manga);
        }

        System.out.println(Collections.binarySearch(mangaList, mangaSearch, new MangaIdComparator()));


    }
}
