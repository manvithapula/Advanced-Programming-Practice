// Define the Sortable interface
interface Sortable {
    void sort(int[] arr);
}
// Create the BubbleSort class that implements Sortable
class BubbleSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    // Swap arr[i-1] and arr[i]
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }
}
// Create the SelectionSort class that implements Sortable
class SelectionSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                // Swap arr[i] and arr[minIndex]
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
public class Sorting1 {
    public static void main(String[] args) {
        int[] arr = {60, 30, 20, 10, 26, 16, 9};
        // Create a BubbleSort object and sort the array
        Sortable bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
        System.out.println("Sorted using Bubble Sort: " + java.util.Arrays.toString(arr));
        // Reset the array
        arr = new int[] {60, 30, 20, 10, 26, 16, 9};
        // Create a SelectionSort object and sort the array
        Sortable selectionSort = new SelectionSort();
        selectionSort.sort(arr);
        System.out.println("Sorted using Selection Sort: " + java.util.Arrays.toString(arr));
    }
}
