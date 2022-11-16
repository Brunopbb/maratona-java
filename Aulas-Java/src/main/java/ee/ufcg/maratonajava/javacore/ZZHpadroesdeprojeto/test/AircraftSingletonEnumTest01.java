package ee.ufcg.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import ee.ufcg.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletonEnum;
import ee.ufcg.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletonLazer;

public class AircraftSingletonEnumTest01 {
    public static void main(String[] args) {

        bookSeat("1A");
        bookSeat("1A");



    }

    public static void bookSeat(String seat){
        System.out.println(AircraftSingletonEnum.INSTANCE);
        AircraftSingletonEnum instance = AircraftSingletonEnum.INSTANCE;
        System.out.println(instance.bookSeat(seat));

    }
}
