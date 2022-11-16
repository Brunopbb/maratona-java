package ee.ufcg.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import ee.ufcg.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Aircraft;
import ee.ufcg.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletonEager;

public class AircraftSingletonEagerTest01 {
    public static void main(String[] args) {


        bookSeat("1A");
        bookSeat("1A");
        bookSeat("1A");


    }

    public static void bookSeat(String seat){

        AircraftSingletonEager aircraft = AircraftSingletonEager.getINSTANCE();
        System.out.println(aircraft.bookSeat(seat));

    }

}
