package ee.ufcg.maratonajava.javacore.GAssociacao.test;

import ee.ufcg.maratonajava.javacore.GAssociacao.dominio.Estudante;
import ee.ufcg.maratonajava.javacore.GAssociacao.dominio.Local;
import ee.ufcg.maratonajava.javacore.GAssociacao.dominio.Professor2;
import ee.ufcg.maratonajava.javacore.GAssociacao.dominio.Seminario;

public class AssociacaoTest {

    public static void main(String[] args) {

        Seminario seminario1 = new Seminario("Como ficar pobre");
        Seminario seminario2 = new Seminario("economia");
        Seminario seminario3 = new Seminario("como ser um coach quantico");

        Local local1 = new Local("Rua 1");
        Local local2 = new Local("Rua 2");


        Estudante estudante1 = new Estudante("Bruno", 23);
        Estudante estudante2 = new Estudante("Maria", 25);
        Estudante estudante3 = new Estudante("Sabrina", 35);
        Estudante estudante4= new Estudante("Thiago", 40);

        Professor2 professor1 = new Professor2("Jubileu", "deixar o povo pobre e coach");
        Professor2 professor2 = new Professor2("Julius", "economizar");

    }

}
