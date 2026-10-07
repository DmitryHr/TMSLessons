import tasks.main.task1.DocumentNumberReaderAndDeduplicator;
import tasks.main.task1.FilePathToReading;

import java.util.*;

public class RuunerSetList {
    static void main() {
        FilePathToReading filePathToReading = new FilePathToReading();
        ArrayList<String> arrayList;

        DocumentNumberReaderAndDeduplicator documentNumberReader = new DocumentNumberReaderAndDeduplicator();
        arrayList = filePathToReading.inputPathToFile();
        documentNumberReader.readerAndDeduplicatior(arrayList);
        documentNumberReader.validationDocument();
        documentNumberReader.fileReport();
    }
}
