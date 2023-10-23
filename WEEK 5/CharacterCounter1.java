import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounter1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text or string: ");
        String input = scanner.nextLine();

        Map<Character, Integer> characterCount = countCharacters(input);

        System.out.println("Character count:");
        for (Map.Entry<Character, Integer> entry : characterCount.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }
    }

    public static Map<Character, Integer> countCharacters(String text) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : text.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        return charCount;
    }
}



