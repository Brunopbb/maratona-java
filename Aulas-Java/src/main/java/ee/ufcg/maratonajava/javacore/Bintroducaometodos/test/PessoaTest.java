package ee.ufcg.maratonajava.javacore.Bintroducaometodos.test;

import ee.ufcg.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Bruno");
        pessoa.setIdade(23);
        pessoa.setSexo('M');

        System.out.println("Nome: "+pessoa.getNome());
        System.out.println("Idade: "+pessoa.getIdade());
        System.out.println("Sexo: "+pessoa.getSexo());



    }
}
