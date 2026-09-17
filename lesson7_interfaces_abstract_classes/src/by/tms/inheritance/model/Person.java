package by.tms.inheritance.model;

public class Person extends Human{
    private String name;
    private String surname;
    protected int age;
    String address;
    public String phone;

    public Person(String name, String surname) {
        super("causasian");
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void displayInfo() {
        System.out.println("Имя: " + getName() + ", Фамилия: " + getSurname());
    }

    @Override
    public String getSpeciesNameWithoutBody() {
        return "person body";
    }
}