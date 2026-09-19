package by.tms.additionTask.registr;

import by.tms.additionTask.model.Document;

import java.util.Arrays;

public class Registr {
    private final Document [] documents = new Document[10];
    private int index = 0;

    public void saveDocument(Document document){
        documents[index++] = document;
    }

    public void printInfoDoc(Document document){
        document.printInfo();
    }

}
