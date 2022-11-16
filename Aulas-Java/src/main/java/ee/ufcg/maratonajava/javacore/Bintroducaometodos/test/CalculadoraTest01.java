package ee.ufcg.maratonajava.javacore.Bintroducaometodos.test;

import ee.ufcg.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros(1, 5);
        System.out.println(calculadora.divideDoisNumeros(1, 2));
        System.out.println(calculadora.multiplicaDoisNumeros(5, 5));
    }
}
