package homework.lesson4.additionalTask;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeDArrayIncrementer {
    /**
     * Создайте трёхмерный массив целых чисел. Напишите программу, которая с помощью циклов проходит по всему массиву и увеличивает каждый его элемент на заданное число.
     * <p>
     * Условие: Число, на которое будут увеличиваться элементы массива, должно задаваться с консоли (класс Scanner).
     * Подсказка: Трёхмерный массив можно представить как стопку таблиц. Чтобы «добраться» до каждого значения, вам
     * потребуется ровно три вложенных цикла for. В самом внутреннем цикле обратитесь к текущей ячейке по трём индексам [i][j][k] и прибавьте к ней введённое из консоли число.
     */

    public void threeDArrayIncrementer(int num) {
        //int[2][3][3] - 2 - кол-во слоев, 3 - кол-во столбцов, 3 - кол-во строк
        int number = 1;
        int[][][] array = new int[2][3][3];
        for (int layer = 0; layer < array.length; layer++) {
            for (int string = 0; string < array[layer].length; string++) {
                for (int column = 0; column < array[layer][string].length; column++) {
                    array[layer][string][column] = number + num;
                    number++;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }

    public int inputData() {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        number = scanner.nextInt();
        return number;
    }
}
