package homework.lesson4.additionalTask;

import java.util.Arrays;

/**
 * Создайте двумерный массив целых чисел. Отсортируйте элементы в каждой строке массива по возрастанию
 * и выведите результат на консоль.
 * <p>
 * Подсказка: Двумерный массив в Java — это «массив массивов». Каждая его строка array[i] представляет собой обычный
 * одномерный массив. Вы можете применить стандартный метод Arrays.sort() к каждой строке внутри одного внешнего цикла.
 */
public class MatrixSort {
    public void matrixSort() {
        int[][] matrix = {
                {3, 2, 1},
                {6, 5, 4},
                {9, 8, 7}
        };
        for (int index = 0; index < matrix.length; index++) {
            Arrays.sort(matrix[index]);


        }
        System.out.print(Arrays.deepToString(matrix));


    }
}
