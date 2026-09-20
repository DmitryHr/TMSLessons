package by.tms.additionTask.registr;

import by.tms.additionTask.model.Document;

import java.util.Arrays;

public class Registr {
    private final Document [] documents = new Document[10];

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    private int index = 0;

    public void saveDocument(Document document){
        documents[index++] = document;
    }

    public void printInfoDoc(Document document){
        document.printInfo();
    }

}
