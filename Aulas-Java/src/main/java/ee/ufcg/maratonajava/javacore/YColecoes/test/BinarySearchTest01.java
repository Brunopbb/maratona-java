package ee.ufcg.maratonajava.javacore.YColecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
        // (-(ponto de inserção) - 1)
        Collections.sort(numeros);

        System.out.println(Collections.binarySearch(numeros, 10)); //-5
        System.out.println(Collections.binarySearch(numeros, 1)); // -2



    }
}
