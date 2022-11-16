package ee.ufcg.maratonajava.javacore.ZZIjdbc.test;

import ee.ufcg.maratonajava.javacore.ZZJcrud.dominio.Producer;
import ee.ufcg.maratonajava.javacore.ZZIjdbc.service.ProduceServiceRowSet;

import java.util.List;

public class ConnectionTest02 {
    public static void main(String[] args) {

        Producer producer1 = Producer.builder().name("teste1").build();
        Producer producer2 = Producer.builder().name("teste2").build();
        Producer producer3 = Producer.builder().name("teste3").build();
        Producer producer4 = Producer.builder().name("teste4").build();


        ProduceServiceRowSet.saveTransaction(List.of(producer1, producer2, producer3, producer4));


    }
}
