package homework.lesson3.mainTask;

public class NumberSearch {
    public void numberSearch(int number) {
        int[] arrayNum = {1, 20, 14, 56, 10};
        int result = 0;
        for (int num : arrayNum) {
            if (num == number) {
                result = +1;
            }
        }

        if (result > 0) {
            System.out.println("Ввведенное значение присутствует в массиве");
        } else {
            System.out.println("Ввведенное значение отсутствует в массиве");
        }

    }

}
