package by.tms.inheritance.model;

public final class Employee extends Person {

    private String company;

    public Employee(String name, String surname, String company) {
        super(name, surname);
        this.company = company;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }

}