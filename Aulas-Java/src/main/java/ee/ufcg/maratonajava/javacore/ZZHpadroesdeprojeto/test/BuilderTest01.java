package ee.ufcg.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import ee.ufcg.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Pessoa;

public class BuilderTest01 {
    public static void main(String[] args) {

        Pessoa pessoa = Pessoa.PessoaBuilder
                .builder()
                .firstName("Bruno")
                .lastName("Almeida")
                .nickname("Brunopbb")
                .email("almeidabruno99@gmail.com")
                .build();

        System.out.println(pessoa);


    }
}
