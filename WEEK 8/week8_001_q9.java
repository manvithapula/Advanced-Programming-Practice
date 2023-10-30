import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class week8_001_q9 {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/mydatabase"; // Update with your database URL
        String username = "root"; // Update with your database username
        String password = "manvitha@2004"; // Update with your database password

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
             Statement statement = connection.createStatement()) {

            String sql = "SELECT * FROM students";

            // Execute the query
            ResultSet resultSet = statement.executeQuery(sql);

            // Process the results
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                int age = resultSet.getInt("age");

                System.out.println("ID: " + id + ", Name: " + firstName + " " + lastName + ", Age: " + age);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
