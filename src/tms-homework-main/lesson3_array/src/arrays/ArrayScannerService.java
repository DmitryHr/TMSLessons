package tms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayScannerService {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int arraySize = arraySizeInput(scanner);
        int[] array = createAndProcessArray(arraySize, scanner);

        System.out.println(Arrays.toString(array));
    }


    private static int[] createAndProcessArray(int arraySize, Scanner scanner) {
        int[] array = new int[arraySize];
        Random random = new Random();

        for (int index = 0; index < array.length; index++) {
            // inputElementValue(index, array, scanner);
            randomElementValue(index, array, random);
        }
        return array;
    }


    private static void randomElementValue(int index, int[] array, Random random) {
        array[index] = random.nextInt();
    }

    private static void inputElementValue(int index, int[] array, Scanner scanner) {
        System.out.print("Введите значение " + index + " элемента массива: ");
        int elementValue = scanner.nextInt();
        array[index] = elementValue;
    }


    private static int arraySizeInput(Scanner scanner) {
        System.out.print("Введите размер массива: ");
        int arraySize = scanner.nextInt();
        return arraySize;
    }
}
