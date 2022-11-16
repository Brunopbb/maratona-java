package ee.ufcg.maratonajava.javacore.ZZAclassesinternas;

public class ClassesInternasTest02 {

    private String nome = "Bruno";

    public void print(){
        class Interna{
            public void print(){
                System.out.println("nome: "+nome);
            }
        }
        Interna interna = new Interna();
        interna.print();
    }

    public static void main(String[] args) {

        ClassesInternasTest02 classesInternasTest02 = new ClassesInternasTest02();
        classesInternasTest02.print();



    }

}
