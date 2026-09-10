package homework.lesson4.mainTask;

/**
 * Создайте двумерный массив. Выведите на консоль элементы его диагоналей (главной и побочной).
 * <p>
 * Подсказка:
 * Для главной диагонали индекс строки и индекс столбца совпадают: [i][i].
 * Для побочной диагонали индекс строки растёт, а индекс столбца уменьшается: [i][n - 1 - i], где n — размерность матрицы.
 * Если матрица квадратная, обе диагонали можно вывести за один одиночный цикл for.
 */
public class DiagonalPrinter {
    public void diagonalPrinter() {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.println(array[i][i]);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(array[i][n - 1 - i]);
        }
    }

}
