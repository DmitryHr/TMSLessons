package tasks.main.task1;

import java.util.*;

public class FilePathToReading {
    public ArrayList<String> inputPathToFile() {
        ArrayList<String> stringHashSet = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input text");
            String input = scanner.nextLine();
            if (!input.equals("0")) {
                stringHashSet.add(input);
            } else break;
        }
        return stringHashSet;
    }
}
