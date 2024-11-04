
package Db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
    private static Connection connection;
    public static final String URL = System.getProperty("DB_URL");
    public static final String USER = System.getProperty("DB_USER");
    public static final String PASSWORD = System.getProperty("DB_PASSWORD");

    public static Connection getConnection() {
        if (connection == null) {
            try {
                if (URL == null || USER == null || PASSWORD == null) {
                    System.out.println("Las variables de ambiente no existen o son null");
                }
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Conexión exitosa");
            } catch (SQLException e) {
                System.out.println("Error de conexión: " + e);
                e.printStackTrace();
            }
        }
        return connection;
    }
}
