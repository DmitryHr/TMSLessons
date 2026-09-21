package additionTask.hospital;

import additionTask.hospital.patient.Patient;
import additionTask.hospital.plan.TreatmentPlan;

public class ApplicationHospital {
    static void main() {

        TreatmentPlan treatmentPlan = new TreatmentPlan(2);
        Patient patient = new Patient("Иван", "иванов", treatmentPlan);
        patient.doctorIsOrder();
    }
}
