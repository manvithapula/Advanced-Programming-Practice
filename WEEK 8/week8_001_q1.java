import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class week8_001_q1{
    public static void main(String[] args) {
        String url_001 = "jdbc:mysql://localhost:3306/mysql";
        String username_001 = "root";
        String password_001 = "manvitha@2004";
        System.out.println("Connecting to the database...");
        try (Connection connection = DriverManager.getConnection(url_001, username_001, password_001)) {
            System.out.println("Connected successfully!");
        } catch (SQLException e) {
            System.out.println("Unable to connect to the database.");
            e.printStackTrace();
        }
    }
}
