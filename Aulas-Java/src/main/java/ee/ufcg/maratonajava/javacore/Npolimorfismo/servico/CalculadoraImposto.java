package ee.ufcg.maratonajava.javacore.Npolimorfismo.servico;

import ee.ufcg.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import ee.ufcg.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import ee.ufcg.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto{

    public static void calcularImpostoProduto(Produto produto){
        System.out.println("Relatorio de imposto: ");

        double imposto = produto.calcularImposto();
        System.out.println("Imposto do produto: "+imposto);
        System.out.println("Nome do produto: "+produto.getNome());
        System.out.println("Valor do produto: "+produto.getValor());
        if(produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println("Data de validade: "+tomate.getDataValidade());
        }

    }



}
