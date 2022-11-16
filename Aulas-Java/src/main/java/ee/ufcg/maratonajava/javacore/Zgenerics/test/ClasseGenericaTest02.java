package ee.ufcg.maratonajava.javacore.Zgenerics.test;

import ee.ufcg.maratonajava.javacore.Zgenerics.dominio.Barco;
import ee.ufcg.maratonajava.javacore.Zgenerics.dominio.Carro;
import ee.ufcg.maratonajava.javacore.Zgenerics.service.CarroRentavelService;
import ee.ufcg.maratonajava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Ferrari")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("canoa")));

        RentalService<Carro> carroRentalService = new RentalService<>(carrosDisponiveis);
        RentalService<Barco> barcoRentalService = new RentalService<>(barcosDisponiveis);

        Barco barco = barcoRentalService.buscarDisponivel();
        barcoRentalService.retornarAlugado(barco);
        Carro carro = carroRentalService.buscarDisponivel();
        carroRentalService.retornarAlugado(carro);


    }
}
