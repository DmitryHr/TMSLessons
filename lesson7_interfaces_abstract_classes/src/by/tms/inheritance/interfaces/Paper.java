package by.tms.inheritance.interfaces;

public class Paper implements Printable{

    @Override
    public void print() {
        System.out.println("print paper!");
    }
}