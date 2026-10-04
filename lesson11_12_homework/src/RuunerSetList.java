import tasks.main.task1.FilePathToReading;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RuunerSetList {
    static void main() {
        FilePathToReading filePathToReading = new FilePathToReading();
        HashSet <String> result = filePathToReading.inputPathToFile();

        System.out.println(result);


    }
}
