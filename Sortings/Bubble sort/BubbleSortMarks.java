public class BubbleSortMarks {
    public static void main(String[] args) {
        int[] marks = {78, 45, 90, 32, 67}; // sample student marks

        for (int i = 0; i < marks.length - 1; i++) {
            for (int j = 0; j < marks.length - 1 - i; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }

        // printing sorted marks
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}
