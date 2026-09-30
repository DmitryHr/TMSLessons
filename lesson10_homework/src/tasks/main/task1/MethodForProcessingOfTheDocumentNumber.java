package tasks.main.task1;

import java.util.regex.Pattern;

import static java.awt.SystemColor.text;

public class MethodForProcessingOfTheDocumentNumber {


    public static void oneString(String text){
       // text = validatorNameDocument(text);
        System.out.println(text.substring(0, 8).replaceAll("\\W", ""));
    }

    public static void starString(String text){
        String s = text.replaceAll("[A-Za-z]{3}", "***");
        System.out.println(s);
    }

    public static void delNumbers(String text){
        String s = text.replaceAll("\\d*", "");
        System.out.println(s.toLowerCase());
    }

    public static void letersMethod(String text){
        StringBuilder stringBuilder = new StringBuilder();
        String str = text;

        for(char c: str.toCharArray()){
            if(Character.isLetter(c)){
                stringBuilder.append(c);
            }
        }

        StringBuilder result = new StringBuilder("Letters:");
        result.append(stringBuilder.toString().toUpperCase());

        System.out.println(result);
    }

    public static void checkContains(String text){
        if (text.contains("abc")){
            System.out.println("Текст содержит запрещенные символы 'adc'");
        }
        System.out.println("Текст не содержит запрещенные символы 'adc'");
    }

    public static void checkStartWith(String text){
        if (text.startsWith("555")){
            System.out.println("Текст начинается с '555'");
        }
        System.out.println("Текст не начинается с '555'");
    }

    public static void checkEndWith(String text){
        if (text.endsWith("1a2b")){
            System.out.println("Текст ззаканчивается на '1a2b'");
        }
        System.out.println("Текст не заканчивается на '1a2b'");
    }

}
