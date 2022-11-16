package ee.ufcg.maratonajava.javacore.Bintroducaometodos.test;

import ee.ufcg.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};


        calculadora.somaVarArgs(1,2,3,4,5,6,7,8,9);
    }
}
