package ee.ufcg.maratonajava.javacore.Zgenerics.test;

import ee.ufcg.maratonajava.javacore.Zgenerics.dominio.Barco;
import ee.ufcg.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {

        criarArrayComObjeto(new Barco("Barco doido"));
        criarArrayComObjeto(new Carro("Carro doido"));

    }

    private static <T> void criarArrayComObjeto(T t){
        List<T> lista = new ArrayList<>();

    }

}
