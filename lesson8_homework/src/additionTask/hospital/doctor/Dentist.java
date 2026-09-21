package additionTask.hospital.doctor;

public class Dentist implements Doctor {
    @Override
    public void toTreat() {
        System.out.println("вас направили к дантисту");
    }
}
