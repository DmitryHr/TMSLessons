package tasks.main.task1;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.regex.Pattern;

public class DocumentNumberReaderAndDeduplicator {
    final String VALIDATOR_DOC = "^(docnum.{9}|kontract.{7}$)";
    HashSet<String> readerDoc = new HashSet<>();
    Map<String, String> report = new HashMap<>();

    public HashSet<String> readerAndDeduplicatior(ArrayList<String> arrayList) {
        for (String element : arrayList) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(element))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    readerDoc.add(line);
                }
            } catch (IOException e) {
                System.out.println("Ошибка чтения файла: " + e.getMessage());
            }
        }
        return readerDoc;
    }

    public Map<String, String> validationDocument() {
        for (String str : readerDoc) {
            if (Pattern.matches(VALIDATOR_DOC, str)) {
                report.put(str, "Документ валидный");
            } else {
                report.put(str, "Невалидный документ");
            }
        }
        return report;
    }

    public void fileReport() {
        try {
            FileWriter fileWriter = new FileWriter("/mnt/BackUpJS/Курсы/Report.txt", false);
            for (Map.Entry<String, String> entry : report.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                fileWriter.write(key + ": " + value);
                fileWriter.write("\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
