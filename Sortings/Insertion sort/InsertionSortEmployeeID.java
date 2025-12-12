import java.util.*;
public class InsertionSortEmployeeID {

    public static void main(String[] args) {

        int[] empIds = {105, 102, 110, 101, 108};

        System.out.println("Before Sorting:");
        for (int id : empIds) {
            System.out.print(id + " ");
        }

        // Insertion Sort Algorithm
        for (int i = 1; i < empIds.length; i++) {
            int key = empIds[i];
            int j = i - 1;

            // Move elements that are greater than key
            while (j >= 0 && empIds[j] > key) {
                empIds[j + 1] = empIds[j];
                j--;
            }

            empIds[j + 1] = key;
        }

        System.out.println("\n\nAfter Sorting:");
        for (int id : empIds) {
            System.out.print(id + " ");
        }
    }
}

