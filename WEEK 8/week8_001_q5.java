import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class week8_001_q5{
    public static void main(String[] args) {
        // Define the database URL, username, and password
        String jdbcUrl = "jdbc:mysql://localhost:3306/StudentDatabase";
        String username = "root";
        String password = "manvitha@2004";

        // Initialize the JDBC connection and statement
        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
             Statement statement = connection.createStatement()) {

            // Specify the table where you want to insert data
            String tableName = "Students";

            // Construct the SQL insert statement
            String insertSQL = "INSERT INTO Students(student_id,name,age) " +
                    "VALUES ('4', 'Ricky', '19')"; // Replace column names and values

            // Execute the SQL insert statement
            int rowsAffected = statement.executeUpdate(insertSQL);

            // Check if the insert was successful
            if (rowsAffected > 0) {
                System.out.println("Insertion successful. " + rowsAffected + " row(s) affected.");
            } else {
                System.out.println("Insertion failed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

