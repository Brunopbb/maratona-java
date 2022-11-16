package ee.ufcg.maratonajava.javacore.ZZAclassesinternas;

class Animal{
    public void walk(){
        System.out.println("Animal walking");
    }

}

public class ClassesAnonimasTest01 {
    public static void main(String[] args) {

        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Maria andando");
            }
        };
        animal.walk();

        Animal animal2 = new Animal(){
            @Override
            public void walk(){
                System.out.println("Bruno andando");
            }
        };

        animal2.walk();

    }
}
