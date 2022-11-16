package ee.ufcg.maratonajava.javacore.ZZkjunit.dominio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MangaTest {

    private Manga manga1;
    private Manga manga2;

    @BeforeEach
    public void setUp(){
        manga1 = new Manga("Naruto", 500);
        manga2 = new Manga("Naruto", 500);

    }


    @Test
    public void accessors_ReturnData_WhenInitialized(){
        Assertions.assertEquals("Naruto", manga1.name());
        Assertions.assertEquals(500, manga1.episodes());
    }

    @Test
    public void equals_ReturnTrue_WhenObjectsAreThenSame(){
        Assertions.assertEquals(manga1, manga2);

    }
    @Test
    public void hashcode_ReturnTrue_WhenObjectsAreThenSame(){
        Assertions.assertEquals(manga1.hashCode(), manga2.hashCode());

    }

    @Test
    public void constructor_ThrowNullPointerException_WhenNameIsNull(){
        Assertions.assertThrows(NullPointerException.class, () -> new Manga(null, 12));
    }

    @Test
    public void isRecord_ReturnTrue_WhenCalledFromManga(){
        Assertions.assertTrue(Manga.class.isRecord());
    }

}