package homework.lesson4.additionalTask;

/**
 * Создайте два массива целых чисел размером 3х3 (две матрицы) и напишите программу для их умножения.
 * <p>
 * Пример входных данных:
 * Первая матрица: {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}}
 * Вторая матрица: {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}}
 * Ожидаемый результат: 1 2 3 1 1 1 0 0 0
 * Подсказка: Вспомните правило «строка на столбец». Чтобы перемножить матрицы, вам понадобятся три вложенных
 * цикла: первые два (i и j) определяют координаты элемента в итоговой матрице, а третий (k) накапливает сумму
 * произведений соответствующих элементов строки первой матрицы и столбца второй.
 */
public class MatrixMultiplier {
    public void matrixMultiplier() {
        int[][] matrixA = {{1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}};
        int[][] matrixB = {{1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}};

        System.out.println(matrixA.length);
        System.out.println(matrixA[0].length);
        System.out.println(matrixB.length);

        if (matrixA[0].length != matrixB.length) {
            System.out.println("Количество столбцов не равно колмчеству строк");
            return;
        }

        int rows = matrixA.length;
        int col = matrixB[0].length;
        int commom = matrixA[0].length;

        int[][] result = new int[rows][col];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                int summ = 0;
                for (int k = 0; k < commom; k++) {
                    summ += matrixA[i][k] * matrixB[k][j];
                }
                result[i][j] = summ;
            }

        }
        // Вывод результата в виде матрицы (ожидаемый вывод: строки)
        System.out.println("Результат умножения матриц:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
