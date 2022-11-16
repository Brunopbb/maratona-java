package ee.ufcg.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest03 {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>(List.of("Sabrina", "Anselmo", "Bruno"));
        nomes.sort(String::compareTo);
        System.out.println(nomes);

        Function<String, Integer> numStringToInteger = Integer::parseInt;
        Integer num = numStringToInteger.apply("10");
        System.out.println(num);

        BiPredicate<List<String>, String> listStringByPredicate = List::contains;
        System.out.println(listStringByPredicate.test(nomes, "Fatima"));

    }
}
