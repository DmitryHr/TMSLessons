package by.tms.mainTask.task1;

public class Treangle extends Figure{

    double sideC;

    public Treangle(double sideA, double sideB, double sideC){
        super(sideA, sideB);
        this.sideC = sideC;
    }
    @Override
    public double area(){
         setSumm((getSideA() + getSideB() + sideC)/2);
         return  getSumm();
    }

    @Override
    public double perimetr(){
        setSumm(getSideA() + getSideB() + sideC);
        return getSumm();
    }
}
