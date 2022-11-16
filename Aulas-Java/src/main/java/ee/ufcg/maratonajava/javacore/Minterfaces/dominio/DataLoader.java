package ee.ufcg.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {

    int MAX_DATE_SIZE = 10;

    void loader();

    default void checkPermission(){
        System.out.println("Checando permissoes");
    }

    static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }



}
