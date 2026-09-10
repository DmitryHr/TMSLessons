package homework.lesson2.part1;

public class StreetTemperature {
    public String stretTemperature(int degree){
        String temperature = "";
        if(degree> -5){
            temperature = "Тепло";
            System.out.println(temperature);
        } else if (degree >=-5 | degree >-20) {
            temperature = "Нормально";
            System.out.println(temperature);
        }
        else if (degree <= -20){
            temperature = "Холодно";
            System.out.println(temperature);
        }
        else{
            System.out.println("Вы ввели неверное значение");
        }
        return temperature;
    }
}
