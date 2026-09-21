package by.tms.additionTask.model;

import java.util.Date;

public class EmploymentContract extends Document{

    private Date dateEndContract;
    private String nameEmployer;

    public EmploymentContract(){};
    public EmploymentContract(String numberDocuments, Date dateDocument, Date dateEndContract, String nameEmployer){
        super(numberDocuments, dateDocument);
        this.dateEndContract = dateEndContract;
        this.nameEmployer  = nameEmployer;
    }


    public Date getDateEndContract() {
        return dateEndContract;
    }

    public void setDateEndContract(Date dateEndContract) {
        this.dateEndContract = dateEndContract;
    }

    public String getNameEmployer() {
        return nameEmployer;
    }

    public void setNameEmployer(String nameEmployer) {
        this.nameEmployer = nameEmployer;
    }

    @Override
    public void printInfo() {
        System.out.println("===========Контракт на поставку товалов===============");
        System.out.println("Номер документа: " + getNumberDocuments());
        System.out.println("Дата документа: " + getDateDocument());
        System.out.println("Дата офончания договора: " + getDateEndContract());
        System.out.println("ФИО сотрудника: " + getNameEmployer());
        System.out.println("========================================================");
    }
}
