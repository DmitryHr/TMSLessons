package bu.edu.java;

public class Main{
    static void main() {
        MyPane.showMyMessage("Всем  привет!");
        int number;

        number = MyPane.getInteger("Введите целое число");
        String text = "Числа от 1 до "+ number+ ":\n";

        for (int k=1; k<=number; k++){
            text += k+ " ";
        }

        MyPane.showMyMessage(text, "Целые числа");
    }
}