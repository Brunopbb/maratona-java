package ee.ufcg.maratonajava.javacore.ZZIjdbc.test;


import ee.ufcg.maratonajava.javacore.ZZJcrud.dominio.Producer;

import ee.ufcg.maratonajava.javacore.ZZIjdbc.service.ProducerService;


public class ConnectionTest01 {
    public static void main(String[] args) {

        Producer producer = Producer.builder().name("Tokyo").build();
        Producer producerToUpdate = Producer.builder().id(12).name("BONES").build();

        //ProducerService.save(producer);
        //ProducerService.update(producerToUpdate);

//        System.out.println(ProducerService.findByName("naru"));
//        System.out.println(ProducerService.findAll());

//        ProducerService.showProducerMetadate();

//        System.out.println(ProducerService.findByNameAndUpdateToUpperCase("naruto"));

//        ProducerService.findByNameAndInsertWhenNotFound("Bones");

//        System.out.println(ProducerService.findByNamePreparedStatement("Bones"));
//        System.out.println(ProducerService.findByName("B or X'='X"));

//        ProducerService.updatePreparedStatement(producerToUpdate);

        System.out.println(ProducerService.findByNameCallableStatement("Tokyo"));



    }
}
