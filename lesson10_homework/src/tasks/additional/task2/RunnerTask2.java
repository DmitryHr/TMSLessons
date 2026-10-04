package tasks.additional.task2;

import java.util.Arrays;

public class RunnerTask2 {
    static void main() {
        String text = "Tetx1 Text12 text1234 text12345";
        String[] arrayStr = text.split("\\s");
        String shortText = arrayStr[0];
        String longText = arrayStr[0];

        for (String txt : arrayStr) {
            if (shortText.length() > txt.length()) {
                shortText = txt;
            }

            if (longText.length() < txt.length()) {
                longText = txt;
            }
        }
        System.out.println(shortText + " " + longText);
    }
}
