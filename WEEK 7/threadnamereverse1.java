//RA2211003010001 week 7 Q4
public class threadnamereverse1 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        try {
            Thread.sleep(6000); // Sleep for 6 seconds (6000 milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.setName("NewThreadName");
        System.out.println("Updated Thread Name: " + thread.getName());
    }
}
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 5; i >= 1; i--) {
            // Sleep for 6 seconds in each iteration
            try {
                Thread.sleep(6000); // Sleep for 6 seconds (6000 milliseconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread.currentThread().setName("Thread" + i);
            System.out.println("Thread Name: " + Thread.currentThread().getName());
        }
    }
}
