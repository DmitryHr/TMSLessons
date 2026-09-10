package homework.lesson3.additionalTask;

import java.util.Arrays;
import java.util.Random;

/**
 * Создайте и заполните массив.
 *
 * Условия:
 * Выведите массив на экран в строку.
 * Замените каждый элемент с нечётным индексом на ноль.
 * Снова выведите обновленный массив на экран на отдельной строке.
 */
public class OddIndexZeroReplacer {
    public void oddIndexZeroReplacer(){
        Random random = new Random();
        int [] array = new int[10];
        for (int index = 0; index < array.length; index++){
            array[index] = random.nextInt(100);
        }

        int[] newArray = new int[array.length];
        for (int index = 0; index < array.length; index++){
            if(index%2 ==0){
                newArray[index] = array[index];
            }
            else{
                newArray[index] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newArray));
    }
}
