import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {


    public Connection recuperarConexao() {

        try{
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/Alura?user=postgres&password=Bernardo@13");
            //return DriverManager.getConnection("jdbc:postgresql://localhost:5432/Alura?user=postgres&password=Bernardo@13");

        } catch (SQLException e){
            throw new RuntimeException(e);
        }

        }




    }



