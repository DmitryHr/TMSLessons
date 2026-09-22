package by.tms.additionTask.registr;

import by.tms.additionTask.model.Document;

public class Registr {
    private final Document[] documents = new Document[10];

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    private int index = 0;

    public void saveDocument(Document document) {
        if (index >= 9) {
            System.out.println("Память заполнена");
        } else {
            documents[index] = document;
            index++;
        }


    }


    public void printInfoDoc(Document document) {
        document.printInfo();
    }

}
