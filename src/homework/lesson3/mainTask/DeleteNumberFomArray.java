package homework.lesson3.mainTask;

import java.util.Arrays;
import java.util.Random;

/**
 * Создайте массив целых чисел. Удалите все вхождения заданного числа из массива. * Условия: * Число задается с консоли
 * (класс Scanner). * Если такого числа нет — выведите сообщение об этом. * В результате должен быть сформирован
 * новый массив без указанного числа.
 */

public class DeleteNumberFomArray {
    public void deleteNumberFomArray(int deleteNumber) {

        int[] arrayFirst = {1, 21, 30, 22, 44, 33, 45};
        //проходим по массиву и ищем номер для удаления. Если есть, то добавляем  в count +1
        int count = 0;
        for (int numberArray : arrayFirst) {
            if (numberArray == deleteNumber) {
                count++;
            }
        }

        //Обьявляем новый массив и индекс для него, что бы записать новые значения
        int[] arrayWithoutDeleteNumber = new int[arrayFirst.length - count];
        int index = 0;

        //Условие, если  в coutn 0, то выводим сообщение и выходим из условия
        if (count == 0) {
            System.out.println("Введенное число для удалениея не найдено в массиве");
        }
        //Условие если  count > 0. Присваиваем массиву arrayWithoutDeleteNumber  значения массива arrayFirst которые
        //не равны значению из deleteNumber и выводим в строку сформированый новый массив
        else {
            for (int numberArray : arrayFirst) {
                if (numberArray != deleteNumber) {
                    arrayWithoutDeleteNumber[index] = numberArray;
                    index++;
                }
            }
            System.out.println(Arrays.toString(arrayWithoutDeleteNumber));
        }

    }
}
