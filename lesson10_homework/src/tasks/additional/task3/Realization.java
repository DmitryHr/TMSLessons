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
        String newWords = input.replaceAll("[,.!]", "");
        String[] arrayStr = newWords.trim().split("\\s");

        String result = null;
        int minUnique = Integer.MAX_VALUE;

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
