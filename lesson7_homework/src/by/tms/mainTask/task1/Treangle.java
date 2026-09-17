package by.tms.mainTask.task1;

public class Treangle extends Figure{

    public Treangle(double sideA, double sideB, double sideC){
        setSideA(sideA);
        setSideB(sideB);
        setSideC(sideC);
    }

    public double area(){
         setSumm((getSideA() + getSideB() + getSideC())/2);
        return getSumm();
    }

    public double perimetr(){
        setSumm(getSideA() + getSideB() + getSideC());
        return getSumm();
    }
}
