package ee.ufcg.maratonajava.javacore.ZZAclassesinternas;


import ee.ufcg.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClassesAnonimasTest02 {
    public static void main(String[] args) {

        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("lancha"), new Barco("canoa")));

//        barcoList.sort(new Comparator<Barco>() {
//            @Override
//            public int compare(Barco o1, Barco o2) {
//                return o1.getNome().compareTo(o2.getNome());
//            }
//        });


        //barcoList.sort(Comparator.comparing(Barco::getNome));


        System.out.println(barcoList);
    }
}
