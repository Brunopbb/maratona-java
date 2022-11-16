package ee.ufcg.maratonajava.javacore.ZZJcrud.repository;

import ee.ufcg.maratonajava.javacore.ZZJcrud.conn.ConnectionFactory;
import ee.ufcg.maratonajava.javacore.ZZJcrud.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class ProducerRepository {

    public static List<Producer> findByName(String name){

        log.info("Finding Producer by name '{}'", name);
        List<Producer> producers = new ArrayList<>();

        try(Connection connection = ConnectionFactory.getConnection();
            PreparedStatement preparedStatement = createPrepareStatementFindByName(connection, name);
            ResultSet rs = preparedStatement.executeQuery()){

            while(rs.next()){
                Producer producer = Producer
                        .builder()
                        .name(rs.getString("name"))
                        .id(rs.getInt("id"))
                        .build();

                producers.add(producer);

            }

        }catch (SQLException e){
            log.error("Error while trying search name '{}'", name, e);
        }

        return producers;

    }

    private static PreparedStatement createPrepareStatementFindByName(Connection connection, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer WHERE name LIKE ?;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }


    public static void delete(int id){

        try(Connection connection = ConnectionFactory.getConnection();
            PreparedStatement stmt = createPrepareStatementDelete(connection, id)){

            stmt.execute();
            log.info("delete producer '{}' in the database", id);

        }catch (SQLException e){
            log.error("Error while trying to delete producer '{}' ", id, e);
        }
    }

    private static PreparedStatement createPrepareStatementDelete(Connection connection, Integer id) throws SQLException {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = ?);";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void save(Producer producer){


        try(Connection connection = ConnectionFactory.getConnection();
            PreparedStatement stmt = createPrepareStatementSave(connection, producer)){

            stmt.execute();
            log.info("Inserted producer '{}' in the database ", producer.getName());

        }catch (SQLException e){
            log.error("Error while trying to insert producer '{}'", producer.getName(), e);
        }

    }

    private static PreparedStatement createPrepareStatementSave(Connection connection, Producer producer) throws SQLException {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES (?);";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, producer.getName());
        return ps;
    }




    public static Optional<Producer> findById(Integer id){

        log.info("Finding Producer by id '{}'", id);


        try(Connection connection = ConnectionFactory.getConnection();
            PreparedStatement preparedStatement = createPrepareStatementFindById(connection, id);
            ResultSet rs = preparedStatement.executeQuery()){

            if(!rs.next()) return Optional.empty();

            return Optional.of(Producer
                    .builder()
                    .name(rs.getString("name"))
                    .id(rs.getInt("id"))
                    .build());

        }catch (SQLException e){
            log.error("Error while trying search name '{}'", e);
        }

        return Optional.empty();

    }

    private static PreparedStatement createPrepareStatementFindById(Connection connection, Integer id) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer WHERE id = ?;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }




    public static void update(Producer producer){

        log.info("Updating producer '{}'", producer);

        try(Connection connection = ConnectionFactory.getConnection();
            PreparedStatement stmt = PreparedStatementUpdate(connection, producer)){

            stmt.execute();

            log.info("update producer '{}' in the database", producer.getId());


        }catch (SQLException e){

            log.error("Error while trying to update producer '{}' ", producer.getId(), e);

        }
    }

    private static PreparedStatement PreparedStatementUpdate(Connection connection, Producer producer) throws SQLException{

        String sql = "UPDATE `anime_store`.`producer` SET `name` = ? WHERE (`id` = ?);";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, producer.getName());
        preparedStatement.setInt(2, producer.getId());
        return preparedStatement;

    }

}
