package ee.ufcg.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import ee.ufcg.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Aircraft;

public class AircraftTest01 {
    public static void main(String[] args) {


        bookSeat("1A");
        bookSeat("1A");
        bookSeat("1A");


    }

    public static void bookSeat(String seat){
        Aircraft aircraft = new Aircraft("734-199");
        System.out.println(aircraft.bookSeat(seat));

    }

}
