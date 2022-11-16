package ee.ufcg.maratonajava.javacore.ZZJcrud.test;

import ee.ufcg.maratonajava.javacore.ZZJcrud.service.ProducerService;

import java.util.Scanner;

public class CrudTest01 {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int op;

        do{
            producerMenu();
            op = Integer.parseInt(SCANNER.nextLine());
            ProducerService.menu(op);

        }while(op != 0);

    }
    private static void producerMenu(){
        System.out.println("Type the number of your operation");
        System.out.println("1. Search for producer");
        System.out.println("2. To delete");
        System.out.println("3. To save");
        System.out.println("4. To update");
        System.out.println("0. Exit");
    }





}
