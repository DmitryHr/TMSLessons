package homework.lesson6_classes_and_objects.additionalTask.Bankomat;

import java.util.Scanner;

public class Atm {
    private int banknote20 = 0;
    private int banknote50 = 0;
    private int banknote100= 0;
    private int sum = 0;

    public int getBanknote20() {
        return banknote20;
    }

    public void setBanknote20(int banknote20) {
        this.banknote20 = banknote20;
    }

    public int getBanknote50() {
        return banknote50;
    }

    public void setBanknote50(int banknote50) {
        this.banknote50 = banknote50;
    }

    public int getBanknote100() {
        return banknote100;
    }

    public void setBanknote100(int banknote100) {
        this.banknote100 = banknote100;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public Atm(int banknote20, int banknote50, int banknote100){
        setBanknote20(banknote20);
        setBanknote50(banknote50);
        setBanknote100(banknote100);

    }

    public int addMoneyInBancomat(){
        if (getBanknote20() != 0){
           setSum(getBanknote20()*20);
        }

        if(getBanknote50() !=0){
            setSum(getBanknote50()*50);
        }
        if(getBanknote100() !=0){
            setSum(getBanknote100()*100);
        }

        if(getBanknote20() == 0 & getBanknote50() == 0 & getBanknote100() == 0 ){
            System.out.println("Вы ничего не положили на счет");
        }
        return getSum();
    }

    public boolean takeOutMoney(int amount){
        if (amount <= 0) {
            return false;
        }

        int max100 = Math.min(getBanknote100(), amount / 100);

        for (int give100 = max100; give100 >= 0; give100--) {
            int remainderAfter100 = amount - give100 * 100;
            int max50 = Math.min(getBanknote50(), remainderAfter100 / 50);

            for (int give50 = max50; give50 >= 0; give50--) {
                int remainderAfter50 = remainderAfter100 - give50 * 50;

                if (remainderAfter50 % 20 != 0) {
                    continue;
                }

                int give20 = remainderAfter50 / 20;

                if (give20 <= getBanknote20()) {
                    setBanknote100(getBanknote100()- give100);
                    setBanknote50(getBanknote50()- give50);
                    setBanknote20(getBanknote20()- give20);

                    System.out.printf(
                            "Выдано: 100 x %d, 50 x %d, 20 x %d%n",
                            give100, give50, give20
                    );
                    return true;
                }
            }
        }

        return false;
    }
}
