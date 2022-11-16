package ee.ufcg.maratonajava.javacore.YColecoes.test;

import ee.ufcg.maratonajava.javacore.YColecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {

        List<Manga> mangaList = new ArrayList<>();

        Manga manga1 = new Manga(5L, "naruto", 20.0, 0);
        Manga manga2 = new Manga(1L, "DBZ", 10.0, 50);
        Manga manga3 = new Manga(4L, "Berserk", 5.50, 10);
        Manga manga4 = new Manga(10L, "Pokemon", 3.0, 9);
        Manga manga5 = new Manga(8L, "One Piece", 84.0, 45);

        mangaList.add(manga1);
        mangaList.add(manga2);
        mangaList.add(manga3);
        mangaList.add(manga4);
        mangaList.add(manga5);

        Iterator<Manga> mangaIterator = mangaList.iterator();

//        while(mangaIterator.hasNext()){
//            Manga manga = mangaIterator.next();
//            if(manga.getQuantidade() == 0){
//                mangaIterator.remove();
//            }
//        }

        mangaList.removeIf(manga -> manga.getQuantidade() == 0); //programação funcional

        for(Manga manga : mangaList){
            System.out.println(manga);
        }


    }
}
