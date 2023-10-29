//RA2211003010001 week 7 Q10
class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }
    public void run() {
        System.out.println("Thread " + getName() + " is running with priority " + getPriority());
    }
}
public class threadpriority1 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        MyThread thread3 = new MyThread("Thread 3");
        MyThread thread4 = new MyThread("Thread 4");
        MyThread thread5 = new MyThread("Thread 5");
        // Set thread priorities (1 to 10, where 1 is the lowest and 10 is the highest)
        thread1.setPriority(Thread.MIN_PRIORITY); // Minimum priority (1)
        thread2.setPriority(3); // Priority 3
        thread3.setPriority(Thread.NORM_PRIORITY); // Normal priority (5)
        thread4.setPriority(7); // Priority 7
        thread5.setPriority(Thread.MAX_PRIORITY); // Maximum priority (10)
        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
