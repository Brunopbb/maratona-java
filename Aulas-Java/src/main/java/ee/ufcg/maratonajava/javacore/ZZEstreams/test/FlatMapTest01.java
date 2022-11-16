package ee.ufcg.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FlatMapTest01 {
    public static void main(String[] args) {
        //listas aninhadas

        List<List<String>> empresa = new ArrayList<>();

        List<String> devs = List.of("Bruno", "Maria");
        List<String> eng = List.of("Thiago", "anselmo");
        List<String> cont = List.of("Sabrina");
        List<String> sec = List.of("Fatima");

        empresa.add(devs);
        empresa.add(eng);
        empresa.add(cont);
        empresa.add(sec);

        //System.out.println(empresa);

        empresa.stream().flatMap(Collection::stream).forEach(System.out::println);

    }
}
