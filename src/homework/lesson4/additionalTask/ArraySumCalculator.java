package homework.lesson4.additionalTask;

import java.util.Arrays;
import java.util.Random;

/**
 * Создайте двумерный массив целых чисел. Посчитайте и выведите на консоль сумму всех элементов этого массива.
 * <p>
 * Подсказка: Заведите переменную-аккумулятор (например, sum = 0) до начала циклов. Пройдите по всем элементам
 * массива с помощью вложенных циклов (for или for-each) и добавляйте значение каждой ячейки к этой переменной.
 */
public class ArraySumCalculator {
    public void arraySumCalculator() {
        int rows = 3;
        int col = 3;
        int[][] array = new int[rows][col];
        Random random = new Random();
        System.out.println(array.length);
        int sum = 0;
        for (int indexRows = 0; indexRows < array.length; indexRows++) {
            for (int indexCol = 0; indexCol < array[0].length; indexCol++) {
                array[indexRows][indexCol] = random.nextInt(10);
                sum += array[indexRows][indexCol];
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println(sum);
    }
}
