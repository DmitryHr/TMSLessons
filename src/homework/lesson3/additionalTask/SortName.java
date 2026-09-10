package homework.lesson3.additionalTask;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortName {
    public void sortName() {
        String[] names = {"Анастасия", "Максим", "Екатерина", "Дмитрий", "Александра", "Сергей", "Мария", "Андрей", "Татьяна", "Николай"};
        System.out.println("Массив без сортировки:");
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("Массив после сортировки:");
        System.out.println(Arrays.toString(names));
    }
}
