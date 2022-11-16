package ee.ufcg.maratonajava.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemove{

    public void loader(){

        System.out.println("Carregando dados do arquivo");

    }


    public void remove(){
        System.out.println("Removendo dados do arquivo");
    }

    public void checkPermission(){
        System.out.println("Checando permissoes do arquivo");
    }

}
