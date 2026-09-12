package homework.lesson6;

import homework.lesson6.mainTask.CreditCard;

import java.util.Scanner;

public class MainRuner {
    static void main() {

        CreditCard creditCard = new CreditCard();
        Scanner scanner = new Scanner(System.in);
        //пополнение карт деньгами
       creditCard.toppicUpCards();
       System.out.println("Введите номер карты (1,2,3) на которую хотите положить деньги и укажите сумму");
       creditCard.putMoney(scanner.nextInt(), scanner.nextDouble());
        System.out.println("Введите номер карты (1,2,3) на которую хотите положить деньги и укажите сумму");
        creditCard.putMoney(scanner.nextInt(), scanner.nextDouble());
        System.out.println("Введите номер карты (1,2,3) с которой хотите снять деньги и укажите сумму");
       creditCard.getMoney(scanner.nextInt(), scanner.nextDouble());
       creditCard.informationAboutCards();

    }
}
