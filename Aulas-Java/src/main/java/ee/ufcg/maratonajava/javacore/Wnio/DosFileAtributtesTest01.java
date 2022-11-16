package ee.ufcg.maratonajava.javacore.Wnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DosFileAtributtesTest01 {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("pasta/teste.txt");
        if(Files.notExists(path)){
            Files.createFile(path);
        }

        Files.setAttribute(path, "pos:hidden", true);
        Files.setAttribute(path, "pos:readonly", true);

    }
}
