package homework.lesson2.part1;

public class SeasoneSwitchModern {
    String seasone;

    public String seasoneSwitchModern(int numMonth){
        switch (numMonth){
            case 12, 1, 2 -> seasone ="Зима";
            case 3, 4, 5 -> seasone ="Весна";
            case 6, 7, 8 -> seasone ="Лето";
            case 9, 10, 11 -> seasone ="Осень";
            default -> seasone = "Выввели неверное значение";
        }
        return seasone;
    }
}
