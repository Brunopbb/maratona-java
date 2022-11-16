package ee.ufcg.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {

//        Optional<String> o1 = Optional.of("Teste");
//        Optional<String> o2 = Optional.empty();
//        Optional<String> o3 = Optional.ofNullable(null);
//
//        System.out.println(o1);
//        System.out.println(o2);
//        System.out.println(o3);


        Optional<String> nameOptional = findName("Bruno");
        String empty = nameOptional.orElse("Empty");
        nameOptional.ifPresent(System.out::println);
        System.out.println(empty.toUpperCase());


    }

    private static Optional<String> findName(String name){
        List<String> list = List.of("Bruno", "Sabrina");
        int i = list.indexOf(name);
        if(i != -1){
            return Optional.of(list.get(i));
        }

        return Optional.empty();
    }
}
