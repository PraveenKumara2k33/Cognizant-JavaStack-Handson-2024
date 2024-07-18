import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {
    private static Connection con = null;
    private static Properties props = new Properties();

    // ENSURE YOU DON'T CHANGE THE BELOW CODE WHEN YOU SUBMIT
    public static Connection getConnection() {
        try {
            FileInputStream fis = new FileInputStream("database.properties");
            props.load(fis);

            // Load the Driver Class
            Class.forName(props.getProperty("DB_DRIVER_CLASS"));

            // Create the connection now
            con = DriverManager.getConnection(
                props.getProperty("DB_URL"), 
                props.getProperty("DB_USERNAME"), 
                props.getProperty("DB_PASSWORD")
            );

        } catch (IOException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return con;
    }
}
