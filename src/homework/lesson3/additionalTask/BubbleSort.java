package homework.lesson3.additionalTask;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public void bubbleSort() {
        Random random = new Random();
        int[] array = new int[20];
        for (int index = 0; index < array.length; index++) {
            array[index] = random.nextInt(100);
        }

        //array.length-1 потому что индексация идет с  0
        for (int index = 0; index < array.length - 1; index++) {
            //array.length-1-index потому что данной командой мы уменшаем рамер массива, чтобы не перебирать последние элементы
            for (int index2 = 0; index2 < array.length - 1 - index; index2++) {
                if (array[index2] > array[index2 + 1]) {
                    //сохраняем значение  для того,чтобы  помеять местами
                    int num1 = array[index2];
                    array[index2] = array[index2 + 1];
                    array[index2 + 1] = num1;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
