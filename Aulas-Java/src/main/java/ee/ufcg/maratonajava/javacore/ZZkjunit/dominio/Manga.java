package ee.ufcg.maratonajava.javacore.ZZkjunit.dominio;

import java.util.Objects;

public record Manga(String name, int episodes) {

    private static String producer; //Pode
    //private String producer; //não pode
    //Tudo que é relacionado a instancias não pode ser criado diretamente


    public Manga {
        Objects.requireNonNull(name);
    }
}
