package ee.ufcg.maratonajava.javacore.QStrings.test;

public class StringTest01 {
    public static void main(String[] args) {

        String name1 = "Bruno"; //String constant pool
        String name2 = "Bruno";

        System.out.println(name1 == name2); //true

        name1.concat(" Almeida"); //cria outra string no pool sem uma variavel de referencia
        name1 = name1.concat(" Almeida"); //faz a variavel de referencia nome1 referenciar " Almeida"

        System.out.println(name1 == name2); //false



    }
}
