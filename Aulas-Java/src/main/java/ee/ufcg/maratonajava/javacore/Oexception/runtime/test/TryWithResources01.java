package ee.ufcg.maratonajava.javacore.Oexception.runtime.test;

import java.io.*;

public class TryWithResources01 {
    public static void main(String[] args) {



    }

    public static void lerArquivo2(){
        try(Reader reader = new BufferedReader(new FileReader("teste.txt"))){

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void lerArquivo(){

        //CODIGO FEIO

        Reader reader = null;

        try{
            reader = new BufferedReader(new FileReader("teste.txt"));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
            try {

                if(reader != null){

                    reader.close();
                }

            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

}
