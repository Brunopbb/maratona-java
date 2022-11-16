package ee.ufcg.maratonajava.javacore.Csobrecargademetodos.test;

import ee.ufcg.maratonajava.javacore.Csobrecargademetodos.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Naruto", "Luta", 1000, "Desenho");

        anime.imprime();
    }
}
