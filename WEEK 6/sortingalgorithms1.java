//RA2211003010001 week 6 Q10
// Main package
import bubblesort.BubbleSort;
        import selectionsort.SelectionSort;
        import java.util.Arrays;
public class sortingalgorithms1 {
    public static void main(String[] args) {
        int[] arr1 = {64, 34, 25, 12, 22, 11, 90};
        int[] arr2 = {64, 25, 12, 22, 11};
        // Bubble sort
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(arr1);
        System.out.println("Bubble Sorted Array: " + Arrays.toString(arr1));
        // Selection sort
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(arr2);
        System.out.println("Selection Sorted Array: " + Arrays.toString(arr2));
    }
}
