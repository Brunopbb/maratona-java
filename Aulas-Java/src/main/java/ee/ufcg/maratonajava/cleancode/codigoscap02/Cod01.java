package ee.ufcg.maratonajava.cleancode.codigoscap02;

import java.util.ArrayList;
import java.util.List;

public class Cod01 {
    public static void main(String[] args) {

        List<int[]> numeros = new ArrayList<>();

        numeros.add(new int[]{2,11, 2, 8, 9});
        numeros.add(new int[]{2,11, 2, 8, 8, 7});

        System.out.println(numeros);

    }
}
