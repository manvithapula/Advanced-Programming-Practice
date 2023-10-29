//RA2211003010001 week 7 Q6
import java.util.LinkedList;
import java.util.Queue;
class printer1 {
    private Queue<String> jobQueue = new LinkedList<>();
    private int currentJobNumber = 1;
    public synchronized void print(String job) {
        while (Integer.parseInt(job) != currentJobNumber) {
            try {
                wait(); // Wait until it's the job's turn
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Printing Job: " + job);
        currentJobNumber++;
        notifyAll(); // Notify all waiting threads
    }
}
class PrintJob1 implements Runnable {
    private printer1 printer;
    private String jobNumber;

    public PrintJob1(printer1 printer, String jobNumber) {
        this.printer = printer;
        this.jobNumber = jobNumber;
    }
    @Override
    public void run() {
        printer.print(jobNumber);
    }
}
public class printsync1 {
    public static void main(String[] args) {
        printer1 printer = new printer1();
        Thread[] threads = new Thread[5]; // Number of jobs to print
        for (int i = 0; i < 5; i++) {
            String jobNumber = Integer.toString(i + 1);
            threads[i] = new Thread(new PrintJob1(printer, jobNumber));
        }
        for (Thread thread : threads) {
            thread.start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
