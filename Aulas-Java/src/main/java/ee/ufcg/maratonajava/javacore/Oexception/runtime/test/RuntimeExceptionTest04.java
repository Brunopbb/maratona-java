package ee.ufcg.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {

    public static void main(String[] args) {

    try {
        talvezLanceException();
    }catch (SQLException | FileNotFoundException e){
        e.printStackTrace();
    }


    }

    public static void talvezLanceException() throws SQLException, FileNotFoundException{
        throw new FileNotFoundException();
    }


}
