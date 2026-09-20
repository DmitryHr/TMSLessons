package by.tms.additionTask.model;

import java.util.Date;

public class FinancialInvoice extends Document {
    private double monthlyTotal;
    private String departmentCode;

    public double getMonthlyTotal() {
        return monthlyTotal;
    }

    public void setMonthlyTotal(double monthlyTotal) {
        this.monthlyTotal = monthlyTotal;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public FinancialInvoice(){};
    public FinancialInvoice(String numberDocuments, Date dateDocument, double monthlyTotal, String departmentCode){
        super(numberDocuments, dateDocument);
        this.monthlyTotal  = monthlyTotal;
        this.departmentCode = departmentCode;
    }

    @Override
    public void printInfo(){
        System.out.println("===========Финансовая накладная===============");
        System.out.println("Номер документа: " + getNumberDocuments());
        System.out.println("Дата документа: " + getDateDocument()) ;
        System.out.println("Итоговая сумма за месяц: " + getMonthlyTotal());
        System.out.println("Код департамента: " + getDepartmentCode());
        System.out.println("========================================================");
    }
}
