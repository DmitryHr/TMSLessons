package tms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IterationClass {
    static void main() {
        whileMethod();
    }

    static void forMethod() {
        int[] salaryArray = {1000, 2000, 3000, 4000};

        for (int index = 0; index < salaryArray.length; index++) {
            salaryArray[index] += 500;
        }
        System.out.println(Arrays.toString(salaryArray));
    }

    static void forEachMethod() {
        int[] salaryArray = {1000, 2000, 3000, 4000};
        List<Integer> list = new ArrayList<>(4);
        for (int salary : salaryArray) {
            if (salary == 2000) {
                continue;
            }
            list.add(salary + 500);
        }

        System.out.println(list);
    }

    static void whileMethod() {
        int[] salaryArray = {1000, 2000, 3000, 4000};
        Integer index = 0;

        do {
            salaryArray[index] += 500;
            index++;
        } while (index < 0);
        System.out.println(Arrays.toString(salaryArray));


/*        while (index < 0) {
            salaryArray[index] += 500;
            index++;
        }
        System.out.println(Arrays.toString(salaryArray));*/


    }
}
