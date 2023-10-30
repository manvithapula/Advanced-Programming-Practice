import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class week8_001_q7 {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/mydb"; // Update with your database URL
        String username = "root"; // Update with your database username
        String password = "manvitha@2004"; // Update with your database password

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            String sql = "SELECT first_name, last_name FROM employees WHERE id = ?";

            // Create a PreparedStatement
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 2); // Set the parameter (1-based index)

            // Execute the query
            ResultSet resultSet = preparedStatement.executeQuery();

            // Process the results
            while (resultSet.next()) {
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                System.out.println("Name: " + firstName + " " + lastName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
