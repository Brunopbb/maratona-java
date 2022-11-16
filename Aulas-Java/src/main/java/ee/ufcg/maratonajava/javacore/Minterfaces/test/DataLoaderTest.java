package ee.ufcg.maratonajava.javacore.Minterfaces.test;

import ee.ufcg.maratonajava.javacore.Minterfaces.dominio.DataBaseLoader;
import ee.ufcg.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import ee.ufcg.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest {

    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();




        dataBaseLoader.loader();
        fileLoader.loader();

        dataBaseLoader.remove();
        fileLoader.remove();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataBaseLoader.retrieveMaxDataSize();
        DataBaseLoader.retrieveMaxDataSize();
    }

}
