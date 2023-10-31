import java.util.Arrays;

public class SelectionSort {
    public static int[] selectionSort(int[] array) {
        int n = array.length;
        int[] sortedArray = Arrays.copyOf(array, n);

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (sortedArray[j] < sortedArray[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = sortedArray[minIndex];
            sortedArray[minIndex] = sortedArray[i];
            sortedArray[i] = temp;
        }

        return sortedArray;
    }
}

