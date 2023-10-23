import java.util.Scanner;
public class MirrorImage1 {
    public static String getMirrorImage(String input) { //function to reverse
        StringBuilder reversed = new StringBuilder(input);
        reversed.reverse(); // Reverse the string
        return reversed.toString();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: "); //taking input
        String input = scan.nextLine();
        String mirrorImage = getMirrorImage(input);//function call
        System.out.println("Mirror Image: " + mirrorImage); //printing output
    }
}
