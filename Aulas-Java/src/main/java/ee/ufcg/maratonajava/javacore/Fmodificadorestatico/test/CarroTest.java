package ee.ufcg.maratonajava.javacore.Fmodificadorestatico.test;

import ee.ufcg.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {

        Carro carro1 = new Carro("BMW", 200);
        Carro carro2 = new Carro("Mercedes", 150);
        Carro carro3 = new Carro("Ferrari", 220);

        Carro.setVelocidadeLimite(250);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();




    }
}
