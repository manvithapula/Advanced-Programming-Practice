import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class week8_001_q10{
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/airline_maintenances"; // Update with your database URL
        String username = "root"; // Update with your database username
        String password = "manvitha@2004"; // Update with your database password

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            // Retrieve and display aircraft data
            System.out.println("Aircraft Information:");
            PreparedStatement aircraftQuery = connection.prepareStatement("SELECT * FROM Aircraft");
            ResultSet aircraftResultSet = aircraftQuery.executeQuery();
            while (aircraftResultSet.next()) {
                System.out.println("Aircraft ID: " + aircraftResultSet.getInt("aircraft_id"));
                System.out.println("Registration Number: " + aircraftResultSet.getString("registration_number"));
                System.out.println("Make: " + aircraftResultSet.getString("make"));
                System.out.println("Model: " + aircraftResultSet.getString("model"));
                System.out.println("Year of Manufacture: " + aircraftResultSet.getInt("year_of_manufacture"));
                System.out.println();
            }

            // Retrieve and display maintenance task data
            System.out.println("Maintenance Tasks:");
            PreparedStatement maintenanceQuery = connection.prepareStatement("SELECT * FROM MaintenanceTask");
            ResultSet maintenanceResultSet = maintenanceQuery.executeQuery();
            while (maintenanceResultSet.next()) {
                System.out.println("Task ID: " + maintenanceResultSet.getInt("task_id"));
                System.out.println("Aircraft ID: " + maintenanceResultSet.getInt("aircraft_id"));
                System.out.println("Task Name: " + maintenanceResultSet.getString("task_name"));
                System.out.println("Description: " + maintenanceResultSet.getString("description"));
                System.out.println("Scheduled Date: " + maintenanceResultSet.getDate("scheduled_date"));
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
