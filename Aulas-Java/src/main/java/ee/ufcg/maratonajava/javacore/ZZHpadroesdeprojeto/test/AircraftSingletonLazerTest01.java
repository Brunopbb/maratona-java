package ee.ufcg.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import ee.ufcg.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletonEager;
import ee.ufcg.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletonLazer;

public class AircraftSingletonLazerTest01 {
    public static void main(String[] args) {


        bookSeat("1A");
        bookSeat("1A");
        bookSeat("1A");


    }

    public static void bookSeat(String seat){

        AircraftSingletonLazer aircraft = AircraftSingletonLazer.getINSTANCE();
        System.out.println(aircraft.bookSeat(seat));

    }

}
