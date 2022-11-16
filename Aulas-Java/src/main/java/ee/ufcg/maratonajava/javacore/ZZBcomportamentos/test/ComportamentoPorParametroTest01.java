package ee.ufcg.maratonajava.javacore.ZZBcomportamentos.test;

import ee.ufcg.maratonajava.javacore.ZZBcomportamentos.dominio.Car;
import ee.ufcg.maratonajava.javacore.ZZBcomportamentos.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {

    private static List<Car> carList = List.of(new Car("verde", 1985), new Car("azul", 1878), new Car("vermelho", 2022));


    public static void main(String[] args) {

        System.out.println(filterCar(carList, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equalsIgnoreCase("verde");
            }
        }));

        filterCar(carList, car -> car.getColor().equalsIgnoreCase("vermelho"));

    }

    public static List<Car> filterCar(List<Car> list, CarPredicate carPredicate){
        List<Car> filteredCar = new ArrayList<>();
        for(Car car : list){
            if(carPredicate.test(car)){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

}

