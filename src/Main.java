import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 1000000; // longitud del array a ordenar
        int[] randomArray = generateRandomArray(n);

        long startTime2 = System.currentTimeMillis();
        int[] QuickSortArray = QuickSort.quickSort(randomArray);
        long endTime2 = System.currentTimeMillis();

        long tiempoTranscurrido2 = endTime2 - startTime2;

        System.out.println("El método QuickSort tomó " + tiempoTranscurrido2 + " milisegundos.");
        long startTime = System.currentTimeMillis();
        int[] RadixdArray = RadixSort.radixSort(randomArray);
        long endTime = System.currentTimeMillis();

        long tiempoTranscurrido = endTime - startTime;

        System.out.println("El método Radix tomó " + tiempoTranscurrido + " milisegundos.");




        //En caso de querer ver las listas y como estan ordenadas
        //System.out.println("Original array: " + Arrays.toString(randomArray));
        //System.out.println("Quicksort array: " + Arrays.toString(QuickSortArray));
        //System.out.println("Quicksort array: " + Arrays.toString(RadixdArray));




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