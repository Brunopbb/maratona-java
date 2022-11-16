package ee.ufcg.maratonajava.javacore.Zgenerics.test;

import ee.ufcg.maratonajava.javacore.Zgenerics.dominio.Carro;
import ee.ufcg.maratonajava.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando o carro por um mes");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
