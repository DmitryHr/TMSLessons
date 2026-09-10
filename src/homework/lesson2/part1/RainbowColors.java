package homework.lesson2.part1;

public class RainbowColors {
    public String rainbowColor(int numColor){
        String  color  = "";
        switch (numColor){
            case 1 -> color = "красный";
            case 2 -> color = "оранжевый";
            case 3 -> color = "желтый";
            case 4 -> color = "зеленый";
            case 5 -> color = "голубой";
            case 6 -> color = "синий";
            case 7 -> color ="фиолетовый";
            default -> System.out.println("Вы  ввели значение, которое попадает в диапазон от 1  до 7");
        }
        return color;
    }

    public String rainbowColorV2(int numColor){
        return switch(numColor){
            case 1 -> "красный";
            case 2 -> "оранжевый";
            case 3 -> "желтый";
            case 4 -> "зеленый";
            case 5 -> "голубой";
            case 6 -> "синий";
            case 7 -> "фиолетовый";
            default -> {
                System.out.println("Вы  ввели значение, которое попадает в диапазон от 1  до 7");
                yield "Данного цвета по введенному номеру нет в списке цветов радуги";
            }
        };
    }
}
