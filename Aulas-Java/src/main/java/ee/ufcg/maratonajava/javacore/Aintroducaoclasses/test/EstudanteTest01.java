package ee.ufcg.maratonajava.javacore.Aintroducaoclasses.test;

import ee.ufcg.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();

        estudante.nome = "Bruno";
        estudante.idade = 23;
        estudante.sexo = 'M';

        estudante.toString();


    }
}
