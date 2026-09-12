package homework.lesson6.mainTask;

public class CreditCard {
    private int numberCart;
    private double money;

    public int getNumberCart() {
        return numberCart;
    }

    public double getMoney() {
        return money;
    }

    public void setNumberCart(int numberCart) {
        this.numberCart = numberCart;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void methodPutMoney(int numberCart, double money){
       this.numberCart = numberCart;
        this.money += money;
    }

    public void methodGetMoney(int numberCart, double money){
        this.numberCart = numberCart;
        this.money -= money;
    }

    public void informationCard(){
        System.out.println("Баланс карты " + getNumberCart() + " состовляет " + getMoney() + "$");
    }
}
