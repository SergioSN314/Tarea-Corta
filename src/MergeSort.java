import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] array) {
        int n = array.length;
        int[] sortedArray = Arrays.copyOf(array, n);
        if (n > 1) {
            int mitad = n / 2;
            int[] izquierda = new int[mitad];
            int[] derecha = new int[n - mitad];

            for (int i = 0; i < mitad; i++) {
                izquierda[i] = sortedArray[i];
            }
            for (int i = mitad; i < n; i++) {
                derecha[i - mitad] = sortedArray[i];
            }
            // ordenar el lado izquierdo y derecho del array
            mergeSort(izquierda);
            mergeSort(derecha);

            int i = 0, j = 0, k = 0;

            while (i < izquierda.length && j < derecha.length) {
                if (izquierda[i] < derecha[j]) {
                    sortedArray[k] = izquierda[i];
                    i++;
                } else {
                    sortedArray[k] = derecha[j];
                    j++;
                }
                k++;
            }

            while (i < izquierda.length) {
                sortedArray[k] = izquierda[i];
                i++;
                k++;
            }

            while (j < derecha.length) {
                sortedArray[k] = derecha[j];
                j++;
                k++;
            }
        }
        return sortedArray;
    }}