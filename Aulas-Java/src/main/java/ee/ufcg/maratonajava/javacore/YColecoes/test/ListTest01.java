package ee.ufcg.maratonajava.javacore.YColecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Bruno");
        nomes.add("Sabrina");
        nomes.add("Anselmo");
        nomes.add("Fatima");
        nomes.add("Maria");

        for(String nome : nomes){
            System.out.println(nome);
        }
    }
}
