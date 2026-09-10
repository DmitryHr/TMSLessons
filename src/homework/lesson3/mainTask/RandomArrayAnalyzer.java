package homework.lesson3.mainTask;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * Создайте и заполните массив случайными числами. Выведите максимальное, минимальное и среднее значение.
 * * Условия: * Для генерации случайных чисел используйте метод Math.random(). * Размер массива должен задаваться с консоли.
 */
public class RandomArrayAnalyzer {
    public void createArray(int lengthArray) {
        int array[] = new int[lengthArray];
        int numberRandom = 100;

        Random randomNubberForArray = new Random();
        for (int index = 0; index < lengthArray; index++) {
            array[index] = (int) (Math.random() * numberRandom);
        }

        int min = array[0];
        int max = array[0];
        int summa = 0;
        for (int number : array) {
            summa += number;
            if (min > number) {
                min = number;
            }
            if (max < number) {
                max = number;
            }
        }
        System.out.println("Минимальное " + min);
        System.out.println("Максимальное " + max);
        System.out.println(summa);
        double avg = (double) summa / lengthArray;
        System.out.println("Среднее " + avg);
        System.out.println(Arrays.toString(array));
    }


}
