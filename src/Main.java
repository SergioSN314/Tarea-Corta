import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 100000; // Longitud del array a ordenar
        int[] randomArray = generateRandomArray(n);

        // Medir el tiempo para QuickSort
        long startTimeQuickSort = System.currentTimeMillis();
        int[] QuickSortArray = QuickSort.quickSort(Arrays.copyOf(randomArray, n));
        long endTimeQuickSort = System.currentTimeMillis();
        long tiempoTranscurridoQuickSort = endTimeQuickSort - startTimeQuickSort;
        System.out.println("El método QuickSort tomó " + tiempoTranscurridoQuickSort + " milisegundos.");

        // Medir el tiempo para RadixSort
        long startTimeRadixSort = System.currentTimeMillis();
        int[] RadixSortArray = RadixSort.radixSort(Arrays.copyOf(randomArray, n));
        long endTimeRadixSort = System.currentTimeMillis();
        long tiempoTranscurridoRadixSort = endTimeRadixSort - startTimeRadixSort;
        System.out.println("El método RadixSort tomó " + tiempoTranscurridoRadixSort + " milisegundos.");

        // Medir el tiempo para BubbleSort
        long startTimeBubbleSort = System.currentTimeMillis();
        int[] BubbleSortArray = BubbleSort.bubbleSort(Arrays.copyOf(randomArray, n));
        long endTimeBubbleSort = System.currentTimeMillis();
        long tiempoTranscurridoBubbleSort = endTimeBubbleSort - startTimeBubbleSort;
        System.out.println("El método BubbleSort tomó " + tiempoTranscurridoBubbleSort + " milisegundos.");

        long startTimeSelectionSort = System.currentTimeMillis();
        int[] SelectionSortArray = SelectionSort.selectionSort(Arrays.copyOf(randomArray, n));
        long endTimeSelectionSort = System.currentTimeMillis();
        long tiempoTranscurridoSelectionSort = endTimeSelectionSort - startTimeSelectionSort;
        System.out.println("El método SelectionSort tomó " + tiempoTranscurridoSelectionSort + " milisegundos.");

        long startTimeInsertionSort = System.currentTimeMillis();
        int[] InsertionSortArray = InsertionSort.insertionSort(Arrays.copyOf(randomArray, n));
        long endTimeInsertionSort = System.currentTimeMillis();
        long tiempoTranscurridoInsertionSort = endTimeInsertionSort - startTimeInsertionSort;
        System.out.println("El método InsertionSort tomó " + tiempoTranscurridoInsertionSort + " milisegundos.");
    }

    public static int[] generateRandomArray(int n) {
        int[] randomArray = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            randomArray[i] = random.nextInt(100); // Genera números aleatorios entre 0 y 99, puedes ajustar según sea necesario
        }

        return randomArray;
    }
}


