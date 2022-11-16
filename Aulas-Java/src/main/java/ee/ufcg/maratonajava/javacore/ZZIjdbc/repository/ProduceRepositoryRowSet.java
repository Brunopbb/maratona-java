package ee.ufcg.maratonajava.javacore.ZZIjdbc.repository;

import ee.ufcg.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import ee.ufcg.maratonajava.javacore.ZZJcrud.dominio.Producer;
import ee.ufcg.maratonajava.javacore.ZZIjdbc.listener.CustomRowSetListener;
import lombok.extern.log4j.Log4j2;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@Log4j2
public class ProduceRepositoryRowSet {


//    public static void updateJdbcRowSet(Producer producer){
//
//        String sql = "UPDATE anime_store.producer SET name = ? WHERE (id = ?)";
//
//        List<Producer> producers = new ArrayList<>();
//
//        try(JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()){
//
//            jrs.setCommand(sql);
//            jrs.setString(1, producer.getName());
//            jrs.setInt(2, producer.getId());
//            jrs.execute();
//
//
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
//
//    }


    public static void updateJdbcRowSet(Producer producer){

        String sql = "SELECT * FROM anime_store.producer WHERE (id = ?)";

        List<Producer> producers = new ArrayList<>();

        try(JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()){

            jrs.addRowSetListener(new CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setInt(1, producer.getId());
            jrs.execute();

            if(!jrs.next()) return;
            jrs.updateString("name", producer.getName());
            jrs.updateRow();


        }catch (SQLException e){
            e.printStackTrace();
        }

    }



    public static List<Producer> findByNameRowSet(String name){
        String sql = "SELECT * from anime_store.producer WHERE name LIKE ?";

        List<Producer> producers = new ArrayList<>();

        try(JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()){

            jrs.addRowSetListener(new CustomRowSetListener());

            jrs.setCommand(sql);
            jrs.setString(1, String.format("%%%s%%", name));
            jrs.execute();

            while(jrs.next()){
                Producer producer = Producer
                        .builder()
                        .name(jrs.getString("name"))
                        .id(jrs.getInt("id"))
                        .build();
                producers.add(producer);

            }

        }catch (SQLException e){
            e.printStackTrace();
        }

        return producers;
    }



    public static void cachedRowSet(Producer producer){

        String sql = "SELECT * FROM anime_store.producer WHERE (id = ?)";

        List<Producer> producers = new ArrayList<>();

        try(CachedRowSet crs = ConnectionFactory.getCachedRowSet()){

            crs.addRowSetListener(new CustomRowSetListener());
            crs.setCommand(sql);

            crs.setInt(1, producer.getId());
            crs.execute();

            if(!crs.next()) return;
            crs.updateString("name", producer.getName());
            crs.updateRow();
            crs.acceptChanges();


        }catch (SQLException e){
            e.printStackTrace();
        }

    }


    public static void saveTransaction(List<Producer> producers){


        try(Connection connection = ConnectionFactory.getConnection()){

            connection.setAutoCommit(false);
            PreparedStatementSaveTransaction(connection, producers);
            connection.setAutoCommit(true);



        }catch (SQLException e){

            log.error("Error while trying to save producer '{}' ", producers, e);

        }
    }

    private static void PreparedStatementSaveTransaction(Connection connection, List<Producer> producerList) throws SQLException{

        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES (?);";

        boolean shouldRollback = false;

        for(Producer p : producerList){
            try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
                log.info("Saving producer '{}'", p.getName());

                preparedStatement.setString(1, p.getName());
                if(p.getName().equals("teste3")) throw new SQLException("can't save white fox");
                preparedStatement.execute();

            }catch (SQLException e){
                e.printStackTrace();
                shouldRollback = true;
            }
            if(shouldRollback) connection.rollback();
        }





    }



}
