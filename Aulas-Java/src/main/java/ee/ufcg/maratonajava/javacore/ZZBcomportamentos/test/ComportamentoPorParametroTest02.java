package ee.ufcg.maratonajava.javacore.ZZBcomportamentos.test;

import ee.ufcg.maratonajava.javacore.ZZBcomportamentos.dominio.Car;
import ee.ufcg.maratonajava.javacore.ZZBcomportamentos.interfaces.CarPredicate;
import ee.ufcg.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {

    private static List<Car> carList = List.of(new Car("verde", 1985), new Car("azul", 1878), new Car("vermelho", 2022));
    private static List<Barco> barcoList = List.of(new Barco("Lancha"), new Barco("canoa"));

    public static void main(String[] args) {

        System.out.println(filter(carList, car -> car.getYear() < 2000));
        System.out.println(filter(barcoList, barco -> barco.getNome().equalsIgnoreCase("canoa")));

    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> listFiltered = new ArrayList<>();
        for(T t : list){
            if(predicate.test(t)){
                listFiltered.add(t);
            }
        }

        return listFiltered;
    }



}

