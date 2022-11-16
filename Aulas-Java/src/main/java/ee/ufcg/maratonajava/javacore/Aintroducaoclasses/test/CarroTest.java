package ee.ufcg.maratonajava.javacore.Aintroducaoclasses.test;

import ee.ufcg.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.marca = "Fiat";
        carro1.modelo = "Mobi";
        carro1.ano = 2015;

        carro2.marca = "toyota";
        carro2.modelo = "corolla";
        carro2.ano = 2023;

        System.out.println(carro1.toString());
        System.out.println("-------------------");
        System.out.println(carro2.toString());

    }
}
