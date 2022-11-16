package ee.ufcg.maratonajava.javacore.ZZIjdbc.service;

import ee.ufcg.maratonajava.javacore.ZZJcrud.dominio.Producer;
import ee.ufcg.maratonajava.javacore.ZZIjdbc.repository.ProduceRepositoryRowSet;

import java.util.List;

public class ProduceServiceRowSet {

    public static List<Producer> findByNameRowSet(String name){
        return ProduceRepositoryRowSet.findByNameRowSet(name);
    }

    public static void updateJdbcRowSet(Producer producer){
        ProduceRepositoryRowSet.updateJdbcRowSet(producer);
    }

    public static void saveTransaction(List<Producer> producers){
        ProduceRepositoryRowSet.saveTransaction(producers);
    }

}
