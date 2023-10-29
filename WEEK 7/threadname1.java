//RA2211003010001 week 7 Q3
public class threadname1 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.setName("world");
        thread.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.setName("hello");
        System.out.println("Updated Thread Name: " + thread.getName());
    }
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(5000); // Sleep for 5 seconds (5000 milliseconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String currentThreadName = Thread.currentThread().getName();
            System.out.println("Thread Name: " + currentThreadName);
        }
    }
}
