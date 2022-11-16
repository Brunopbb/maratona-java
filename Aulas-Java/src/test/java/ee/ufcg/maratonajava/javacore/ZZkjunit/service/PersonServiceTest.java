package ee.ufcg.maratonajava.javacore.ZZkjunit.service;

import ee.ufcg.maratonajava.javacore.ZZJcrud.service.AnimeService;
import ee.ufcg.maratonajava.javacore.ZZkjunit.dominio.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class PersonServiceTest {

    private Person adult;
    private Person notAdult;
    private Person notDigit;
    PersonService personService;

    @BeforeEach
    public void setUp(){
        adult = new Person(18);
        notAdult = new Person(15);
        notDigit = new Person('s');
        personService = new PersonService();
    }

    @Test
    void isAdult_ReturnFalse_WhenAgeIsLowerThan18() {

        Assertions.assertFalse(personService.isAdult(notAdult));
    }

    @Test
    void isAdult_ReturnTrue_WhenAgeIsEqualsOrGreaterThan18(){

        Assertions.assertTrue(personService.isAdult(adult));

    }

    @Test
    void isAdult_shouldThrowException_WhenPersonIsNull(){

        Assertions.assertThrows(NullPointerException.class, () -> personService.isAdult(null));

    }


    @Test
    void isAdult_ThrowException_WhenPersonAgeIsNotADigit(){

        Assertions.assertThrows(IllegalArgumentException.class, () -> personService.isAdult(notDigit));

    }











}