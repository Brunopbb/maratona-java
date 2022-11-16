package ee.ufcg.maratonajava.javacore.Wnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.ZoneId;

public class BasicFilesAtributtesTest02 {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("/home/bruno/Documents/My files/Java/maratona-java/pasta/novo_arquivo.txt");

        BasicFileAttributes basicFileAttributes =  Files.readAttributes(path, BasicFileAttributes.class);

        FileTime f1 = basicFileAttributes.creationTime();
        FileTime f2 = basicFileAttributes.lastModifiedTime();
        FileTime f3 = basicFileAttributes.lastAccessTime();

        System.out.println("Creation: "+f1);
        System.out.println("Modify: "+f2);
        System.out.println("Access: "+f3);

    }


}
