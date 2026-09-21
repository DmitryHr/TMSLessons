package by.tms.mainTask.task1;

public class Circle extends Rectangle {

    double radius;

    public Circle(double radius) {
        //Здесь наследуется родительский конструктор.
        super(0, 0);
        this.radius = radius;
    }

    public double area() {
        setSumm(3.14 * (radius * radius));
        return getSumm();
    }

    public double perimetr() {
        setSumm(2 * 3.14 * radius);
        return getSumm();
    }
}
