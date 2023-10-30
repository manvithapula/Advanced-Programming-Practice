import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class week8_001_q4 {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/StudentDatabase"; // Replace with your database URL
        String username = "root"; // Replace with your MySQL username
        String password = "manvitha@2004"; // Replace with your MySQL password

        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            String query = "SELECT * FROM Students";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int studentId = resultSet.getInt("student_id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                System.out.println("Student ID: " + studentId + ", Name: " + name + ", Age: " + age);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
