//RA2211003010001 week 7 Q8
import java.util.Scanner;
class UserThreadPriority extends Thread {
    private String k;
    private char c;
    public UserThreadPriority(String name) {
        super(name);
    }
    public void setInputs(String k, char c) {
        this.k = k;
        this.c = c;
    }
    @Override
    public void run() {
        // Perform your thread's tasks here
        System.out.println("Thread " + getName() + " is running.");
        System.out.println("String k: " + k);
        System.out.println("Character c: " + c);
    }
}
public class threadcreation1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create two thread objects
        UserThreadPriority threadobj1 = new UserThreadPriority("ThreadA");
        UserThreadPriority threadobj2 = new UserThreadPriority("ThreadB");
        // Get input from the user
        System.out.print("Enter a String (k): ");
        String userInputString = scanner.nextLine();
        System.out.print("Enter a Character (c): ");
        char userInputChar = scanner.next().charAt(0);
        // Set the inputs for the thread objects
        threadobj1.setInputs(userInputString, userInputChar);
        threadobj2.setInputs(userInputString, userInputChar);
        // Start the thread objects
        threadobj1.start();
        threadobj2.start();
        scanner.close();
    }
}
