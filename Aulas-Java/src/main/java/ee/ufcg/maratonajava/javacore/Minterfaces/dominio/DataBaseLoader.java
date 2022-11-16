package ee.ufcg.maratonajava.javacore.Minterfaces.dominio;

import ee.ufcg.maratonajava.javacore.Minterfaces.dominio.DataLoader;

public class DataBaseLoader implements DataLoader, DataRemove {

    public void loader(){
        System.out.println("Carregando dados dos banco de dados");
    }

    public void remove(){
        System.out.println("Removendo dados do banco de dados");
    }

    public void checkPermission(){
        System.out.println("Checando permissoes do banco de dados");
    }


    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na classe");
    }

}

