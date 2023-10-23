import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Absentdigitsinmobilenumber1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a mobile number: ");
        String mobileNumber = scanner.nextLine();

        Set<Character> absentDigits = findAbsentDigits(mobileNumber);

        if (absentDigits.isEmpty()) {
            System.out.println("All digits are present in the mobile number.");
        } else {
            System.out.print("Digits absent in the mobile number: ");
            for (char digit : absentDigits) {
                System.out.print(digit + " ");
            }
            System.out.println();
        }
    }

    public static Set<Character> findAbsentDigits(String number) {
        Set<Character> allDigits = new HashSet<>();
        Set<Character> presentDigits = new HashSet<>();

        for (char digit = '0'; digit <= '9'; digit++) {
            allDigits.add(digit);
        }
        for (char c : number.toCharArray()) {
            if (Character.isDigit(c)) {
                presentDigits.add(c);
            }
        }
        allDigits.removeAll(presentDigits);
        return allDigits;
    }
}


