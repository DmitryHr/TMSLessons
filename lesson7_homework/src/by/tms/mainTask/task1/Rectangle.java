package by.tms.mainTask.task1;

public class Rectangle extends Treangle{

    public  Rectangle(double sideA, double sideB){
        super(sideA, sideB, 0);
    }

    public double area(){
        setSumm(getSideA() * getSideB());
        return getSumm();
    }

    public double perimetr() {
        setSumm((getSideA() + getSideB())*2);
        return getSumm();
    }
}
