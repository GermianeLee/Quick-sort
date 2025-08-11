import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Sample array to test QuickSort
        int[] arr = {64, 34, 25, 12, 22, 11, 90, 5};
        System.out.println("Original array: " + Arrays.toString(arr));

        // Create an instance of QuickSort and sort the array
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr, 0, arr.length - 1);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
