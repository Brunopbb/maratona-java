package ee.ufcg.maratonajava.javacore.Vio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest01 {

    public static void main(String[] args) {

        File file = new File("file.txt");


        try(FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader)){

            String texto;
            while((texto=bufferedReader.readLine()) != null){
                System.out.println(texto);
            }

        }catch (IOException e){
            e.printStackTrace();

        }


    }
}
