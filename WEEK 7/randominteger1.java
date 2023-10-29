//RA2211003010001 week 7 Q1
import java.util.Random;
class RandomNumberGenerator implements Runnable {
    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int randomNumber = random.nextInt(100); // Generate a random integer between 0 and 99
            System.out.println("Generated: " + randomNumber);

            if (randomNumber % 2 == 0) {
                synchronized (randominteger1.lock) {
                    randominteger1.value = randomNumber;
                    randominteger1.isEven = true;
                    randominteger1.lock.notifyAll();
                }
            } else {
                synchronized (randominteger1.lock) {
                    randominteger1.value = randomNumber;
                    randominteger1.isEven = false;
                    randominteger1.lock.notifyAll();
                }
            }

            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class SquareCalculator implements Runnable {
    @Override
    public void run() {
        while (true) {
            synchronized (randominteger1.lock) {
                while (!randominteger1.isEven) {
                    try {
                        randominteger1.lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                int square = randominteger1.value * randominteger1.value;
                System.out.println("Squared: " + square);
                randominteger1.isEven = false;
            }
        }
    }
}

class CubeCalculator implements Runnable {
    @Override
    public void run() {
        while (true) {
            synchronized (randominteger1.lock) {
                while (randominteger1.isEven) {
                    try {
                        randominteger1.lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                int cube = randominteger1.value * randominteger1.value * randominteger1.value;
                System.out.println("Cubed: " + cube);
                randominteger1.isEven = true;
            }
        }
    }
}

public class randominteger1 {
    public static Object lock = new Object();
    public static int value;
    public static boolean isEven = true;
    public static void main(String[] args) {
        Thread thread1 = new Thread(new RandomNumberGenerator());
        Thread thread2 = new Thread(new SquareCalculator());
        Thread thread3 = new Thread(new CubeCalculator());
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
