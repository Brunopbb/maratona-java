package ee.ufcg.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonLazer {
    private static AircraftSingletonLazer INSTANCE ;

    private final Set<String> availableSeats = new HashSet<>();
    private String name;

    private AircraftSingletonLazer(String name){
        this.name = name;
    }

    public static AircraftSingletonLazer getINSTANCE(){
        if(INSTANCE == null){
            INSTANCE = new AircraftSingletonLazer("787-900");
        }
        return INSTANCE;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }


}
