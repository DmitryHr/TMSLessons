package homework.lesson4;

import homework.lesson4.additionalTask.ArraySumCalculator;
import homework.lesson4.additionalTask.MatrixMultiplier;
import homework.lesson4.additionalTask.MatrixSort;
import homework.lesson4.additionalTask.ThreeDArrayIncrementer;
import homework.lesson4.mainTask.ChessBoardGenerator;
import homework.lesson4.mainTask.DiagonalPrinter;

public class MainRunner {
    public static void main(String[] args) {

        /*
        Основное задание. Задание 0
         */
        System.out.println("Выполняется Основное задание Задание 0");
        ThreeDArrayIncrementer threeDArrayIncrementer = new ThreeDArrayIncrementer();
        threeDArrayIncrementer.threeDArrayIncrementer(threeDArrayIncrementer.inputData());

         /*
        Основное задание. Задание 1
         */
        System.out.println("Выполняется Основное задание Задание 1");
        ChessBoardGenerator chessBoardGenerator = new ChessBoardGenerator();
        chessBoardGenerator.chessBoardGenerator();
        System.out.println();
        chessBoardGenerator.chessBoardGeneratorDeepSeek();

        /*
        Дополнительное задание Задание 2 (Умножение матриц)
         */
        System.out.println("Выполняется Дополнительное задание Задание 2 (Умножение матриц)");
        MatrixMultiplier matrixMultiplier = new MatrixMultiplier();
        matrixMultiplier.matrixMultiplier();

        /*
        Дополнительное задание Задание 3
         */
        System.out.println("Выполняется Дополнительное задание Задание 3");
        ArraySumCalculator arraySumCalculator = new ArraySumCalculator();
        arraySumCalculator.arraySumCalculator();

         /*
        Дополнительное задание Задание 4
         */
        System.out.println("Выполняется Дополнительное задание Задание 4");
        DiagonalPrinter diagonalPrinter = new DiagonalPrinter();
        diagonalPrinter.diagonalPrinter();

        /*
        Дополнительное задание Задание 5
         */
        System.out.println("Выполняется Дополнительное задание Задание 5");
        MatrixSort matrixSort = new MatrixSort();
        matrixSort.matrixSort();
    }
}
