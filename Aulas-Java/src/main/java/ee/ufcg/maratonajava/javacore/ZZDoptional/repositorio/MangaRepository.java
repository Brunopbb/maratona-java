package ee.ufcg.maratonajava.javacore.ZZDoptional.repositorio;

import ee.ufcg.maratonajava.javacore.ZZDoptional.domain.Manga;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga(1, "naruto", 500), new Manga(2, "DBZ", 120), new Manga(3, "Boku no hero", 50));

    public static Optional<Manga> findBy(Predicate<Manga> predicate){

        Manga found = null;

        for(Manga manga : mangas){
            if(predicate.test(manga)){
                found = manga;
            }
        }

        return Optional.ofNullable(found);

    }

    public static Optional<Manga> findByTitle(String title){
        return findBy(manga -> manga.getTitle().equals(title));
    }

    public static Optional<Manga> findById(Integer id){
        return findBy(manga -> manga.getId().equals(id));
    }

}
