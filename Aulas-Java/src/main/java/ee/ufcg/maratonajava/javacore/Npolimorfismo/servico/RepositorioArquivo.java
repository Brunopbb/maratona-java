package ee.ufcg.maratonajava.javacore.Npolimorfismo.servico;

import ee.ufcg.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {

    public void salvar(){
        System.out.println("Salvando no Arquivo");
    }

}
