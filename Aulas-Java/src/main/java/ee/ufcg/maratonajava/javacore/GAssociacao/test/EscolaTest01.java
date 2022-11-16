package ee.ufcg.maratonajava.javacore.GAssociacao.test;

import ee.ufcg.maratonajava.javacore.GAssociacao.dominio.Escola;
import ee.ufcg.maratonajava.javacore.GAssociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {

        Professor professor1 = new Professor("Maria");
        Professor professor2 = new Professor("Sabrina");
        Professor professor3 = new Professor("Thiago");

        Professor[] professores = {professor1, professor2, professor3};

        Escola escola = new Escola("UFCG", professores);

        escola.imprime();

    }
}
