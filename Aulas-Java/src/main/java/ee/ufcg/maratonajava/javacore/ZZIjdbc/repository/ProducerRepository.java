package ee.ufcg.maratonajava.javacore.ZZIjdbc.repository;

import ee.ufcg.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import ee.ufcg.maratonajava.javacore.ZZJcrud.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


@Log4j2
public class ProducerRepository {

    public static void save(Producer producer){
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());

        try(Connection connection = ConnectionFactory.getConnection();
            Statement stmt = connection.createStatement()){

            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Inserted producer '{}' in the database, rows affected '{}' ",producer.getId(), rowsAffected);

        }catch (SQLException e){
            log.error("Error while trying to insert producer '{}'", producer.getId(), e);
        }

    }

    public static void delete(int id){

        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = '%d')".formatted(id);

        try(Connection connection = ConnectionFactory.getConnection();
            Statement stmt = connection.createStatement()){


            int rowsAffected = stmt.executeUpdate(sql);
            log.info("delete producer '{}' in the database, rows affected '{}' ", id, rowsAffected);


        }catch (SQLException e){
            log.error("Error while trying to delete producer '{}' ", id, e);
        }


    }

    public static void update(Producer producer){
        String sql = "UPDATE `anime_store`.`producer` SET `name` = '%s' WHERE (`id` = '%d');".formatted(producer.getName(), producer.getId());

        try(Connection connection = ConnectionFactory.getConnection();
            Statement stmt = connection.createStatement()){

            int arrowsAffected = stmt.executeUpdate(sql);
            log.info("update producer '{}' in the database, rows affected '{}'", producer.getId(), arrowsAffected);


        }catch (SQLException e){

            log.error("Error while trying to update producer '{}' ", producer.getId(), e);

        }
    }

    public static void updatePreparedStatement(Producer producer){


        try(Connection connection = ConnectionFactory.getConnection();
            PreparedStatement stmt = PreparedStatementUpdate(connection, producer.getName(), producer.getId())){

            int arrowsAffected = stmt.executeUpdate();

            log.info("update producer '{}' in the database, rows affected '{}'", producer.getId(), arrowsAffected);


        }catch (SQLException e){

            log.error("Error while trying to update producer '{}' ", producer.getId(), e);

        }
    }

    private static PreparedStatement PreparedStatementUpdate(Connection connection, String name, Integer id) throws SQLException{

        String sql = "UPDATE `anime_store`.`producer` SET `name` = ? WHERE (`id` = ?);";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, id);
        return preparedStatement;

    }

    public static List<Producer> findAll(){
        log.info("Finding all producers");
        return findByName("");

//        List<Producer> producerList = new ArrayList<>();
//        String sql = "SELECT id, name FROM anime_store.producer";
//        try(Connection connection = ConnectionFactory.getConnection();
//            Statement stmt = connection.createStatement();
//            ResultSet resultSet = stmt.executeQuery(sql)){
//
//
//            while(resultSet.next()){
//
//                producerList.add(Producer
//                                .builder()
//                                .name(resultSet.getString("name"))
//                                .id(resultSet.getInt("id"))
//                                .build());
//            }
//
//
//        }catch(SQLException e){
//            log.error("Error trying to find all producers", e);
//        }
//
//        return producerList;

    }

    public static List<Producer> findByName(String name){

        log.info("Finding producers by name");

        List<Producer> producerList = new ArrayList<>();
        String sql = "SELECT * FROM anime_store.producer WHERE name LIKE '%%%s%%';".formatted(name); //injeção de SQL

        try(Connection connection = ConnectionFactory.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(sql)){


            while(resultSet.next()){

                producerList.add(Producer
                        .builder()
                        .name(resultSet.getString("name"))
                        .id(resultSet.getInt("id"))
                        .build());
            }


        }catch(SQLException e){
            log.error("Error trying to find all producers", e);
        }

        return producerList;

    }

    public static List<Producer> findByNamePreparedStatement(String name){

        log.info("Finding producers by name");

        List<Producer> producerList = new ArrayList<>();


        try(Connection connection = ConnectionFactory.getConnection();
            PreparedStatement stmt = createdPreparedStatementFindByName(connection, name);
            ResultSet resultSet = stmt.executeQuery();
             ){

            while(resultSet.next()){

                producerList.add(Producer
                        .builder()
                        .name(resultSet.getString("name"))
                        .id(resultSet.getInt("id"))
                        .build());
            }


        }catch(SQLException e){
            log.error("Error trying to find all producers", e);
        }

        return producerList;

    }

    private static PreparedStatement createdPreparedStatementFindByName(Connection connection, String name) throws SQLException{

        String sql = "SELECT * FROM anime_store.producer WHERE name LIKE ?;";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        return preparedStatement;

    }



    public static List<Producer> findByNameCallableStatement(String name){

        log.info("Finding producers by name");

        List<Producer> producerList = new ArrayList<>();


        try(Connection connection = ConnectionFactory.getConnection();
            CallableStatement stmt = createdCallableStatementFindByName(connection, name);
            ResultSet resultSet = stmt.executeQuery();
        ){

            while(resultSet.next()){

                producerList.add(Producer
                        .builder()
                        .name(resultSet.getString("name"))
                        .id(resultSet.getInt("id"))
                        .build());
            }


        }catch(SQLException e){
            log.error("Error trying to find all producers", e);
        }

        return producerList;

    }

    private static CallableStatement createdCallableStatementFindByName(Connection connection, String name) throws SQLException{

        String sql = "CALL sp_get_producer_by_name (?);";

        CallableStatement callableStatement = connection.prepareCall(sql);
        callableStatement.setString(1, name);
        return callableStatement;

    }







    public static void showProducerMetadata(){

        log.info("showing producers Metadata");

        String sql = "SELECT * FROM `anime_store`.`producer`";

        try(Connection connection = ConnectionFactory.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(sql)){

            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

            int columnCount = resultSetMetaData.getColumnCount();
            log.info("Columns count '{}'", columnCount);
            for (int i = 1; i <= columnCount; i++){
                log.info("Table name '{}'", resultSetMetaData.getTableName(i));
                log.info("Column name '{}'", resultSetMetaData.getColumnName(i));
                log.info("Column size '{}'", resultSetMetaData.getColumnDisplaySize(i));
                log.info("Column type '{}'", resultSetMetaData.getColumnTypeName(i));
            }


        }catch(SQLException e){
            log.error("Error trying to find all producers", e);
        }



    }


    public static void showDriverMetadata() {

        log.info("showing driver Metadata");

        String sql = "SELECT * FROM `anime_store`.`producer`";

        try (Connection connection = ConnectionFactory.getConnection()) {

            DatabaseMetaData databaseMetaData = connection.getMetaData();

            if(databaseMetaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)){
                log.info("Supports TYPE_FORWARD_ONLY");
                if(databaseMetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)){
                    log.info("and Supports CONCUR_UPDATABLE");
                }
            }


            if(databaseMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)){
                log.info("Supports TYPE_SCROLL_INSENSITIVE");
                if(databaseMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)){
                    log.info("and Supports CONCUR_UPDATABLE");
                }
            }

            if(databaseMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)){
                log.info("Supports TYPE_SCROLL_SENSITIVE");
                if(databaseMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)){
                    log.info("and Supports CONCUR_UPDATABLE");
                }
            }


        } catch (SQLException e) {
            log.error("Error trying to find all producers", e);
        }
    }


    public static void showTypeScrollWorking(){

        log.info("Showing TYPE_SCROLL_INSENSITIVE");


        String sql = "SELECT * FROM anime_store.producer;";

        try(Connection connection = ConnectionFactory.getConnection();
            Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet = stmt.executeQuery(sql)){


            log.info("Last row '{}'", resultSet.last());
            log.info("Last row number '{}'", resultSet.getRow());
            log.info(Producer.builder().name(resultSet.getString("name")).id(resultSet.getInt("id")).build());


            log.info("First row '{}'", resultSet.first());
            log.info("First row number '{}'", resultSet.getRow());
            log.info(Producer.builder().name(resultSet.getString("name")).id(resultSet.getInt("id")).build());

            log.info("Absolut row '{}'", resultSet.absolute(2));
            log.info("Absolut row number '{}'", resultSet.getRow());
            log.info(Producer.builder().name(resultSet.getString("name")).id(resultSet.getInt("id")).build());

            log.info("Relative row '{}'", resultSet.absolute(-1));
            log.info("Relative row number '{}'", resultSet.getRow());
            log.info(Producer.builder().name(resultSet.getString("name")).id(resultSet.getInt("id")).build());

            log.info("isLast row? '{}'", resultSet.isLast());
            log.info("row number '{}'", resultSet.getRow());
            log.info(Producer.builder().name(resultSet.getString("name")).id(resultSet.getInt("id")).build());



        }catch(SQLException e){
            log.error("Error trying to find all producers", e);
        }

    }

    public static List<Producer> findByNameAndUpdateToUpperCase(String name){


        List<Producer> producerList = new ArrayList<>();

        String sql = "SELECT * FROM anime_store.producer WHERE name LIKE '%%%s%%';".formatted(name);

        try(Connection connection = ConnectionFactory.getConnection();
            Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet = stmt.executeQuery(sql)){


            while(resultSet.next()){

                resultSet.updateString("name", resultSet.getString("name").toUpperCase());
                resultSet.updateRow();
                Producer producer = Producer.builder()
                        .name(resultSet.getString("name"))
                        .id(resultSet.getInt("id"))
                        .build();

                producerList.add(producer);
            }


        }catch(SQLException e){
            log.error("Error trying to find all producers", e);
        }

        return producerList;

    }

    public static List<Producer> findByNameAndInsertWhenNotFound(String name){


        List<Producer> producerList = new ArrayList<>();

        String sql = "SELECT * FROM anime_store.producer WHERE name LIKE '%%%s%%';".formatted(name);

        try(Connection connection = ConnectionFactory.getConnection();
            Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet = stmt.executeQuery(sql)){


            if(!resultSet.next()){
                resultSet.moveToInsertRow();
                resultSet.updateString("name", name);
                resultSet.insertRow();
            }


        }catch(SQLException e){
            log.error("Error trying to find all producers", e);
        }

        return producerList;

    }


}
