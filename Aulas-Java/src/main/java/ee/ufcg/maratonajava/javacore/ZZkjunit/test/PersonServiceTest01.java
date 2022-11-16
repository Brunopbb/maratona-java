package ee.ufcg.maratonajava.javacore.ZZkjunit.test;

import ee.ufcg.maratonajava.javacore.ZZkjunit.dominio.Person;
import ee.ufcg.maratonajava.javacore.ZZkjunit.service.PersonService;
import lombok.extern.log4j.Log4j2;

@Log4j2

public class PersonServiceTest01 {
    public static void main(String[] args) {

        PersonService personService = new PersonService();

        Person person = new Person('s');
        log.info("Is adult? '{}'", personService.isAdult(person));


    }
}
