import java.util.Scanner;

public class GuessingGame2 {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 9) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;
        boolean guessedCorrectly = false;
        do{
            System.out.print("Guess a number between 1 and 9:");
            guess = scanner.nextInt();
            if (guess == randomNumber) {
                System.out.println("Well guessed!");
                guessedCorrectly = true;
            } else {
                System.out.println("Wrong guess. Try again.");
            }
        }while(!guessedCorrectly);
        scanner.close();
 }
}
