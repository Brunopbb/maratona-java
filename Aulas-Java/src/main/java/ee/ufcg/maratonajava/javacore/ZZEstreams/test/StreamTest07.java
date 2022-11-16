package ee.ufcg.maratonajava.javacore.ZZEstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest07 {
    public static void main(String[] args) {

        IntStream.rangeClosed(1, 50).filter(n -> n%2 == 0).forEach(n -> System.out.print(n+" "));
        System.out.println();
        IntStream.range(1, 50).filter(n -> n%2 == 0).forEach(n-> System.out.print(n+" "));
        System.out.println();

        Stream.of("Meu", "nome", "eh", "Bruno")
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s+" "));

        int[] num = {1, 2, 3, 4, 5};
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);

        try(Stream<String> lines = Files.lines(Paths.get("/home/bruno/Documents/My files/Java/maratona-java/pasta/teste.txt"))){

            lines.filter(s -> s.contains("Java")).forEach(System.out::println);

        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
