package ee.ufcg.maratonajava.javacore.Wnio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFilesAtributtesTest01 {
    public static void main(String[] args) throws IOException {

        LocalDateTime date = LocalDateTime.now().minusDays(10);
        File file1 = new File("pasta", "texto.txt");
        file1.createNewFile();
        file1.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

        Path filePath = Paths.get("pasta", "novo_arquivo.txt");
        Files.createFile(filePath);
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(filePath, fileTime);


    }
}
