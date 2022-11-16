package ee.ufcg.maratonajava.javacore.ZZAclassesinternas;

public class ClassesInternasTest01 {

    private String name = "MACACO";

    class Inner {

        public void printAtributoClasseExterna(){
            System.out.println(name);
        }

    }

    public static void main(String[] args) {

        ClassesInternasTest01 classesInternasTest01 = new ClassesInternasTest01();
        Inner inner = classesInternasTest01.new Inner();
        inner.printAtributoClasseExterna();

    }

}
