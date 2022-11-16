package ee.ufcg.maratonajava.javacore.Bintroducaometodos.test;

import ee.ufcg.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();



        funcionario.setNome("Bruno");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[]{1500, 1600, 5000, 4811});

        funcionario.imprime();
        System.out.println("Media: "+funcionario.getMedia());

    }
}
