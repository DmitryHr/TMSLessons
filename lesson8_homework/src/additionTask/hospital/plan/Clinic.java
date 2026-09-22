package additionTask.hospital.plan;

import additionTask.hospital.doctor.Dentist;
import additionTask.hospital.doctor.Physician;
import additionTask.hospital.doctor.Surgeon;
import additionTask.hospital.patient.Patient;

public class Clinic {

    private Surgeon surgeon;
    private Dentist dentist;
    private Physician physician;
    TreatmentPlan treatmentPlan;
    Patient patient;

    public Clinic (Patient patient, TreatmentPlan treatmentPlan){
        this.patient = patient;
        this.treatmentPlan = treatmentPlan;
    }

    public void doctorIsOrder() {
        switch (treatmentPlan.getCodeTreatment()){
            case 1 -> surgeon = new Surgeon();
            case 2 -> dentist = new Dentist();
            default -> physician = new Physician();
        }
        patient.printFio();
        surgeon.toTreat();
    }
}
