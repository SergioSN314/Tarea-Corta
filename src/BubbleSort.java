import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int[] array) {
        int n = array.length;
        int[] sortedArray = Arrays.copyOf(array, n);

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }

        return sortedArray;
    }
}
