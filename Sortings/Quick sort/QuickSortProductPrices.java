import java.util.*;
public class QuickSortProductPrices {

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // choosing last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot in correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Quick Sort function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);  // left side
            quickSort(arr, pivotIndex + 1, high); // right side
        }
    }

    // Main method
    public static void main(String[] args) {

        int[] prices = {500, 150, 999, 250, 75};

        quickSort(prices, 0, prices.length - 1);

        System.out.println("Sorted Product Prices:");
        for (int price : prices) {
            System.out.print(price + " ");
        }
    }
}
