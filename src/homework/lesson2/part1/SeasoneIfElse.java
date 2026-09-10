package homework.lesson2.part1;

public class SeasoneIfElse {
    public String checkSeasone(int numMonth){
        String seasone;
        if(numMonth ==12 | numMonth ==1 | numMonth ==2){
            seasone = "Зима";
        }
        else if (numMonth == 3| numMonth == 4| numMonth == 5) {
            seasone = "Весна";
                    }
        else if (numMonth == 6| numMonth == 7| numMonth == 8) {
            seasone = "Лето";
                    }
        else if (numMonth == 9| numMonth == 10| numMonth == 11) {
            seasone = "Осень";
                    }
        else {seasone = "Вы ввели неверное значение";}
        return seasone;
    }

}
