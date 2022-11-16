package ee.ufcg.maratonajava.javacore.YColecoes.test;

import ee.ufcg.maratonajava.javacore.YColecoes.dominio.SmartPhone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {

    public static void main(String[] args) {

        SmartPhone smartPhone1 = new SmartPhone("AAAA", "Apple");
        SmartPhone smartPhone2 = new SmartPhone("BBBB", "Samsung");
        SmartPhone smartPhone3 = new SmartPhone("CCCC", "Motorola");

        List<SmartPhone> smartPhoneList = new ArrayList<>();

        smartPhoneList.add(smartPhone1);
        smartPhoneList.add(smartPhone2);
        smartPhoneList.add(smartPhone3);

        for(SmartPhone smartPhone : smartPhoneList){
            System.out.println(smartPhone);
        }

        SmartPhone smartPhone4 = new SmartPhone("CCCC", "Motorola");
        System.out.println(smartPhoneList.contains(smartPhone4));

        int i = smartPhoneList.indexOf(smartPhone4);

        if(i == -1){
            System.out.println("O smartphone não existe!");
        }else{
            System.out.println("O smartPhone está na posicao "+i);
        }



    }
}
