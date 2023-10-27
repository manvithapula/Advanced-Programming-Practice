public class SumWithRangeCheck9 {
    public static void main(String[] args) {
        int num1 = 80;
        int num2 = 130;

        int result = sumWithRangeCheck(num1, num2);
        System.out.println("Sum: " + result);
    }

    public static int sumWithRangeCheck(int a, int b) {
        int sum = a + b;
        if (sum >= 105 && sum <= 200) {
            return 200;
        }
        return sum;
    }
}