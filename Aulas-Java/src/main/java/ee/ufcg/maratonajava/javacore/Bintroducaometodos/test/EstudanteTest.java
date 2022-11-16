package ee.ufcg.maratonajava.javacore.Bintroducaometodos.test;

import ee.ufcg.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import ee.ufcg.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();


        estudante1.nome = "Bruno";
        estudante1.idade = 23;
        estudante1.sexo = 'M';

        estudante2.nome = "Maria";
        estudante2.idade = 21;
        estudante2.sexo = 'F';

        //impressoraEstudante.imprime(estudante1);
        //impressoraEstudante.imprime(estudante2);

        estudante1.imprime();
        estudante2.imprime();




    }
}
