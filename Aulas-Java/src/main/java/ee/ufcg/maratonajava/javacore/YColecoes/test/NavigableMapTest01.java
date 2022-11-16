package ee.ufcg.maratonajava.javacore.YColecoes.test;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {

        NavigableMap<String, String> navigableMap = new TreeMap<>();
        //ORDENA PELA CHAVE

        navigableMap.put("B", "Letra B");
        navigableMap.put("E", "Letra E");
        navigableMap.put("A", "Letra A");
        navigableMap.put("D", "Letra D");
        navigableMap.put("C", "Letra C");

        System.out.println(navigableMap);

        System.out.println(navigableMap.headMap("E")); //retorna todo mundo que está abaixo do parametro

    }
}
