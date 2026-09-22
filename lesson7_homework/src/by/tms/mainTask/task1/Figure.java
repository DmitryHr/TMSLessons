package by.tms.mainTask.task1;

public class Figure {

    private double sideA;
    private double sideB;
    private double summ;

    public Figure(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSumm() {
        return summ;
    }

    public void setSumm(double summ) {
        this.summ = summ;
    }

    public double area() {
        return getSumm();
    }

    ;

    public double perimetr() {
        return getSumm();
    }

    ;
}
