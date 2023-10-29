//RA2211003010001 week 7 Q2
import java.util.LinkedList;
class SharedBuffer {
    private LinkedList<Integer> buffer = new LinkedList<>();
    private int capacity;
    public SharedBuffer(int capacity) {
        this.capacity = capacity;
    }
    public void produce(int item) throws InterruptedException {
        synchronized (this) {
            while (buffer.size() == capacity) {
                wait(); // Wait if the buffer is full
            }
            System.out.println("Producing: " + item);
            buffer.add(item);
            notify(); // Notify the consumer that an item is available
        }
    }
    public int consume() throws InterruptedException {
        synchronized (this) {
            while (buffer.isEmpty()) {
                wait(); // Wait if the buffer is empty
            }
            int item = buffer.remove();
            System.out.println("Consuming: " + item);
            notify(); // Notify the producer that space is available
            return item;
        }
    }
}
class Producer implements Runnable {
    private SharedBuffer buffer;
    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                buffer.produce(i);
                Thread.sleep(1000); // Simulate some production time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Consumer implements Runnable {
    private SharedBuffer buffer;
    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                int item = buffer.consume();
                Thread.sleep(1500); // Simulate some consumption time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class sharedbuffer1 {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(3); // Specify the buffer capacity
        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));
        producerThread.start();
        consumerThread.start();
    }
}
