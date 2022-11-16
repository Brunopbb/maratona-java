package ee.ufcg.maratonajava.javacore.ZZDoptional.test;

import ee.ufcg.maratonajava.javacore.ZZClambdas.dominio.Anime;
import ee.ufcg.maratonajava.javacore.ZZDoptional.domain.Manga;
import ee.ufcg.maratonajava.javacore.ZZDoptional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {

    public static void main(String[] args) {

        Optional<Manga> mangaOptional = MangaRepository.findByTitle("DBZ");
        mangaOptional.ifPresent(manga -> manga.setTitle("DBZ 2"));
        System.out.println(mangaOptional);

        Manga mangaById = MangaRepository.findById(2).orElseThrow(IllegalArgumentException::new);

        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Anime ali").orElseGet(() -> new Manga(4, "Anime ali", 48));
        System.out.println(newManga);


    }
}
