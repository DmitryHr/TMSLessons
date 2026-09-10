package homework.lesson3.mainTask;

import java.util.Arrays;

/**
 * Создайте 2 массива из 5 чисел. * Условия: * Выведите массивы на консоль в двух отдельных строках. * Посчитайте
 * среднее арифметическое элементов каждого массива. * Сообщите, для какого из массивов это значение оказалось
 * больше (либо сообщите, что их средние арифметические равны).
 */
public class ArrayAverageComparator {
    public void arrayAverage() {
        int[] array1 = {1, 29, 75, 53, 7};
        int[] array2 = {1, 29, 75, 51, 7};

        int summaArr1 = 0;
        int summaArr2 = 0;
        double averageArr1;
        double averageArr2;

        for (int number : array1) {
            summaArr1 += number;
        }
        for (int number : array2) {
            summaArr2 += number;
        }
        averageArr1 = (double) summaArr1 / 5;
        averageArr2 = (double) summaArr2 / 5;

        System.out.println("Первый массив");
        System.out.println(Arrays.toString(array1));
        System.out.println("Второй массив");
        System.out.println(Arrays.toString(array1));

        if (averageArr1 == averageArr2) {
            System.out.println("Средние значения обоих массивов равны " + averageArr1 + " = " + averageArr2);
        } else if (averageArr1 > averageArr2) {
            System.out.println("Средние значения первого массива больше " + averageArr1 + " > " + averageArr2);
        } else {
            System.out.println("Средние значения второго массива больше " + averageArr1 + " < " + averageArr2);
        }
    }
}
