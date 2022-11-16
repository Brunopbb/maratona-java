package ee.ufcg.maratonajava.javacore.Zgenerics.test;


import java.util.ArrayList;
import java.util.List;

public class WildCardTest02 {
    public static void main(String[] args) {

        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        List<Animal> animals = List.of(new Cachorro(), new Gato());



        printConsulta(animals);
        printConsultaAnimal(animals);

    }
    //type erasure
    public static void printConsulta(List<? extends Animal> animais){

        for(Animal animal : animais){
            animal.consulta();
        }


    }

    public static void printConsultaAnimal(List<? super Animal> animais){
//        for(Object object : animais){
//            if(object instanceof Cachorro){
//                ((Cachorro) object).consulta();
//            }else {
//                ((Gato) object).consulta();
//            }
//        }

        animais.add(new Gato());
        animais.add(new Cachorro());

    }

}
