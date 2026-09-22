package by.tms.inheritance.interfaces;

public class InterfaceApplication {
    static void main() {
        BookWorkshop bookWorkshop = new BookWorkshop();
        bookWorkshop.work(new Book());
        bookWorkshop.work(new Paper());
    }
}