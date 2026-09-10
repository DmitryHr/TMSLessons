package app.operation;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IterationClass {
    public static void main(){
       forEachMethod();
    }

    static void forMethod(){
        int[] salaryArray = {1000, 2000, 3000};
        for(int index=0; index< salaryArray.length; index++){

            salaryArray[index] +=500;
        }
        System.out.println(Arrays.toString(salaryArray));
    }

    static void forEachMethod(){
        int[] salaryArray = {1000, 2000, 3000};
        for (int salary: salaryArray){
            salary +=500;
        }
    }
}
