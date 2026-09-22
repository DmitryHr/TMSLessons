package by.tms.inheritance;

import by.tms.inheritance.interfaces.Book;
import by.tms.inheritance.interfaces.Printable;
import by.tms.inheritance.model.Employee;
import by.tms.inheritance.model.Person;

public class Main {
    static void main() {
        //test();
        interfacesTest();
    }

    private static void test() {
        Employee employee = new Employee("Arthur", "Pupkin", "Apple");
        employee.displayInfo();

        Person person = new Person("John", "Doe");
        //person.address = "address";
        //person.age = 10;
        person.phone = "phone";

        String speciesName = person.getSpeciesName();
        System.out.println(speciesName);

        //System.out.println(person.address);
        //System.out.println(person.age);
        System.out.println(person.phone);

        //Human human = new Human("caucasian");
    }

    private static void interfacesTest() {
        Printable book = new Book();
        book.print();

        Printable anonym = new Printable() {
            @Override
            public void print() {

            }
        };
    }
}