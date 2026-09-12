package homework.lesson6.mainTask;

public class CreditCardFail {
    int [] numberCard = new int[3];
    double[] money =new double[3];

    public void toppicUpCards(){
        for(int index=0; index < numberCard.length; index ++){
            numberCard[index] = index+1;
            money[index] = 100;
        }
    }

    public void putMoney(int number, double money){
            if (number != 0 && number <= 3) {
                this.money[number - 1] += money;
                return;
            } else {
                System.out.println("Веденной карты не существует. Повторите  попытку");
            }
    }

    public void getMoney(int number, double money){
       if (money > this.money[number-1]){
            System.out.println("Для карты " +number+ " Введена сумма больше чем есть на карте");
        }
        else if(number != 0 && number <= 3){
            this.money[number-1] -= money;
        }
        else {
            System.out.println("Веденной карты не существует");
        }
    }

    public void informationAboutCards() {
        for (int index =0; index < numberCard.length; index++){
            System.out.print("Баланс карты " + (index+1) + ": ");
            System.out.println(this.money[index]);
        }
    }



}
