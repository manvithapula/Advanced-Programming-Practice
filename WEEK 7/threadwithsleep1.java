//RA2211003010001 week 7 Q9
class UserThreadSleep extends Thread {
    private String k;
    private char c;
    private long sleepDuration;
    public UserThreadSleep(String name, long sleepDuration) {
        super(name);
        this.sleepDuration = sleepDuration;
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

        try {
            sleep(sleepDuration); // Sleep for the specified duration
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread " + getName() + " has completed after sleeping for " + sleepDuration + " milliseconds.");
    }
}

public class threadwithsleep1 {
    public static void main(String[] args) {
        // Create two thread objects with different sleep durations
        UserThreadSleep threadobj1 = new UserThreadSleep("ThreadA", 10);
        UserThreadSleep threadobj2 = new UserThreadSleep("ThreadB", 20);
        UserThreadSleep threadobj3 = new UserThreadSleep("ThreadC", 50);
        UserThreadSleep threadobj4 = new UserThreadSleep("ThreadD", 70);
        UserThreadSleep threadobj5 = new UserThreadSleep("ThreadE", 100);

        // Get input from the user
        String userInputString = "Hello"; // You can change this if needed
        char userInputChar = 'X'; // You can change this if needed

        // Set the inputs for the thread objects
        threadobj1.setInputs(userInputString, userInputChar);
        threadobj2.setInputs(userInputString, userInputChar);
        threadobj3.setInputs(userInputString, userInputChar);
        threadobj4.setInputs(userInputString, userInputChar);
        threadobj5.setInputs(userInputString, userInputChar);
        // Start the thread objects
        threadobj1.start();
        threadobj2.start();
        threadobj3.start();
        threadobj4.start();
        threadobj5.start();
    }
}
