package ee.ufcg.maratonajava.javacore.ZZJcrud.conn;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection() throws SQLException{
        String url = "jdbc:mysql://localhost:3307/anime_store";
        String username = "root";
        String password = "root";


        return DriverManager.getConnection(url, username, password);

    }



}
