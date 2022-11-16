package ee.ufcg.maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {

        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 9);
        forEach(numeros, (Integer n) -> print(n));
        //forEach(numeros, LambdaTest01::print);


    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T e : list){
            consumer.accept(e);
        }
    }

    private static void print(Integer num){
        System.out.println("Numero: "+num*2);
    }

}
