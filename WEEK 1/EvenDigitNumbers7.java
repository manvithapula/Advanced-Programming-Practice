public class EvenDigitNumbers7 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();

        for (int number = 100; number <= 400; number++) {
            if (hasOnlyEvenDigits(number)) {
                result.append(number).append(",");
            }
        }

        // Remove the trailing comma before printing the result
        if (result.length() > 0) {
            result.deleteCharAt(result.length() - 1);
            System.out.println(result);
        } else {
            System.out.println("No numbers found between 100 and 400 with all even digits.");
        }
    }

    public static boolean hasOnlyEvenDigits(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}
