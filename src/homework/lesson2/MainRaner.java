package homework.lesson2;

import homework.lesson2.part1.*;
import homework.lesson2.part2.*;

public class MainRaner {


    public static void main(String[] args){
        /*
        Часть 1. Управляющие конструкции Задание 1
         */
        System.out.println("Выполняется задание Часть 1. Управляющие конструкции Задание 1. Switch-case старой реализации");
        partOneTastOneSwitchCaseOld();

        System.out.println("Выполняется задание Часть 1. Управляющие конструкции Задание 1. Switch-case новой реализации");
        partOneTastOneSwitchCaseModern();

        /*
        Часть 1. Управляющие конструкции Задание 2
         */
        System.out.println("Выполняется задание Часть 1. Управляющие конструкции Задание 2. if else");
        partOneTastTwoIfElse();

        /*
        Часть 1. Управляющие конструкции Задание 3
         */
        System.out.println("Выполняется задание часть 1. Управляющие конструкции Задание 3.");
        partOneTaskThreeEvenOdd();

         /*
        Часть 1. Управляющие конструкции Задание 4
         */
        System.out.println("Выполняется задание часть 1. Управляющие конструкции Задание 4.");
        partOneTaskFourStreetTemperature();

         /*
        Часть 1. Управляющие конструкции Задание 5
         */
        System.out.println("Выполняется задание часть 1. Управляющие конструкции Задание 5.");
        partOneTaskFourRainbowColor();

         /*
        Часть 2. Циклы Задание 1
         */
        System.out.println("Выполняется задание часть 2. Циклы Задание 1.");
        PrintOddNumbers printOddNumbers = new PrintOddNumbers();
        printOddNumbers.printOddNumber();

         /*
        Часть 2. Циклы Задание 2
         */
        System.out.println("Выполняется задание часть 2. Циклы Задание 2.");
        PrintRamgeNumber printRamgeNumber  = new PrintRamgeNumber();
        printRamgeNumber.printRangeNumber();

        /*
        Часть 2. Циклы Задание 3
         */
        System.out.println("Выполняется задание часть 2. Циклы Задание 3.");
        partTwoTaskTreeSumOfNaturalNumbers();

        /*
        Часть 2. Циклы Задание 4
         */
        System.out.println("Выполняется задание часть 2. Циклы Задание 4.");
        partTwoTaskFourPrintMultiplesOfSeven();

        /*
        Часть 2. Циклы Задание 5
         */
        System.out.println("Выполняется задание часть 2. Циклы Задание 5.");
        partTwoTaskFiveArithmeticSequencePrinter();
    }

    public static void partOneTastOneSwitchCaseOld(){
        //Создаем объект класа SeasoneSwitchOld, в котором  выполняется логика оператора выбора switch case
        SeasoneSwitchOld seasoneSwitchOld = new SeasoneSwitchOld();
        //Создаем объект класса InputData  в котором с помощью класса Scanner получаем введенное число
        InputData inputData = new InputData();
        System.out.println("Введите любое число месяца в  диапазоне от 1 до 12:");
        //Выбод результа
        System.out.println(seasoneSwitchOld.methodSeasoneSwitchOld(inputData.inputData()));
    }

    public static void partOneTastOneSwitchCaseModern(){
        //Создаем объект класа SeasoneSwitchModern, в котором  выполняется логика оператора выбора switch case
        SeasoneSwitchModern seasoneSwitchModern = new SeasoneSwitchModern();
        //Создаем объект класса InputData  в котором с помощью класса Scanner получаем введенное число
        InputData inputData = new InputData();
        System.out.println("Введите любое число месяца в  диапазоне от 1 до 12:");
        //Выбод результа
        System.out.println(seasoneSwitchModern.seasoneSwitchModern(inputData.inputData()));
    }

    public static void partOneTastTwoIfElse(){
        //Создаем объект класа SeasoneIfElse, в котором  выполняется логика оператора выбора if else
        SeasoneIfElse seasoneIfElse = new SeasoneIfElse();
        //Создаем объект класса InputData  в котором с помощью класса Scanner получаем введенное число
        InputData inputData = new InputData();
        System.out.println("Введите любое число месяца в  диапазоне от 1 до 12:");
        //Выбод результа
        System.out.println(seasoneIfElse.checkSeasone(inputData.inputData()));
    }

    public static void partOneTaskThreeEvenOdd(){
        //Создаем объект класса EvenOddChecker в котором выполняется логика проверки четности числа
        EvenOddChecker evenOddChecker= new EvenOddChecker();
        //Создаем объект класса  InputData  в котором с помощью класса Scanner получаем введенное число
        InputData inputData = new InputData();
        System.out.println("Введите любое целое число");
        evenOddChecker.evenOddChecker(inputData.inputData());
    }

    public static void partOneTaskFourStreetTemperature(){
        //Создаем объект класса StreetTemperature в котором выполняется логика проверки погоды на  улице
        StreetTemperature streetTemperature = new StreetTemperature();
        //Создаем объект класса  InputData  в котором с помощью класса Scanner получаем введенное число
        InputData inputData = new InputData();
        System.out.println("Введите любое целое число. Вводить можно как положительные так и отрицательные");
        streetTemperature.stretTemperature(inputData.inputData());
    }

    public static void partOneTaskFourRainbowColor(){
        //Создаем объект класса StreetTemperature в котором выполняется логика проверки погоды на  улице
        RainbowColors rainbowColors = new RainbowColors();
        //Создаем объект класса  InputData  в котором с помощью класса Scanner получаем введенное число
        InputData inputData = new InputData();
        System.out.println("Введите любое целое число в диапазоне от 1 до 7");
        System.out.println(rainbowColors.rainbowColor(inputData.inputData()));
    }

    public static void partTwoTaskTreeSumOfNaturalNumbers(){
        SumOfNaturalNumbers sumOfNaturalNumbers = new SumOfNaturalNumbers();
        InputData inputData = new InputData();
        System.out.println("Введите любое целое, положительное число в диапазоне от 1 до 1000");
        System.out.println(sumOfNaturalNumbers.sumOfNaturalNumbers(inputData.inputData()));
    }

    public static void partTwoTaskFourPrintMultiplesOfSeven(){
        PrintMultiplesOfSeven printMultiplesOfSeven = new PrintMultiplesOfSeven();
        printMultiplesOfSeven.printMultiplesOfSeven();
    }

    public static void partTwoTaskFiveArithmeticSequencePrinter(){
        ArithmeticSequencePrinter arithmeticSequencePrinter = new ArithmeticSequencePrinter();
        arithmeticSequencePrinter.arithmeticSequencePrinter();
    }
}
