package ee.ufcg.maratonajava.javacore.Npolimorfismo.test;

import ee.ufcg.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import ee.ufcg.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import ee.ufcg.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {

    public static void main(String[] args) {

        Computador computador = new Computador("MAC", 10000);
        Tomate tomate = new Tomate("Tomate verde", 10);

        CalculadoraImposto.calcularImpostoProduto(computador);
        CalculadoraImposto.calcularImpostoProduto(tomate);



    }

}
