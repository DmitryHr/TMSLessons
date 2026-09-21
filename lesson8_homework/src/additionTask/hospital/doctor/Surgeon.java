package additionTask.hospital.doctor;

public class Surgeon implements Doctor {

    @Override
    public void toTreat() {
        System.out.println("вас направили к хирургу");
    }
}
