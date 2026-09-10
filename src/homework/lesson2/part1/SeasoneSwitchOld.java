package homework.lesson2.part1;

public class SeasoneSwitchOld {
    public String  methodSeasoneSwitchOld(int  numMonth){
        //int numMonth =1;
        String seasone;

        switch (numMonth){
            case 12: seasone ="Зима";
            break;
            case 1: seasone ="Зима";
                break;
            case 2: seasone ="Зима";
                break;
            case 3: seasone ="Весна";
                break;
            case 4: seasone ="Весна";
                break;
            case 5: seasone ="Весна";
                break;
            case 6: seasone ="Лето";
                break;
            case 7: seasone ="Лето";
                break;
            case 8: seasone ="Лето";
                break;
            case 9: seasone ="Осень";
                break;
            case 10: seasone ="Осень";
                break;
            case 11: seasone ="Осень";
                break;
            default: seasone  = "Вы ввели неправильное значение";
        }
        return seasone;
    }


        }
