

import org.postgresql.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection  {
    private static final String URL = "jdbc:postgresql://localhost:5432/FirstWebDB";

    public static Connection createConnection()  {
        Driver psDriver=new Driver();
        Connection connection=null;
        try {
            DriverManager.registerDriver(psDriver);
            connection = DriverManager.getConnection(URL,"postgres", "2936682qQ");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
