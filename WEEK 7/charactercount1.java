//RA2211003010001 week 7 Q7
class SharedData {
    public static int dc = 0; // To store the digit count
    public static int cc = 0; // To store the alphabetic character count
}
class ThreadA extends Thread {
    private String str;
    public ThreadA(String str) {
        this.str = str;
    }
    @Override
    public void run() {
        int digitCount = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        SharedData.dc = digitCount;
        System.out.println("ThreadA:" + digitCount);
    }
}
class ThreadB extends Thread {
    private String str;
    public ThreadB(String str) {
        this.str = str;
    }
    @Override
    public void run() {
        int charCount = 0;

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                charCount++;
            }
        }
        SharedData.cc = charCount;
        System.out.println("ThreadB:" + charCount);
    }
}
public class charactercount1 {
    public static void main(String[] args) {
        String inputString = "Hello12345World";
        ThreadA threadA = new ThreadA(inputString);
        ThreadB threadB = new ThreadB(inputString);
        threadA.start();
        threadB.start();
        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Total Digits: " + SharedData.dc);
        System.out.println("Total Alphabetic Characters: " + SharedData.cc);
    }
}
