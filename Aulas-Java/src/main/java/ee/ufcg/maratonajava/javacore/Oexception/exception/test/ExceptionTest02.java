package ee.ufcg.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) {

        //criarNovoArquivo();

    }

    public static void criarNovoArquivo() throws IOException{
        File file = new File("/home/bruno/Documents/My files/Java/maratona-java/arquivo/test.txt");
        try{
            System.out.println(file.createNewFile());
        }catch(IOException e){
            e.printStackTrace();
            throw e;

        }
    }

}
