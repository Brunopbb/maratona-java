package ee.ufcg.maratonajava.javacore.Zgenerics.test;

abstract class Animal{
    public abstract void consulta();
}

class Cachorro extends Animal{
    public void consulta(){
        System.out.println("Consultando o cachorro");
    }
}

class Gato extends Animal{
    public void consulta(){
        System.out.println("Consultando Gatinho");
    }
}

public class WildCardTest01 {
    public static void main(String[] args) {

        //Animal cachorro = new Cachorro();
        //Animal gato = new Gato();

        Gato[] gatos = {new Gato(), new Gato()};
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        printConsulta(gatos);
        printConsulta(cachorros);


    }

    public static void printConsulta(Animal[] animais){
        for(Animal animal : animais){
            animal.consulta();
        }
    }

}
