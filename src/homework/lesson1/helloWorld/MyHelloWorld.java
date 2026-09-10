package homework.lesson1.helloWorld;

import java.sql.SQLOutput;

public class MyHelloWorld {
    int numberInt = 1;
    double numberDouble = 0.5;


    public void methodHelloWorld(){
        char myChar = 'I';
        String hello = "Hello world";
        System.out.println("Целое число получено из поля numberInt " + numberInt);
        System.out.println("Дробное число получено из поля numberDouble " + numberDouble);
        System.out.println("Символ получен из переменной myChar " + myChar);
        System.out.println("Строка получена из переменной hello " + hello);
    }
}
