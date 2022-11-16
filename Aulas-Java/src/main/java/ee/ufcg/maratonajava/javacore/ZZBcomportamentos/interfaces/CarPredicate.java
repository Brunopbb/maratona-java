package ee.ufcg.maratonajava.javacore.ZZBcomportamentos.interfaces;

import ee.ufcg.maratonajava.javacore.ZZBcomportamentos.dominio.Car;

@FunctionalInterface
public interface CarPredicate {

    boolean test(Car car);


}
