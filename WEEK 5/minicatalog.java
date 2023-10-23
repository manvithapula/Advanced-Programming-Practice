import java.util.Scanner;

public class minicatalog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] friends = new String[5];

        // Input names of five close friends
        System.out.println("Enter the names of five close friends:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Friend " + (i + 1) + ": ");
            friends[i] = scanner.nextLine();
        }

        // Sort the friends in chronological order
        sortFriendsByChronologicalOrder(friends);

        // Display the sorted catalog
        System.out.println("\nMini Catalog (Chronological Order):");
        for (int i = 0; i < 5; i++) {
            System.out.println(friends[i]);
        }

        scanner.close();
    }

    public static void sortFriendsByChronologicalOrder(String[] friends) {
        // Bubble sort algorithm for sorting in chronological order
        int n = friends.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                // Assuming that Darshan met his friends in order
                if (friends[i - 1].compareToIgnoreCase(friends[i]) > 0) {
                    // Swap if they are not in chronological order
                    String temp = friends[i - 1];
                    friends[i - 1] = friends[i];
                    friends[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
