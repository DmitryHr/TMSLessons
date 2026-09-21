package additionTask.hospital.patient;

import additionTask.hospital.doctor.Dentist;
import additionTask.hospital.doctor.Physician;
import additionTask.hospital.doctor.Surgeon;
import additionTask.hospital.plan.TreatmentPlan;

public class Patient {

    private String name;
    private String surName;
    private int num;
    TreatmentPlan treatmentPlan;
    private final Surgeon surgeon = new Surgeon();
    private final Dentist dentist = new Dentist();
    private final Physician physician = new Physician();

    public Patient(String name, String surName, TreatmentPlan treatmentPlan) {
        this.name = name;
        this.surName = surName;
        this.treatmentPlan = treatmentPlan;
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
        System.out.println("Уваженмый " + getSurname() + " " + getName());
    }

    public void doctorIsOrder() {
        if (num == 1) {
            printFio();
            surgeon.toTreat();
        } else if (num == 2) {
            printFio();
            dentist.toTreat();
        } else {
            printFio();
            physician.toTreat();
        }
    }
}
