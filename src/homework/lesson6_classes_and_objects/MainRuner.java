package homework.lesson6_classes_and_objects;

import homework.lesson6_classes_and_objects.additionalTask.Bankomat.Atm;
import homework.lesson6_classes_and_objects.additionalTask.comp.Computer;
import homework.lesson6_classes_and_objects.additionalTask.comp.HddDisk;
import homework.lesson6_classes_and_objects.additionalTask.comp.Ram;
import homework.lesson6_classes_and_objects.mainTask.CreditCard;

import java.util.Scanner;

public class MainRuner {
    public static void main(String[] args) {

        /*
        Задание 1. Класс CreditCard
         */
        CreditCard creditCard1 = new CreditCard(1, 100);
        CreditCard creditCard2 = new CreditCard(2, 200);
        CreditCard creditCard3 = new CreditCard(3, 300);

        creditCard1.methodPutMoney(200);
        creditCard2.methodPutMoney(50);
        creditCard3.methodGetMoney(500);
        creditCard1.informationCard();
        creditCard2.informationCard();
        creditCard3.informationCard();

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

          /*
        Дополнительное задание
        Задание 2. Банкомат АТМ
         */
        int selectionOfBancnote20;
        int selectionOfBancnote50;
        int selectionOfBancnote100;
        int takeMoney;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите количество купюр наминолаом 20. От 0 до бесконечность, где 0 означает, что таких купюр нет");
        selectionOfBancnote20 = scanner.nextInt();
        System.out.println("Выберите количество купюр наминолаом 50. От 0 до бесконечность, где 0 означает, что таких купюр нет");
        selectionOfBancnote50 = scanner.nextInt();
        System.out.println("Выберите количество купюр наминолаом 100. От 0 до бесконечность, где 0 означает, что таких купюр нет");
        selectionOfBancnote100 = scanner.nextInt();

        Atm atm = new Atm(selectionOfBancnote20, selectionOfBancnote50, selectionOfBancnote100);
        System.out.println(atm.addMoneyInBancomat());
        System.out.println("Введите сумму, которую хотите снять");
        takeMoney = scanner.nextInt();
        atm.takeOutMoney(takeMoney);

    }
}
