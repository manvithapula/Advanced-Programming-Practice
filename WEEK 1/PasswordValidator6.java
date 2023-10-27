import java.util.Scanner;
public class PasswordValidator6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        scanner.close();

        if (isValidPassword(password)) {
        System.out.println("Password is valid.");
        } else {
        System.out.println("Password is invalid. Please follow the validation rules.");
        }
        }

public static boolean isValidPassword(String password) {
        // Check minimum and maximum length
        if (password.length() < 6 || password.length() > 16) {
        return false;
        }

        // Check if there is at least 1 lowercase letter, 1 uppercase letter, and 1 digit
        boolean hasLowercaseLetter = false;
        boolean hasUppercaseLetter = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
        if (Character.isLowerCase(ch)) {
        hasLowercaseLetter = true;
        } else if (Character.isUpperCase(ch)) {
        hasUppercaseLetter = true;
        } else if (Character.isDigit(ch)) {
        hasDigit = true;
        }
        }

        // Check if there is at least 1 character from [$#@]
        boolean hasSpecialCharacter = password.matches(".*[$#@].*");

        // Return true only if all conditions are met
        return hasLowercaseLetter && hasUppercaseLetter && hasDigit && hasSpecialCharacter;
       }
        }