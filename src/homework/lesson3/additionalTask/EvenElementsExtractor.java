package homework.lesson3.additionalTask;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EvenElementsExtractor {
    /**
     * Создайте массив из
     * случайных целых чисел и выведите его на экран.
     * <p>
     * Условия:
     * Размер массива
     * задается с консоли и должен удовлетворять условию:
     * .
     * Если пользователь ввел число, не удовлетворяющее условию — выведите сообщение об ошибке и заставьте пользователя повторить ввод.
     * Создайте второй массив только из чётных элементов первого массива (если они там есть) и выведите его на экран.
     */

    public int inputLengthArray() {
        Scanner scanner = new Scanner(System.in);
        int lingthArray;
        System.out.println("Введите целое цичло в диапазоне  от 5 до 10");
        lingthArray = scanner.nextInt();
        while (true) {
            if (lingthArray < 5 || lingthArray > 10) {
                System.out.println("Введенное значение  не  соответсвует условию. Введите данные повторно");
                lingthArray = scanner.nextInt();
            } else {
                System.out.println("Данные корректны. Спасибо!");
                return lingthArray;
            }
        }
    }

    public void generateArray(int number) {
        int[] fullArray = new int[number];
        Random random = new Random();
        for (int index = 0; index < fullArray.length; index++) {
            fullArray[index] = random.nextInt(100);
        }

        int count = 0;
        for (int numberArray : fullArray) {
            if (numberArray % 2 == 0) {
                count++;
            }
        }
        int index = 0;
        int[] positiveArray = new int[count];
        for (int numberArray : fullArray) {
            if (numberArray % 2 == 0) {
                positiveArray[index] = numberArray;
                index++;
            }
        }

        System.out.println(Arrays.toString(fullArray));
        System.out.println(Arrays.toString(positiveArray));
    }
}
