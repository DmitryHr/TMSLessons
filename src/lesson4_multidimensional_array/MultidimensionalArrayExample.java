package lesson4_multidimensional_array;

import java.util.Random;
import java.util.Scanner;

public class MultidimensionalArrayExample {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = 0, m = 0;

        System.out.println("Введите кол-во строк: ");
        n = scanner.nextInt();
        System.out.println("Введите кол-во столбцов: ");
        m = scanner.nextInt();
        System.out.println("Успех! n = " + n + " m = " + m);
        int[][] nXmArray = new int[n][m];
        // System.out.println(Arrays.toString(nXmArray));
        // System.out.println(Arrays.deepToString(nXmArray));

        int maxValue = nXmArray[0][0];
        for (int mainIndex = 0; mainIndex < n; mainIndex++) {
            for (int innerIndex = 0; innerIndex < m; innerIndex++) {
                nXmArray[mainIndex][innerIndex] = random.nextInt(10);
                System.out.print(nXmArray[mainIndex][innerIndex] + " ");

                int element = nXmArray[mainIndex][innerIndex];
                if (maxValue < element) {
                    maxValue = element;
                }
            }
            System.out.println();
            // System.out.println(Arrays.deepToString(nXmArray));
        }
        System.out.println("Max value is " + maxValue);
    }
}
