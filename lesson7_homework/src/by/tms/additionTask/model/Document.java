package by.tms.additionTask.model;

import java.util.Date;

public abstract class Document {
    String numberDocuments;
    Date dateDocument;

    public String getNumberDocuments() {
        return numberDocuments;
    }

    public void setNumberDocuments(String numberDocuments) {
        this.numberDocuments = numberDocuments;
    }

    public Date getDateDocument() {
        return dateDocument;
    }

    public void setDateDocument(Date dateDocument) {
        this.dateDocument = dateDocument;
    }

    public Document() {
    }

    public Document(String numberDocuments, Date dateDocument) {
        this.numberDocuments = numberDocuments;
        this.dateDocument = dateDocument;
    }

    /**
     * Метод для вывода информации о документе.
     * Реализуется в наследниках.
     */

    public abstract void printInfo();


    @Override
    public String toString() {
        return "Document{" +
                "numberDocuments" + numberDocuments +
                "dateDocument" + dateDocument;
    }
}
