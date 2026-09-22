package additionTask.hospital.patient;

public class Patient {

    private String name;
    private String surName;

    public Patient(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surName;
    }

    public void setSurname(String surname) {
        this.surName = surname;
    }

    public void printFio() {
        System.out.println("Уважаенмый " + getSurname() + " " + getName());
    }


}
