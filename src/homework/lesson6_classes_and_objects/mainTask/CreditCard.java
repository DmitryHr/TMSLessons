package homework.lesson6_classes_and_objects.mainTask;

public class CreditCard {
    private int numberCart;
    private double money;

    public CreditCard(int creditCard, double moneyOnCard){
        this.numberCart = creditCard;
        this.money = moneyOnCard;
    }

    public void methodPutMoney(double money){
       this.money += money;
    }

    public void methodGetMoney(double money){
        if(this.money >= money){
        this.money -= money;}
        else {
            System.out.println("На карте " +numberCart+ " недостаточно средств");
        }
    }

    public void informationCard(){
        System.out.println("Баланс карты " + numberCart + " состовляет " + money + " $");
    }
}
