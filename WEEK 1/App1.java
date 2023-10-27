import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if(number % 8 == 0 && number % 5 == 0){
            System.out.println("The number " + number + " is divisible by 8 and multiple of 5.");
        } else {
            System.out.println("The number " + number + " is not divisible by 8 and multiple of 5.");
        }
        scanner.close();
    }
}