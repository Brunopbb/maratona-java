package ee.ufcg.maratonajava.javacore.Npolimorfismo.test;

import ee.ufcg.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import ee.ufcg.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import ee.ufcg.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import ee.ufcg.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest02 {

    public static void main(String[] args) {
        Produto produto1 = new Computador("MAC 10", 15000);
        Produto produto2 = new Tomate("verde", 15);

        CalculadoraImposto.calcularImpostoProduto(produto2);
        System.out.println("---------------");
        CalculadoraImposto.calcularImpostoProduto(produto1);

    }
}
