import java.util.*;
public class CountingSortAges {

    public static void main(String[] args) {

        int[] ages = {15, 12, 18, 10, 14, 12, 16};
        int maxAge = 18;
        int minAge = 10;

        int range = maxAge - minAge + 1;
        int[] count = new int[range];
        int[] output = new int[ages.length];

        // Count frequencies
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Cumulative count
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Place values in output array
        for (int i = ages.length - 1; i >= 0; i--) {
            output[--count[ages[i] - minAge]] = ages[i];
        }

        // Print sorted ages
        for (int age : output) {
            System.out.print(age + " ");
        }
    }
}

