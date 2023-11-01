import java.util.Arrays;

public class ShellSort {
    public static int[] shellSort(int[] array) {
        int n = array.length;
        int[] sortedArray = Arrays.copyOf(array, n);

        // Se escoge un espacio que se reduce
        for (int espacio = n / 2; espacio > 0; espacio /= 2) {
            // Realizar InsertionSort en los elementos con el espacio
            for (int i = espacio; i < n; i++) {
                int comparar = sortedArray[i];
                int j = i;

                while (j >= espacio && sortedArray[j - espacio] > comparar) {
                    array[j] = sortedArray[j - espacio];
                    j -= espacio;
                }

                sortedArray[j] = comparar;
            }
        }
        return sortedArray;
    }
}
