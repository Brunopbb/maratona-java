package ee.ufcg.maratonajava.javacore.Lclassesabstratas.test;

import ee.ufcg.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import ee.ufcg.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Bruno", 5000);
        System.out.println(gerente);


    }
}
