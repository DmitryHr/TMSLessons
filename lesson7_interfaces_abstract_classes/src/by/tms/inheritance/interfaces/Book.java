package by.tms.inheritance.interfaces;

public class Book implements Printable {

    @Override
    public void print() {
        System.out.println("Empty book print!");
    }
}