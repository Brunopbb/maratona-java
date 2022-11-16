package ee.ufcg.maratonajava.javacore.YColecoes.test;

import ee.ufcg.maratonajava.javacore.YColecoes.dominio.Manga;
import ee.ufcg.maratonajava.javacore.YColecoes.dominio.SmartPhone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartPhoneMarcaComparator implements Comparator<SmartPhone>{

    @Override
    public int compare(SmartPhone o1, SmartPhone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<SmartPhone> set = new TreeSet<>(new SmartPhoneMarcaComparator());

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());

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

        //descendingSet -> inverte a ordem
        for(Manga manga : mangas){
            System.out.println(manga);
        }
        System.out.println("---------------------------");
        System.out.println(mangas.ceiling(manga3));

        //lower <
        //floor <=
        //higher >
        //ceiling >=
        //pollFirst -> remove o primeiro da lista e retorna
        //pollLast -> remove o ultimo da lista e retorna




    }
}
