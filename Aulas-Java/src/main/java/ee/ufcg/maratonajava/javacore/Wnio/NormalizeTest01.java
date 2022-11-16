package ee.ufcg.maratonajava.javacore.Wnio;

import java.io.BufferedReader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {

        String diretorioProjeto = "/home/bruno/dev";
        String arquivoTxt = "../../arquivo.txt";

        Path p1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(p1);

        System.out.println(p1.normalize());



    }
}
