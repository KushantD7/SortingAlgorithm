import java.util.*;

public class SortExamScores {
    public static void main(String[] args) {
        int[] scores = {85, 40, 72, 90, 58};

        for (int i = 0; i < scores.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = scores[i];
            scores[i] = scores[minIndex];
            scores[minIndex] = temp;
        }

        for (int s : scores) {
            System.out.print(s + " ");
        }
    }
}

