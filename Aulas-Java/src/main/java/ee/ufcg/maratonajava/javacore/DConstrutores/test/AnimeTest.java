package ee.ufcg.maratonajava.javacore.DConstrutores.test;


import ee.ufcg.maratonajava.javacore.DConstrutores.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "Luta", "Desenho", 122, "DC");

        anime.imprime();
    }
}
