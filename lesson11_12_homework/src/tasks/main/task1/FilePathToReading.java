package tasks.main.task1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FilePathToReading {
    public HashSet<String> inputPathToFile(){
        HashSet<String> stringHashSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Input text");
            String input = scanner.nextLine();
            if (!input.equals("0")){
                stringHashSet.add(input);
            }
            else break;
        }
        return stringHashSet;
    }
}
