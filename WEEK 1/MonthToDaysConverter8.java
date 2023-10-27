import java.util.Scanner;

public class MonthToDaysConverter8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the month: ");
        String monthName = scanner.nextLine();
        scanner.close();

        int days = getDaysInMonth(monthName);
        if (days > 0) {
            System.out.println("Number of days in " + monthName + ": " + days);
        } else {
            System.out.println("Invalid month name. Please enter a valid month name.");
        }
    }

    public static int getDaysInMonth(String monthName) {
        String lowercaseMonth = monthName.toLowerCase();

        switch (lowercaseMonth) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                return 31;
            case "april":
            case "june":
            case "september":
            case "november":
                return 30;
            case "february":
                return 28; // Assuming it's not a leap year for simplicity
            default:
                return -1; // Invalid month name
        }
    }
}
