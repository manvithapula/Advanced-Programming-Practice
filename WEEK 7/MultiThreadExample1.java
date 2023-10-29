//RA2211003010001 week 7 Q5
public class MultiThreadExample1 {
    public static void main(String[] args) {
        Thread userThread = new UserThread1();
        Thread mainThread = new Thread(new MainThread1());
        userThread.start();

        try {
            userThread.join(); // Wait for the userThread to finish before starting the mainThread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mainThread.start();
    }
}
class UserThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("User Thread is running.");
        try {
            Thread.sleep(1000); // Sleep for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("User Thread finished.");
    }
}
class MainThread1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Main Thread is running.");
        try {
            Thread.sleep(1000); // Sleep for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main Thread finished.");
    }
}
