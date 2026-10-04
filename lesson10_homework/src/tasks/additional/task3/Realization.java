package tasks.additional.task3;

import java.util.HashSet;
import java.util.Set;

public class Realization {

    private static int countUniqueChars(String word) {
        Set<Character> unique = new HashSet<>();
        for (char c : word.toCharArray()) {
            unique.add(c);
        }
        return unique.size();
    }

    public String findWordWithMinUniqueChars(String input) {
        //удаляем все знаки в квадратных скобках
        String newWords = input.replaceAll("[,.!]", "");
        //Разбиваем строку на массив слов по пробелу или табуляции
        String[] arrayStr = newWords.trim().split("\\s");

        String result = null;
        //задаем минимальное значение по первому слову из масива
        int minUnique = arrayStr[0].length();

        for (String word : arrayStr) {

            int uniqueCount = countUniqueChars(word);
            if (uniqueCount < minUnique) {
                minUnique = uniqueCount;
                result = word;
            }

        }
        return result;
    }
}
