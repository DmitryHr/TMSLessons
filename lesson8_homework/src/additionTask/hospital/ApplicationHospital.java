package additionTask.hospital;

import additionTask.hospital.patient.Patient;
import additionTask.hospital.plan.Clinic;
import additionTask.hospital.plan.TreatmentPlan;

public class ApplicationHospital {
    static void main() {

        TreatmentPlan treatmentPlan = new TreatmentPlan(1);
        Patient patient = new Patient("Иван", "иванов");
        Clinic clinic = new Clinic(patient, treatmentPlan);
        clinic.doctorIsOrder();
    }
}
