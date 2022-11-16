package ee.ufcg.maratonajava.javacore.Wnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args) throws IOException {

        Path pasta = Paths.get("pasta");

        if(Files.notExists(pasta)){
            Path diretorio = Files.createDirectory(pasta);

        }

        Path subPastaPath = Paths.get("pasta/subpasta/subsubpasta");
        Files.createDirectories(subPastaPath);

        Path filePath = Paths.get(subPastaPath.toString(), "file.txt");

        if(Files.notExists(filePath)){
            Path file = Files.createFile(filePath);
        }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "FileRenamed.txt");
        Files.copy(source, target);






    }
}
