package ee.ufcg.maratonajava.javacore.Npolimorfismo.servico;

import ee.ufcg.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {

    public void salvar(){
        System.out.println("Salvando no Banco de dados");
    }
}
