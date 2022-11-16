package ee.ufcg.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTes02 {
    public static void main(String[] args) {

        File diretorio = new File("arquivo");
        System.out.println(diretorio.mkdir());


        try{
            File arquivoDiretorio = new File(diretorio,"texto.txt");
            System.out.println(arquivoDiretorio.createNewFile());

            File fileRenamed = new File(diretorio, "arquivorenomeado.txt");
            System.out.println(arquivoDiretorio.renameTo(fileRenamed));

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
