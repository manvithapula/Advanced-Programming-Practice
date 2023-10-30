import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class week8_001_q6 {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/library_management_system";
        String username = "root";
        String password = "manvitha@2004";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            int bookIdToUpdate = 2; // The book ID you want to update
            String newTitle = "Updated Book Title";
            String newAuthor = "Updated Author";
            int newPublishedYear = 2022;

            String updateSQL = "UPDATE books SET title=?, author=?, published_year=? WHERE book_id=?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(updateSQL)) {
                preparedStatement.setString(1, newTitle);
                preparedStatement.setString(2, newAuthor);
                preparedStatement.setInt(3, newPublishedYear);
                preparedStatement.setInt(4, bookIdToUpdate);

                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Update successful. " + rowsAffected + " row(s) affected.");
                } else {
                    System.out.println("Update failed. Book not found.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

