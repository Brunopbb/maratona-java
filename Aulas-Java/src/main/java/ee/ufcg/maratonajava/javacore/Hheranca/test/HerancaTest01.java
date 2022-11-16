package ee.ufcg.maratonajava.javacore.Hheranca.test;

import ee.ufcg.maratonajava.javacore.Hheranca.dominio.Endereco;
import ee.ufcg.maratonajava.javacore.Hheranca.dominio.Funcionario;
import ee.ufcg.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        Pessoa pessoa = new Pessoa("Bruno", 23);
        Funcionario funcionario = new Funcionario("Maria", 2000.0);

        endereco.setRua("Rua 3");
        endereco.setBairro("Bairro 4");
        endereco.setCep("123456-78");


        pessoa.setEndereco(endereco);


        funcionario.setEndereco(endereco);
        funcionario.setIdade(20);


        funcionario.imprime();


    }
}
