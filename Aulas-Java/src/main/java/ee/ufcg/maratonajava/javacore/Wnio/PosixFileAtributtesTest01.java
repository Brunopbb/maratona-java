package ee.ufcg.maratonajava.javacore.Wnio;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFileAtributtesTest01 {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("/home/bruno/teste.txt");
        if(Files.notExists(path)){

            Files.createFile(path);
        }
        PosixFileAttributes posixFileAttributes = Files.readAttributes(path, PosixFileAttributes.class);
        System.out.println(posixFileAttributes.permissions());
        PosixFileAttributeView posixFileAttributeView = Files.getFileAttributeView(path, PosixFileAttributeView.class);


        Set<PosixFilePermission> posixFilePermissions = PosixFilePermissions.fromString("rw-rw-rw-");
        posixFileAttributeView.setPermissions(posixFilePermissions);

        System.out.println(posixFileAttributes.permissions());



    }
}
