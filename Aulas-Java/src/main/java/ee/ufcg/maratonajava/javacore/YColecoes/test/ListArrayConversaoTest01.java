package ee.ufcg.maratonajava.javacore.YColecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversaoTest01 {
    public static void main(String[] args) {



        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);


        Integer[] ListToArray = numeros.toArray(new Integer[0]);

        //System.out.println(Arrays.toString(arrayNumeros));

        Integer[] numerosArray = new Integer[3];

        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numerosArray); //com o uso de asList, ArrayToList faz referencia
        //a numerosArray. Ou seja, se alterado algo em ArrayToList as mudanças surtirao efeito em numerosArray.

        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);
        //arrayToList.add(3, 12); exceção, pois asList retorna uma lista de tamanho fixo
        arrayToList.set(0, 5);
        System.out.println("------------------");
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);

    }
}
