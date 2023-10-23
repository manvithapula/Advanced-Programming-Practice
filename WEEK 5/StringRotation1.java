import java.util.Scanner;
public class StringRotation1 { //class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string 1: "); //string1 input
        String str1 = scanner.nextLine();
        System.out.print("Enter string 2: "); //string2 input
        String str2 = scanner.nextLine();
        boolean RotationalEquivalent = checkRotationEquivalence(str1, str2);
        System.out.println("Are two strings Rotationally equal ? : " + RotationalEquivalent);
    }
    public static boolean checkRotationEquivalence(String str1, String str2) { //method passing 2 string arguments
        if (str1.length() != str2.length()) {
            return false;
        }
        String concatenated = str1 + str1; // Concatenate str1 with itself
        return concatenated.contains(str2);
    }
}
