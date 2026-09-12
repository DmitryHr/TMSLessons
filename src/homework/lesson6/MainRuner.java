package homework.lesson6;

import homework.lesson6.mainTask.CreditCard;

import java.util.Scanner;

public class MainRuner {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        CreditCard creditCard1 = new CreditCard();
        CreditCard creditCard2 = new CreditCard();
        CreditCard creditCard3 = new CreditCard();
        creditCard1.setNumberCart(1);
        creditCard1.setMoney(200);

        creditCard2.setNumberCart(2);
        creditCard2.setMoney(400);

        creditCard3.setNumberCart(3);
        creditCard3.setMoney(700);
        //пополнение карт деньгами
        creditCard1.setMoney(scanner.nextDouble());
        creditCard1.methodPutMoney(creditCard1.getNumberCart(), creditCard1.getMoney());
        creditCard2.methodPutMoney(creditCard2.getNumberCart(), creditCard2.getMoney());
        creditCard3.methodGetMoney(creditCard3.getNumberCart(), creditCard3.getMoney());
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
