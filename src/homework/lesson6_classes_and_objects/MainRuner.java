package homework.lesson6_classes_and_objects;

import homework.lesson6_classes_and_objects.additionalTask.comp.Computer;
import homework.lesson6_classes_and_objects.additionalTask.comp.HddDisk;
import homework.lesson6_classes_and_objects.additionalTask.comp.Ram;
import homework.lesson6_classes_and_objects.mainTask.CreditCard;

import java.util.Scanner;

public class MainRuner {
    static void main(String[] args) {

        /*
        Задание 1. Класс CreditCard
         */
//        CreditCard creditCard1 = new CreditCard(1, 100);
//        CreditCard creditCard2 = new CreditCard(2, 200);
//        CreditCard creditCard3 = new CreditCard(3, 300);
//
//        creditCard1.methodPutMoney(200);
//        creditCard2.methodPutMoney(50);
//        creditCard3.methodGetMoney(500);
//        creditCard1.informationCard();
//        creditCard2.informationCard();
//        creditCard3.informationCard();

        /*
        Дополнительное задание
        Задание 1. Класс Computer
         */
        HddDisk hdd = new HddDisk("Seagate", 4000, "Внешний");
        Ram ram = new Ram("SK Hynix", 64);

        Computer computer1 = new Computer(5000, "Computer1");
        computer1.information();
        Computer computer2 = new Computer(6000, "Computer2", hdd, ram);
        computer2.information();

    }
}
