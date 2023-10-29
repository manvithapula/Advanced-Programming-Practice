//RA2211003010001 week 6 Q9
import addition.Addition;
import subtraction.Subtraction;
import multiplication.Multiplication;

public class Arithmeticinterface1 {
    public static void main(String[] args) {
        // Perform arithmetic operations using functions from different packages
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        int num1 = 10;
        int num2 = 5;
        int sum = addition.add(num1, num2);
        int difference = subtraction.subtract(num1, num2);
        int product = multiplication.multiply(num1, num2);
        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
    }
}