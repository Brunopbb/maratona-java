package ee.ufcg.maratonajava.javacore.Npolimorfismo.test;

import ee.ufcg.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import ee.ufcg.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import ee.ufcg.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import ee.ufcg.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

public class RepositorioTest {

    public static void main(String[] args) {

        Repositorio repositorio1 = new RepositorioArquivo();
        Repositorio repositorio2 = new RepositorioMemoria();
        Repositorio repositorio3 = new RepositorioBancoDeDados();

        repositorio1.salvar();
        repositorio2.salvar();
        repositorio3.salvar();

    }
}
