package ee.ufcg.maratonajava.javacore.YColecoes.test;

import ee.ufcg.maratonajava.javacore.YColecoes.dominio.Consumidor;
import ee.ufcg.maratonajava.javacore.YColecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {

        Consumidor consumidor1 = new Consumidor("Bruno Almeida");
        Consumidor consumidor2 = new Consumidor("Anselmo Luiz");

        Manga manga1 = new Manga(5L, "naruto", 19.90, 4);
        Manga manga2 = new Manga(6L, "Pokemon", 20.80, 9);
        Manga manga3 = new Manga(9L, "Dragon ball z", 9.98, 9);
        Manga manga4 = new Manga(2L, "Berserk", 45.7, 1);
        Manga manga5 = new Manga(3L, "Boruto", 97.0, 78);

        Map<Consumidor, Manga> consumidorMangaMap = new HashMap<>();

        consumidorMangaMap.put(consumidor1, manga1);
        consumidorMangaMap.put(consumidor2, manga4);


        for(Map.Entry<Consumidor, Manga> entry : consumidorMangaMap.entrySet()){
            System.out.println(entry.getKey().getName()+": "+entry.getValue().getNome());
        }

    }

}
