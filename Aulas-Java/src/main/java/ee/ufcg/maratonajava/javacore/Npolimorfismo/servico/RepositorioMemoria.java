package ee.ufcg.maratonajava.javacore.Npolimorfismo.servico;

import ee.ufcg.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {

    public void salvar(){
        System.out.println("Salvando na memoria");
    }

}
