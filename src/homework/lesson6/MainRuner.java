package homework.lesson6;

import homework.lesson6.mainTask.CreditCard;

import java.util.Scanner;

public class MainRuner {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        CreditCard creditCard1 = new CreditCard(1, 100);
        CreditCard creditCard2 = new CreditCard(2, 200);
        CreditCard creditCard3 = new CreditCard(3, 300);

        creditCard1.methodPutMoney(200);
        creditCard2.methodPutMoney(50);
        creditCard3.methodGetMoney(500);
        creditCard1.informationCard();
        creditCard2.informationCard();
        creditCard3.informationCard();



//       creditCard.toppicUpCards();
//       System.out.println("Введите номер карты (1,2,3) на которую хотите положить деньги и укажите сумму");
//       creditCard.putMoney(scanner.nextInt(), scanner.nextDouble());
//        System.out.println("Введите номер карты (1,2,3) на которую хотите положить деньги и укажите сумму");
//        creditCard.putMoney(scanner.nextInt(), scanner.nextDouble());
//        System.out.println("Введите номер карты (1,2,3) с которой хотите снять деньги и укажите сумму");
//       creditCard.getMoney(scanner.nextInt(), scanner.nextDouble());
//       creditCard.informationAboutCards();

    }
}
