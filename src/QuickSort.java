import java.util.Arrays;

public class QuickSort {

    public static int[] quickSort(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }

        int[] sortedArray = Arrays.copyOf(array, array.length);
        quickSortHelper(sortedArray, 0, sortedArray.length - 1);
        return sortedArray;
    }

    private static void quickSortHelper(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);

            quickSortHelper(array, low, pivotIndex - 1);
            quickSortHelper(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
