import java.util.ArrayList;
import java.util.List; //packages
public class EvenNumberPrinter1 { //class definition
    public static void printEvenNumbers(List<Integer> numbers) { //even number method or function
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(); //list initialization
        numbers.add(12);
        numbers.add(7);
        numbers.add(20);
        numbers.add(15);
        numbers.add(6); //adding numbers to list
        System.out.println("Even numbers in the list:");
        printEvenNumbers(numbers);
    }
}

