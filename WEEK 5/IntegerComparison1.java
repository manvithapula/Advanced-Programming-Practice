import java.util.Scanner;

public class IntegerComparison1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        boolean result = checkComparison(num1, num2);

        if (result) {
            System.out.println("The conditions are met.");
        } else {
            System.out.println("The conditions are not met.");
        }
    }

    public static boolean checkComparison(int a, int b) {
        return a == b || Math.abs(a - b) == 5 || a + b == 5;
    }
}
