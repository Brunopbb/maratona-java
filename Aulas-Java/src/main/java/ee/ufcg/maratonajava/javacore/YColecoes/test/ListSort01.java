package ee.ufcg.maratonajava.javacore.YColecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ListSort01 {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Bruno");
        nomes.add("Maria");
        nomes.add("Sabrina");
        nomes.add("Thiago");
        nomes.add("Fatima");
        nomes.add("Anselmo");
        Collections.sort(nomes);

        for(String nome : nomes){
            System.out.println(nome);
        }
    }
}
