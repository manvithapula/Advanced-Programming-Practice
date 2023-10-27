import java.util.Scanner;

public class CountDigitsAndLetters5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        int letterCount = 0;
        int digitCount = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                letterCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        System.out.println("Letters " + letterCount);
        System.out.println("Digits " + digitCount);
    }
}
