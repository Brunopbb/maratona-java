package ee.ufcg.maratonajava.javacore.YColecoes.test;

import ee.ufcg.maratonajava.javacore.YColecoes.dominio.SmartPhone;

public class EqualsTest01 {
    public static void main(String[] args) {

        SmartPhone smartPhone1 = new SmartPhone("4545454ds", "apple");
        SmartPhone smartPhone2 = new SmartPhone("4545454ds", "Apple");


        String nome1 = "Bruno";
        String nome2 = "Bruno";



        System.out.println(smartPhone1.equals(smartPhone2)); //true
        System.out.println(smartPhone1 == smartPhone2); //false
        System.out.println(nome1.equals(nome2)); //true
        System.out.println(nome1 == nome2); //true



    }
}
