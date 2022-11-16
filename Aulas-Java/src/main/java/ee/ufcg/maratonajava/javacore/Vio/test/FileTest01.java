package ee.ufcg.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {

        File file = new File("texto.txt");

        try {
            Boolean isCreated = file.createNewFile();
            System.out.println(isCreated);
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            System.out.println(file.isDirectory());
            System.out.println(Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime());
            System.out.println(file.isHidden());
            boolean exists = file.exists();
            if(exists){
                file.delete();
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
