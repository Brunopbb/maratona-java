package ee.ufcg.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {

        File file = new File("file.txt");

        try(FileWriter fileWriter = new FileWriter(file)){
            fileWriter.write("Testando escrita em arquivo");
            fileWriter.flush();
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
