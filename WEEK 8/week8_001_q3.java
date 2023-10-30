import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class week8_001_q3 {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost/StudentDatabase";
        String username = "root"; // Replace with your MySQL username
        String password = "manvitha@2004"; // Replace with your MySQL password

        try {
            // 1. Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish a database connection
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // 3. Create a SQL query to retrieve data
            String sqlQuery = "SELECT * FROM Students";

            // 4. Execute the query
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            // 5. Process the result set
            while (resultSet.next()) {
                int studentId = resultSet.getInt("student_id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                System.out.println("Student ID: " + studentId);
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println();
            }

            // 6. Close the database connection
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

