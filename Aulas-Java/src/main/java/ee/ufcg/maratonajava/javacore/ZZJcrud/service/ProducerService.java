package ee.ufcg.maratonajava.javacore.ZZJcrud.service;

import ee.ufcg.maratonajava.javacore.ZZJcrud.dominio.Producer;
import ee.ufcg.maratonajava.javacore.ZZJcrud.repository.ProducerRepository;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ProducerService {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int op){

        switch(op){
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();
            case 0 -> {}
            default -> throw new IllegalArgumentException("Invalid operation.");
        }

    }

    private static void findByName(){
        System.out.println("Type the name or empty to all");
        String name = SCANNER.nextLine();

        ProducerRepository
                .findByName(name)
                .forEach(p -> System.out.printf("[%d] - %s%n", p.getId(), p.getName()));


    }

    private static void delete(){
        System.out.println("Type one of the ids below to delete");
        findByName();
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure?");
        String choice = SCANNER.nextLine();
        if("s".equalsIgnoreCase(choice)){
            ProducerRepository.delete(id);
        }
    }

    private static void save(){

        ProducerRepository.save(getCreatedProduce());

    }

    private static Producer getCreatedProduce(){
        System.out.println("Type name of the producer: ");
        String name = SCANNER.nextLine();
        return Producer.builder().name(name).build();
    }

    private static void update(){

        System.out.println("Type the id of the object you want to update");

        Optional<Producer> producerOptional = ProducerRepository.findById(Integer.parseInt(SCANNER.nextLine()));
        if(producerOptional.isEmpty()){
            System.out.println("Producer not found");
            return;
        }

        Producer producer = producerOptional.get();
        System.out.println("Type the new name or enter to keep the same");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? producer.getName() : name;
        Producer producerUpdate = Producer.builder().name(name).id(producer.getId()).build();
        ProducerRepository.update(producerUpdate);


    }



}
