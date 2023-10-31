import java.util.Arrays;

public class InsertionSort {
    public static int[] insertionSort(int[] array) {
        int n = array.length;
        int[] sortedArray = Arrays.copyOf(array, n);

        for (int i = 1; i < n; i++) {
            int key = sortedArray[i];
            int j = i - 1;

            while (j >= 0 && sortedArray[j] > key) {
                sortedArray[j + 1] = sortedArray[j];
                j = j - 1;
            }
            sortedArray[j + 1] = key;
        }
        return sortedArray;
    }
}

